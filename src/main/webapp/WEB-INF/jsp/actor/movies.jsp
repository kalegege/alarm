<%--
  Created by IntelliJ IDEA.
  User: kale
  Date: 2018/7/15
  Time: 上午9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/actor/movies.css" />
    <script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/js/actor/movies.js" type="text/javascript" charset="utf-8"></script>
    <title>Title</title>
</head>
<body>
    <div>
        <label>请输入电影名字</label>
        <input type="text" id="name">
        <button id="submit-name">确定</button>
    </div>
    <div>
        <label>请输入时间</label>
        <input type="text" id="time">
        <button id="submit-time">确定</button>
        <button id="submit-exceed">快进</button>
    </div>
    <div>
        <label>当前时间</label>
        <input type="text" id="ctime">
    </div>
    <video controls class="player" id="myVideo">
        <source type="video/mp4" src="${url}" />
    </video>
</body>
</html>
