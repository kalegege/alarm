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

    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mystyle.css" type="text/css"/>--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.dataTables.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/BXUI.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/BXUI.portal.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/common_form.css">

</head>
<body>
<header>
    <div class="header-line"></div>
</header>
<h1>登录页面</h1>
<div class="content">
    <input type="hidden" value="<%=basePath%>" id="basePath"/>
    <h1 class="content-title">登录</h1>
    <div class="content-form">
        <form action="<%=basePath%>doLogin.html" method="post" id="registerForm">
            <div id="change_margin_1">
                <input class="user" type="text" name="userName" placeholder="请输入用户名" onblur="oBlur_1()"
                       onfocus="oFocus_1()">
            </div>
            <!-- input的value为空时弹出提醒 -->
            <p id="remind_1"></p>
            <div id="change_margin_2">
                <input class="password" type="password" name="password" placeholder="请输入密码" onblur="oBlur_2()"
                       onfocus="oFocus_2()">
            </div>

            <img src="kaptcha.jpg" id="kaptchaImage"/>
            <input type="text" value=""/>

            <!-- input的value为空时弹出提醒 -->
            <p id="remind_2">${message}</p>
            <div id="change_margin_3">
                <input class="content-form-signup" type="submit" value="登录">
            </div>
        </form>
    </div>
    <div class="content-login-description">没有账户？</div>
    <%--<div><a class="content-login-link" href="sign_up.html">注册</a></div>--%>
</div>
<script src="js/common_form_test.js"></script>
<script type="text/javascript">
    $(function () {
        $('#kaptchaImage').click(function () {
            $(this).attr('src', '<%=basePath%>kaptcha.jpg?' + Math.floor(Math.random() * 100));
        })
    });
</script>
</body>
</html>
