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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/tcal.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/myAction.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/tcal.css" type="text/css" charset="utf-8"/>


</head>
<body>
<div class="myMenu">
    <div>
        <input type="hidden" value="${type}" id="type"/>
        <label>开始时间</label>
        <input type="text" name="date" class="tcal" value="" id="startDate"/>
        <label>结束时间</label>
        <input type="text" name="date" class="tcal" value="" id="stopDate"/>
        <label>地推姓名</label>
        <select id="parentId" >
            <option value="10" selected="selected">所有</option>
            <option value="20">张三</option>
            <option value="30">李四</option>
            <option value="40">王五</option>
        </select>
        <label>群主姓名</label>
        <select id="opId" >
            <option value="10" selected="selected">所有</option>
            <option value="20">张三2</option>
            <option value="30">李四2</option>
            <option value="40">王五2</option>
        </select>
        <button onclick="searchDetail()">查询</button>
    </div>
</div>
<div class="content"></div>
<script type="application/javascript">
    formInit();
</script>

</body>
</html>
