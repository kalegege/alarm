<%--
  Created by IntelliJ IDEA.
  User: kale
  Date: 2016/12/22
  Time: 下午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/raphael.js"></script>
    <script type="text/javascript" src="../js/chinamapPath.js"></script>
</head>
<body>
<div id="header">
    <div id="logo"><h1><a href="http://www.helloweba.com" title="返回helloweba首页">helloweba</a></h1></div>
    <div class="demo_topad"><script src="/js/ad_js/demo_topad.js" type="text/javascript"></script></div>
</div>

<div id="main">
    <h2 class="top_title"><a href="http://www.helloweba.com/view-blog-242.html">使用raphael.js绘制中国地图</a></h2>
    <div class="demo">
        <div id="map"></div>

    </div>

    <br/><div class="ad_76090"><script src="/js/ad_js/ad_demo.js" type="text/javascript"></script></div><br/>
</div>

<script type="text/javascript">
    window.onload = function () {
        var R = Raphael("map", 600, 500);
        //调用绘制地图方法
        paintMap(R);

        var textAttr = {
            "fill": "#000",
            "font-size": "12px",
            "cursor": "pointer"
        };


        for (var state in china) {
            china[state]['path'].color = Raphael.getColor(0.9);

            (function (st, state) {

                //获取当前图形的中心坐标
                var xx = st.getBBox().x + (st.getBBox().width / 2);
                var yy = st.getBBox().y + (st.getBBox().height / 2);

                //***修改部分地图文字偏移坐标
                switch (china[state]['name']) {
                    case "江苏":
                        xx += 5;
                        yy -= 10;
                        break;
                    case "河北":
                        xx -= 10;
                        yy += 20;
                        break;
                    case "天津":
                        xx += 10;
                        yy += 10;
                        break;
                    case "上海":
                        xx += 10;
                        break;
                    case "广东":
                        yy -= 10;
                        break;
                    case "澳门":
                        yy += 10;
                        break;
                    case "香港":
                        xx += 20;
                        yy += 5;
                        break;
                    case "甘肃":
                        xx -= 40;
                        yy -= 30;
                        break;
                    case "陕西":
                        xx += 5;
                        yy += 10;
                        break;
                    case "内蒙古":
                        xx -= 15;
                        yy += 65;
                        break;
                    default:
                }
                //写入文字
                china[state]['text'] = R.text(xx, yy, china[state]['name']).attr(textAttr);

                st[0].onmouseover = function () {
                    st.animate({fill: st.color, stroke: "#eee"}, 500);
                    china[state]['text'].toFront();
                    R.safari();
                };
                st[0].onmouseout = function () {
                    st.animate({fill: "#97d6f5", stroke: "#eee"}, 500);
                    china[state]['text'].toFront();
                    R.safari();
                };

            })(china[state]['path'], state);
        }
    }
</script>

<div id="footer">
    <p>Powered by helloweba.com  允许转载、修改和使用本站的DEMO，但请注明出处：<a href="http://www.helloweba.com">www.helloweba.com</a></p>
</div>
<p id="stat"><script type="text/javascript" src="/js/tongji.js"></script></p>
</body>
</html>
