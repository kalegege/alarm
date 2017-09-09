<%--
  Created by IntelliJ IDEA.
  User: kale
  Date: 2017/8/12
  Time: 上午9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dataTables.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/d3.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mystyle.css" type="text/css" charset="utf-8"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.dataTables.css" type="text/css"/>

</head>
<body>
<div>
    <input id="tableData" type="hidden" value="${tableData}"/>
</div>
<div>
<table id="saleTable">
    <thead>
    <tr>
        <th>发展人姓名</th>
        <th>发展人id</th>
        <th>发展群主数量</th>
        <th>群主购钻数量</th>
        <th>群主被赠钻数量</th>
        <th>群主被调钻数量</th>
        <th>群主划拨钻石数量</th>
        <th>群主代开房消耗钻石数量</th>
        <th>群主当前钻石余量</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="p">
        <tr>
            <td>${p.发展人姓名}</td>
            <td>${p.发展人id}</td>
            <td>${p.发展群主数量}</td>
            <td>${p.群主购钻数量}</td>
            <td>${p.群主被赠钻数量}</td>
            <td>${p.群主被调钻数量}</td>
            <td>${p.群主划拨钻石数量}</td>
            <td>${p.群主代开房消耗钻石数量}</td>
            <td>${p.群主当前钻石余量}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>

<div class="table"></div>

<script type="text/javascript">

    $(document).ready(function () {
        $('#saleTable').DataTable({
            language: {
                "sProcessing": "处理中...",
                "sLengthMenu": "显示 _MENU_ 项结果",
                "sZeroRecords": "没有匹配结果",
                "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
                "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
                "sInfoPostFix": "",
                "sSearch": "搜索:",
                "sUrl": "",
                "sEmptyTable": "表中数据为空",
                "sLoadingRecords": "载入中...",
                "sInfoThousands": ",",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "上页",
                    "sNext": "下页",
                    "sLast": "末页"
                },
                "oAria": {
                    "sSortAscending": ": 以升序排列此列",
                    "sSortDescending": ": 以降序排列此列"
                }
            },
//            ajax:{
//                url:'http://192.168.1.104:5678/alarm/getActors',
//                data:'data'
//            },
            ordering: false
//            data: data,
//            columns: [
//                {data: "name"}, {data: "pId"}, {data: "numDevelop"}, {data: "numBuy"}, {data: "numSend"}, {data: "numArrange"}
//            ]
        });
    });

    action1();

</script>

</body>
</html>
