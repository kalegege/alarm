<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #content{
            margin-left: 320px;
            margin-top: 20px;
            width:985px;
            height: 380px;
        }
        #left{
            float: left;
            width: 720px;
            height:380px;
        }
        #left img{
            float: left;
            width: 720px;
            height:380px;
        }
        #right{
            float: right;
            width: 265px;
            height: 380px;
        }
        #right ul{
            list-style-type:none;
            margin:0;
            padding:0;
        }
        #right li{
            border-bottom: 1px solid #f0f0f0;
            background: #fbfbfb;
            color: gray;
            cursor: default;
            height: 46.5px;
            text-align: center;
            line-height: 2.5;
        }
        #gallery {
            width:1200px;
            height:300px;
            border: 1px ;
            margin-top: 20px;
            margin-left: 300px;
            padding:10px;
            list-style:none;
            background:#fff ;
        }
        #gallery li {
            float: left;
            margin: 10px;
        }
        #gallery li img{
            width: 180px;
            height: 240px;
        }
        #gallery li label{
            margin: 60px;
        }
    </style>
</head>
<body>
<div id="content">
    <div id="left">
        <img src="${pageContext.request.contextPath}/image/timg.jpg"   alt="海报" />
    </div>
    <div id="right">
        <ul>
            <li style="background-color: #41c5f6;color:#ffffff">怦然心动</li>
            <li>恐怖理发店</li>
            <li>星球大战外传：侠盗一号</li>
            <li>夜色人生</li>
            <li>健忘村</li>
            <li>我说的都是真的</li>
            <li>浪漫搭档</li>
            <li>玩命直播</li>
        </ul>
    </div>
</div>

<ul id="gallery">
    <li>
        <div>
            <img src="${pageContext.request.contextPath}/image/lyf.jpg"   alt="李易峰" />
        </div>
        <div>
        <label>李易峰</label>
        </div>
    </li>
    <li>
        <div>
            <img src="${pageContext.request.contextPath}/image/yy.jpg"  alt="杨洋" />
        </div>
        <div>
            <label>杨洋</label>
        </div>
    </li>
    <li>
        <div>
            <img src="${pageContext.request.contextPath}/image/zly.jpg"   alt="赵丽颖" />
        </div>
        <div>
            <label>赵丽颖</label>
        </div>
    </li>
    <li>
        <div>
            <img src="${pageContext.request.contextPath}/image/dlrb.jpg"   alt="迪丽热巴" />
        </div>
        <div>
            <label>迪丽热巴</label>
        </div>
    </li>
    <li>
        <div>
            <img src="${pageContext.request.contextPath}/image/xzq.jpg"   alt="薛之谦" />
        </div>
        <div>
            <label>薛之谦</label>
        </div>
    </li>
</ul>

</body>
</html>
