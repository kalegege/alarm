<%--
  Created by IntelliJ IDEA.
  User: kale
  Date: 2017/8/12
  Time: 上午9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mystyle.css" type="text/css" charset="utf-8"/>


</head>
<body>
    <table class="mytable">
        <thead>
        <tr>
            <th width="150">当前在线玩家数</th>
            <th width="150">当前在线房间数</th>
            <th width="150">当前等待开局数</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${players}</td>
            <td>${onlineRooms}</td>
            <td>${waitRooms}</td>
        </tr>
        </tbody>
    </table>

</body>
</html>
