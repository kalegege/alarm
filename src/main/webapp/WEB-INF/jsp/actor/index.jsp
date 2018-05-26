<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/themes/icon.css" />
    <script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="${pageContext.request.contextPath}/js/index.js" type="text/javascript" charset="utf-8"></script>--%>
    <title>艺人推荐系统管理后台</title>
</head>

<body>

<div class="easyui-layout" data-options="fit:true" style="width: 800px;height: 600px;">
    <!--顶部-->
    <div region="north" style="height: 70px;">
        <h1>艺人推荐系统管理后台</h1>
    </div>
    <!--左侧菜单start-->
    <div region="west" title="导航菜单" split="true" style="width: 200px;">
        <div class="easyui-panel" data-options="fit:true">
            <!--手风琴菜单-->
            <div class="easyui-accordion" data-options="multiple:true,fit:true">
                <div title="艺人推荐配置" data-options="iconCls:'icon-ok'" style="overflow:auto;padding:10px;">
                    <p>推荐配置列表</p>
                    <p onclick="addNewTab('推荐内容配置','index')">第一个推荐位</p>
                    <p onclick="addNewTab('第二个推荐位','test2')">第二个推荐位</p>
                    <p onclick="addNewTab('推荐内容显示','list')">推荐内容显示</p>
                    <p onclick="addNewTab('mane4','xxx.xxxController')">第四个推荐位</p>
                    <p onclick="addNewTab('name5','xxx.xxx.jsp')">第三个推荐位</p>
                </div>
                <div title="艺人相关性" style="padding:10px;">
                    <p onclick="addNewTab('艺人相关性查询','index')">艺人相关性查询</p>
                </div>
                <div title="资产信息" style="padding:10px;">
                    <p>资产信息查询</p>
                </div>
                <div title="用户行为数据" style="padding:10px;">
                    <p>用户行为数据查询</p>
                </div>
            </div>
            <!--手风琴菜单end-->
        </div>
    </div>
    <!--中间主要区域-->
    <div data-options="region:'center',split:true,fit:true">
        <div id="mainTabs" class="easyui-tabs" data-options="fit:true">
        </div>
    </div>
    <!--页脚-->
    <div region="south" style="text-align: center;height: 50px;">
        <h3>华数传媒网络有限公司</h3>
    </div>
</div>
</body>
<script>
    function addNewTab(tabname, url) {
        //创建一个新的窗口，在mainlayout上
        if(!$("#mainTabs").tabs('getTab', tabname)) {
            $("#mainTabs").tabs('add', {
                title: tabname,
                selected: true,
                closable: true,
                content: "<iframe src='" + 'http://localhost:8080/alarm/actor/' + url + "' style='width:100%;height:100%'  frameborder='no' border='0' marginwidth='0' marginheight='0' scrolling='yes' />"
            });
        } else {
            $('#mainTabs').tabs('select', tabname);
        }
    }
</script>
</html>
