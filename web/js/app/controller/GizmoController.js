Ext.define('gizmoManager.controller.GizmoController', {
    extend: 'Ext.app.Controller',
    stores: ['Gizmo'],
    views: ['MainContainer'],

    refs:[
        {
            ref: 'mainContainer',
            selector: 'mainContainer'
        },
        {
            ref: 'editableGrid',
            selector: 'panel > gridpanel[name=editableGrid]'
        }
    ],

    init: function () {
        this.control({
            'mainContainer > gridpanel[name=editableGrid]' : {
                edit: function(editor, object) {
                    object.store.save();
                    object.store.commitChanges();
                },
                selectionchange: function(current, selections) {
                    this.getEditableGrid().down('button[action=remove]').setDisabled(selections.length == 0);
                }
            },
            'mainContainer > gridpanel > toolbar > button[action=add]' : {
                click: function(button) {
                    this.getGizmoStore().add(Ext.create('gizmoManager.model.Gizmo'));
                }
            },
            'mainContainer > gridpanel > toolbar > button[action=remove]' : {
                click: function(button) {
                    var selection = this.getEditableGrid().getSelectionModel(),
                        me = this;
                    Ext.each(selection.selected.items, function(gizmo) {
                        me.getGizmoStore().remove(gizmo);
                    });
                    me.getGizmoStore().sync();
                }
            }
        });
        this.getGizmoStore().load();
    }
});
