<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 7:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/themes/default/easyui.css" type="text/css"/>
</head>
<body>
<div class="easyui-panel" title="第一个推荐位配置" style="width:100%;max-width:400px;padding:30px 60px;">
    <form id="ff" method="post">
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="name" style="width:100%" data-options="label:'艺人名称:',required:true">
        </div>
        <div style="margin-bottom:20px">
            <select class="easyui-combobox" name="area" label="区域" style="width:100%">
                <option value="hz">杭州</option>
                <option value="zg">中广</option>
                <option value="xj">新疆</option>
            </select>
        </div>
        <div style="margin-bottom:20px">
            <select class="easyui-combobox" name="language" label="推荐来源" style="width:100%">
                <option value="man">手动添加</option>
                <option value="cf">协同过滤</option>
                <option value="hot">热度推荐</option>
            </select>
        </div>
    </form>
    <div style="text-align:center;padding:5px 0">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">确定</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width:80px">取消</a>
    </div>
    <%--<div>--%>
        <%--<a href="#" class="easyui-linkbutton" iconCls="icon-ok" style="width:100%;height:32px">确定</a>--%>
    <%--</div>--%>
</div>
<%--<table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"--%>
       <%--data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">--%>
    <%--<thead>--%>
    <%--<tr>--%>
        <%--<th data-options="field:'itemid',width:80">Item ID</th>--%>
        <%--<th data-options="field:'productid',width:100">Product</th>--%>
        <%--<th data-options="field:'listprice',width:80,align:'right'">List Price</th>--%>
        <%--<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>--%>
        <%--<th data-options="field:'attr1',width:250">Attribute</th>--%>
        <%--<th data-options="field:'status',width:60,align:'center'">Status</th>--%>
    <%--</tr>--%>
    <%--</thead>--%>
<%--</table>--%>
</body>
</html>
