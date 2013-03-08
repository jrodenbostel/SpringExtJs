Ext.define('gizmoManager.view.MainViewport', {
    extend : 'Ext.container.Viewport',
    alias : 'widget.mainViewport',
    requires: [
        'gizmoManager.view.MainContainer'
    ],
    items : [{
        xtype : 'mainContainer'
    }]
});