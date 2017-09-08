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
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/tcal.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/myAction.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/tcal.css" type="text/css" charset="utf-8"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mystyle.css" type="text/css" charset="utf-8"/>

</head>
<body>
<input type="hidden" value="<%=basePath%>" id="basePath"/>
<div class="myMenu">
    <input type="hidden" value="${type}" id="type"/>
    <input type="hidden" value="${menu}" id="menu"/>
    <c:if test="${menu == 1}">
        <label>开始时间</label>
        <input type="text" name="date" class="tcal" value="" id="startDate"/>
        <label>结束时间</label>
        <input type="text" name="date" class="tcal" value="" id="stopDate"/>
    </c:if>
    <c:if test="${menu >= 4}">
        <label>地推姓名</label>
        <select id="parentId">
            <option value="0" selected="selected">所有</option>
            <c:forEach items="${ditui}" var="p">
                <option value="${p.发展人id}">${p.发展人姓名}</option>
            </c:forEach>
        </select>
    </c:if>
    <c:if test="${menu >= 3}">
        <label>群主姓名</label>
        <select id="opId">
            <option value="0" selected="selected">所有</option>
            <c:forEach items="${qunzhu}" var="p">
                <option value="${p.群主id}">${p.群主姓名}</option>
            </c:forEach>
        </select>
    </c:if>
    <button onclick="searchDetail()" <c:if test="${menu == 2}"> style="display:none" </c:if>>查询</button>
</div>
<div class="content"></div>
<script type="application/javascript">
    formInit();
    addChangeAction();
</script>
<c:if test="${menu == 2}">
    <script type="application/javascript">
        searchDetail();
    </script>
</c:if>

</body>
</html>
