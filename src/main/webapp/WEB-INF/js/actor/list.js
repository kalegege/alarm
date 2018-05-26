$(function(){

    InitGrid(1);
});

//实现对DataGird控件的绑定操作
function InitGrid(queryData) {
    $('#grid').datagrid({   //定位到Table标签，Table标签的ID是grid
        url: '/alarm/actor/getTableInfo',   //指向后台的Action来获取当前菜单的信息的Json格式的数据
        title: '功能菜单',
        iconCls: 'icon-view',
        height: 650,
        width: function () { return document.body.clientWidth * 0.9 },
        nowrap: true,
        autoRowHeight: false,
        striped: true,
        collapsible: true,
        pagination: true,
        pageSize: 100,
        pageList: [50,100,200],
        rownumbers: true,
        //sortName: 'ID',    //根据某个字段给easyUI排序
        sortOrder: 'asc',
        remoteSort: false,
        idField: 'id',
        queryParams: queryData,  //异步查询的参数
        columns: [[
            { field: 'ck', checkbox: true },   //选择
            { title: '姓名', field: 'name', width: 150 },
            { title: '区域', field: 'area', width: 200},
            { title: '数据来源', field: 'source', width: 80 },
            { title: '基础评分', field: 'num_base', width: 80 },
            { title: '状态', field: 'status', width: 80 },
            { title: '创建时间', field: 'ctime', width: 400 }
        ]],
        toolbar: [{
            id: 'btnAdd',
            text: '添加',
            iconCls: 'icon-add',
            handler: function () {
                ShowAddDialog();//实现添加记录的页面
            }
        }, '-', {
            id: 'btnEdit',
            text: '修改',
            iconCls: 'icon-edit',
            handler: function () {
                ShowEditOrViewDialog();//实现修改记录的方法
            }
        }, '-', {
            id: 'btnDelete',
            text: '删除',
            iconCls: 'icon-remove',
            handler: function () {
                Delete();//实现直接删除数据的方法
            }
        }, '-', {
            id: 'btnView',
            text: '查看',
            iconCls: 'icon-table',
            handler: function () {
                ShowEditOrViewDialog("view");//实现查看记录详细信息的方法
            }
        }, '-', {
            id: 'btnReload',
            text: '刷新',
            iconCls: 'icon-reload',
            handler: function () {
                //实现刷新栏目中的数据
                $("#grid").datagrid("reload");
            }
        }],
        onDblClickRow: function (rowIndex, rowData) {
            $('#grid').datagrid('uncheckAll');
            $('#grid').datagrid('checkRow', rowIndex);
            ShowEditOrViewDialog();
        }
    })
};