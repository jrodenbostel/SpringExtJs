Ext.define('gizmoManager.view.MainContainer', {
    extend: 'Ext.tab.Panel',
    alias: 'widget.mainContainer',
    title: 'Gizmo Manager',
    items:[
        {
            xtype: 'gridpanel',
            title: 'Gizmos',
            store: 'Gizmo',
            name: 'editableGrid',
            columns: [
                {text: 'ID', dataIndex: 'id', width: 300},
                {text: 'DESCRIPTION', dataIndex: 'description', width: 300,
                    editor: {
                        xtype: 'textfield',
                        allowBlank: false
                    }}
            ],
            columnLines: true,
            selModel: 'rowmodel',
            plugins: [
                Ext.create('Ext.grid.plugin.RowEditing', {
                    clicksToEdit: 1
                })
            ],
            // inline buttons
            dockedItems: [{
                xtype: 'toolbar',
                items: [{
                    action: 'add',
                    text:'Add Something'
                },'-',{
                    action: 'remove',
                    text:'Remove Something',
                    disabled: true
                }]
            }],

            width: 600,
            height: 300
        }
    ]
});

