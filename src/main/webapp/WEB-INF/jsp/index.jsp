<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>推广人员统计表</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dataTables.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/BXUI.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/d3.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mystyle.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.dataTables.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/BXUI.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/BXUI.portal.css" type="text/css"/>

</head>
<body>
<h1>推广人员统计表</h1>
<input type="hidden" value="<%=basePath%>" id="basePath"/>
<div>
    <%--<input class="logout"  value="退出登录">--%>
    <a class="logout" href="<%=basePath%>logout">退出登录</a>
</div>
<script type="text/javascript">
    $(function () {
        BXUI.load("portal");
    });

</script>
</body>
</html>
