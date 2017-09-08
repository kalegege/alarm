/**
 * Created by kale on 2017/8/18.
 */
function search() {
    console.log("error");
    var url = $('#basePath').val() + "alarm/" + $('#type').val();
    var bodyContent = $.ajax({
        url: url,
        global: false,
        type: "POST",
        // data: ({
        //     id: this.getAttribute('row')
        // }),
        dataType: "html",
        async: false,
        success: function (msg) {
            $(".content").html(msg);
        }
    })
}

function searchDetail() {
    console.log("error");
    var startDate = $('#startDate').val() == null ? null : $('#startDate').val().trim();
    var stopDate = $('#stopDate').val() == null ? null : $('#stopDate').val().trim();
    var opId = $('#opId').val() == null ? null : $('#opId').val().trim();
    var parentId = $('#parentId').val() == null ? null : $('#parentId').val().trim();
    var data1 = {startDate: startDate, stopDate: stopDate, opId: opId, parentId: parentId}

    var url = $('#basePath').val() + "alarm/" + $('#type').val();

    var bodyContent = $.ajax({
        url: url,
        global: false,
        type: "POST",
        data: data1,
        dataType: "html",
        async: false,
        success: function (msg) {
            $(".content").html(msg);
        },
        error: function () {
            console.log("error");
        }
    })
}

function action1() {
    var startDate = $('#startDate').val() == null ? null : $('#startDate').val().trim();
    var stopDate = $('#stopDate').val() == null ? null : $('#stopDate').val().trim();
    var opId = $('#opId').val() == null ? null : $('#opId').val().trim();
    var parentId = $('#parentId').val() == null ? null : $('#parentId').val().trim();
    var data1 = {startDate: startDate, stopDate: stopDate, opName: opId, parentId: parentId};

    console.log("error");
    var url1 = $('#basePath').val() + "alarm/" + $('#type').val() + "Data";
    var bodyContent1 = $.ajax({
        // url: "/alarm/getTableData",
        url: url1,
        global: false,
        type: "POST",
        data: data1,
        dataType: "json",
        async: false,
        success: function (msg) {
            addLineTable(msg);
            // addPieTable(msg);
        }
    });
}

//饼图
function addPieTable(dataset) {
    var w = 800,
        h = 600;
    var outerRadius = w / 4,
        innerRadius = 0;

    var color = d3.scaleOrdinal(d3.schemeCategory10);

    // var dataset = [30, 10, 43, 55, 13];

    // var dataset=d1;

    // var dataset = [
    //     {
    //         id: 1,
    //         name: "李涛",
    //         pId: 4,
    //         numDevelop: 300,
    //         numBuy: 1000,
    //         numSend: 400,
    //         numArrange: 100
    //     }, {
    //         id: 2,
    //         name: "李涛4",
    //         pId: 5,
    //         numDevelop: 1300,
    //         numBuy: 2000,
    //         numSend: 1400,
    //         numArrange: 1400
    //     }, {
    //         id: 3,
    //         name: "李涛2",
    //         pId: 2,
    //         numDevelop: 800,
    //         numBuy: 1040,
    //         numSend: 450,
    //         numArrange: 900
    //     }
    // ];

    var pie = d3.pie()
        .value(function (d) {
            return d.num_develop;
        });

    var piedata = pie(dataset);

    console.log(piedata);

    var arc = d3.arc()
        .innerRadius(innerRadius)
        .outerRadius(outerRadius);

    var svg = d3.select(".table")
        .append("svg")
        .attr("width", w)
        .attr("height", h);

    var arcs = svg.selectAll("g")
        .data(piedata)
        .enter()
        .append("g")
        .attr("transform", "translate(" + (w * 3 / 8) + "," + (w * 3 / 8) + ")");

    arcs.append("path")
        .attr("fill", function (d, i) {
            return color(i);
        })
        .attr("d", function (d) {
            return arc(d);
        });


    arcs.append("text")
        .attr("transform", function (d) {
            var x = arc.centroid(d)[0] * 1.4;
            var y = arc.centroid(d)[1] * 1.4;
            return "translate(" + x + "," + y + ")";
        })
        .attr("text-anchor", "middle")
        .text(function (d) {
            var percent = Number(d.value) /
                d3.sum(dataset, function (d) {
                    return d.num_develop;
                }) * 100;
            return percent.toFixed(1) + "%";
        });

    arcs.append("line")
        .attr("stroke", "black")
        .attr("x1", function (d) {
            return arc.centroid(d)[0] * 2;
        })
        .attr("y1", function (d) {
            return arc.centroid(d)[1] * 2;
        })
        .attr("x2", function (d) {
            return arc.centroid(d)[0] * 2.2;
        })
        .attr("y2", function (d) {
            return arc.centroid(d)[1] * 2.2;
        });

    arcs.append("text")
        .attr("transform", function (d) {
            var x = arc.centroid(d)[0] * 2.5;
            var y = arc.centroid(d)[1] * 2.5;
            return "translate(" + x + "," + y + ")";
        })
        .attr("text-anchor", "middle")
        .text(function (d) {
            return d.data.name;
        });
}

function addLineTable() {
    var w = 800,
        h = 600;
    var outerRadius = w / 4,
        innerRadius = 0;

    var color = d3.scaleOrdinal(d3.schemeCategory10);


}
/**
 * 初始化日历
 */
function formInit() {
    $('#startDate').val(getDateString());
    $('#stopDate').val(getDateString());
}
/**
 * 获取当前日期以2017-08-01的格式
 * @returns {string}
 */
function getDateString() {
    var date = new Date();

    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var day = date.getDate();
    month = month < 10 ? "0" + month : month;
    day = day < 10 ? "0" + day : day;

    return year + "-" + month + "-" + day;

}
function getTimeString() {
    var time = new Date();

    var hours = time.getHours();
    var minutes = time.getMinutes();
    var seconds = time.getSeconds();

    hours = hours < 10 ? "0" + hours : hours;
    minutes = minutes < 10 ? "0" + minutes : minutes;
    seconds = seconds < 10 ? "0" + seconds : seconds;

    return hours + ":" + minutes + ":" + seconds;
}

/**
 * 添加折线图
 * @param dataset
 */
function addLineTable(dataset) {

    var width = 800,
        height = 600;

    // var dataset = [{
    //     name: "china",
    //     value: [{
    //         "login_time": 1506816000000,
    //         "number": 100
    //     }, {
    //         "login_time": 1506902400000,
    //         "number": 100
    //     }, {
    //         "login_time": 1506988800000,
    //         "number": 100
    //     }]
    // }, {
    //     name: "japan",
    //     value: [{
    //         "login_time": 1506816000000,
    //         "number": 200
    //     }, {
    //         "login_time": 1506902400000,
    //         "number": 300
    //     }, {
    //         "login_time": 1506988800000,
    //         "number": 400,
    //     }]
    // }];

    var padding = {top: 50, right: 50, bottom: 50, left: 50};

    //计算最大值
    var gdpMax = 0;
    for (var i = 0; i < dataset.length; i++) {
        var currGdp = d3.max(dataset[i].value, function (d) {
            return d.number;
        });
        if (currGdp > gdpMax) {
            gdpMax = currGdp;
        }
    }

    //计算时间最大最小
    var timeMin = dataset[0].value[0].login_time;
    var timeMax = dataset[0].value[dataset[0].value.length - 1].login_time;

    if (timeMin > timeMax) {
        var c = timeMin;
        timeMin = timeMax;
        timeMax = c;
    }

    var xScale = d3.scaleLinear()
        .domain([timeMin, timeMax])
        .range([0, width - padding.left - padding.right]);

    var yScale = d3.scaleLinear()
        .domain([0, gdpMax * 1.1])
        .range([height - padding.top - padding.bottom, 0]);

    var linePath = d3.line()
        .x(function (d) {
            console.log("xScale" + xScale(d.login_time));
            return xScale(d.login_time);
        })
        .y(function (d) {
            return yScale(d.number);
        });

    var colors = [d3.rgb(0, 0, 255), d3.rgb(0, 255, 0)];
    // var color = d3.scaleOrdinal(d3.schemeCategory10);

    var svg = d3.select(".table")
        .append("svg")
        .attr("width", width)
        .attr("height", height);

    svg.selectAll("path")
        .data(dataset)
        .enter()
        .append("path")
        .attr("transform", "translate(" + padding.left + "," + padding.top + ")")
        .attr("d", function (d) {
            return linePath(d.value);
        })
        .attr("fill", "none")
        .attr("stroke-width", 3)
        .attr("stroke", function (d, i) {
            return colors[0];
        });

    var xAxis = d3.axisBottom()
        .scale(xScale)
        // .ticks(5)
        .tickFormat(function (d) {
            return d3.timeFormat("%Y-%m-%d")(new Date(d));
        });

    var yAxis = d3.axisLeft()
        .scale(yScale);

    svg.append("g")
        .attr("class", "axis")
        .attr("transform", "translate(" + padding.left + "," + (height - padding.bottom) + ")")
        .call(xAxis);

    svg.append("g")
        .attr("class", "axis")
        .attr("transform", "translate(" + padding.left + "," + padding.top + ")")
        .call(yAxis);

    svg.append("rect")
        .attr("class", "overlay")
        .attr("x", padding.left)
        .attr("y", padding.top)
        .attr("width", width - padding.left - padding.right)
        .attr("height", height - padding.top - padding.bottom)
        .on("mouseover", function () {

            tooltip.style("left", (d3.event.pageX) + "px")
                .style("top", (d3.event.pageY + 20) + "px")
                .style("opacity", 1.0);
            vLine.style("display", "");
        })
        .on("mouseout", function () {

            tooltip.style("opacity", 0.0);
            vLine.style("display", "none");
        })
        .on("mousemove", mousemove1);
    //
    // var focusCircle=svg.append("g")
    //     .attr("class","focusCircle")
    //     .style("display","none");
    //
    // focusCircle.append("circle")
    //     .attr("r",4.5);
    //
    // focusCircle.append("text")
    //     .attr("dx",10)
    //     .attr("dy","1em");
    //
    // var focusLine=svg.append("g")
    //     .attr("class","focusLine")
    //     .style("display","none");
    //
    // var vLine=focusLine.append("line")
    //     .attr("stroke-dasharray",5)
    //     .attr("stroke","black");
    //
    // var hLine=focusLine.append("line")
    //     .attr("stroke-dasharray",5)
    //     .attr("stroke","black");

    function mousemove() {

        /*鼠标在透明区域调用*/
        var data = dataset[0].value;

        var mouseX = d3.mouse(this)[0] - padding.left;
        var mouseY = d3.mouse(this)[1] - padding.top;

        var x0 = xScale.invert(mouseX);
        var y0 = yScale.invert(mouseY);

        x0 = Math.round(x0);

        var bisect = d3.bisector(function (d) {
            return d[0];
        }).left;

        var index = bisect(data, x0);

        var x1 = data[index].login_time;
        var y1 = data[index].number;

        var focusX = xScale(x1) + padding.left;
        var focusY = yScale(y1) + padding.top;

        focusCircle.attr("transform", "translate(" + focusX + "," + focusY + ")");

        focusCircle.select("text").text(x1 + "日的访问量" + y1 + "人次");

        vLine.attr("x1", focusX)
            .attr("y1", focusY)
            .attr("x2", focusX)
            .attr("y2", height - padding.bottom);

        hLine.attr("x1", focusX)
            .attr("y1", focusY)
            .attr("x2", padding.left)
            .attr("y2", focusY)
    }

    function mousemove1() {

        /*鼠标在透明区域调用*/
        var data = dataset[0].value;

        var mouseX = d3.mouse(this)[0] - padding.left;
        var mouseY = d3.mouse(this)[1] - padding.top;

        var x0 = xScale.invert(mouseX);
        var y0 = yScale.invert(mouseY);

        x0 = Math.round(x0);

        // var bisect = d3.bisector(function (d) {
        //     return d[0];
        // }).left;

        //比较x轴，获取在x轴中的位置
        var index = 0;
        var delt = data[0].login_time - x0;
        for (var k = 0; k < data.length; k++) {
            if (Math.abs(data[k].login_time - x0) < delt) {
                delt = Math.abs(data[k].login_time - x0);
                index = k;
            }
        }

        var gdp = [];
        for (var k = 0; k < dataset.length; k++) {
            console.log("index:" + index + "x0:" + x0);
            gdp[k] = {
                name: dataset[k].name,
                value: dataset[k].value[index].number
            }
        }
        title.html("<strong>" + d3.timeFormat("%Y-%m-%d")(new Date(x0)) + "</strong>");

        desColor.style("background-color", function (d, i) {
            return colors[i];
        });

        desText.html(function (d, i) {
            return gdp[i].name + "\t" + "<strong>" + gdp[i].value + "</strong>";
        });

        tooltip.style("left", (d3.event.pageX) + "px")
            .style("top", (d3.event.pageY + 20) + "px");

        var vlx = xScale(data[index].login_time) + padding.left;

        vLine.attr("x1", vlx)
            .attr("y1", padding.top)
            .attr("x2", vlx)
            .attr("y2", height - padding.bottom);
    }


    var tooltip = d3.select("body")
        .append("div")
        .attr("class", "tooltip")
        .style("opacity", 0.0);

    var title = tooltip.append("div")
        .attr("class", "title");

    var des = tooltip.selectAll(".des")
        .data(dataset)
        .enter()
        .append("div");

    var desColor = des.append("div")
        .attr("class", "desColor");

    var desText = des.append("div")
        .attr("class", "desText");

    var vLine = svg.append("line")
        .attr("class", "focusLine")
        .style("display", "none")
        .attr("stroke-dasharray", 5)
        .attr("stroke", "black");
}

function addChangeAction() {
    //为Select添加事件，当选择其中一项时触发
    $("#parentId").change(function () {
        var parentId = $('#parentId').val() == null ? null : $('#parentId').val().trim();
        var data1 = {parentId: parentId};
        var url = $('#basePath').val() + "alarm/getQunZhuByParentId";

        $("#opId").empty();
        var bodyContent = $.ajax({
            url: url,
            global: false,
            type: "POST",
            data: data1,
            dataType: "json",
            async: false,
            success: function (msg) {

                // 实际的应用中，这里的option一般都是用循环生成多个了
                var option = $("<option>").val(0).text("所有");
                $("#opId").append(option);

                for (var i = 0; i < msg.length; i++) {
                    var item = msg[i];
                    var option = $("<option>").val(item.id).text(item.name);
                    $("#opId").append(option);
                }

            },
            error: function () {
                console.log("error");
            }
        })
    });
}


//