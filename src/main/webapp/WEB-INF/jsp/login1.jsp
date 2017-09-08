<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>推广人员统计表</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mystyle.css" type="text/css"/>

</head>
<body>
<header>
    <div class="header-line"></div>
</header>
<div class="loginModule">
    <input type="hidden" value="<%=basePath%>" id="basePath"/>
    <h1 class="title">登录</h1>

        <form action="<%=basePath%>login" method="post" >
            <div>
                <input class="input_user" name="userid" placeholder="用户名">
            </div>
            <div>
                <input class="input_passwd" name="passwd" type="password" placeholder="密码">
            </div>
            <div>
                <input class="submit" type="submit" value="登录">
            </div>
        </form>
</div>
</body>
</html>
