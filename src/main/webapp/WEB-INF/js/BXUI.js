/**
 * Created by kale on 2017/8/16.
 */



var BXUI = {};


BXUI.load = function (_module, _config) {
    BXUI[_module].init(_config);
};


BXUI.portal = {
    options: {
        // navUrl:"../json/menu.json",
        navUrl: "/alarm/menu",
        renderTo: "body"
    },
    init: function (_config) {
        var me = this;
        $.extend(me.options, _config, true);

        me.initTpl();
        me.doLayout();
        me.initNav();
        window.portal = this;
        $(window).on("resize", function () {
            me.doLayout();
        });
    },

    doLayout: function () {
        var bdw = $("body").innerWidth(),
            bdh = $("body").innerHeight(),
            center = $(".portal-center"),
            pages = $(".portal-pages");
        center.width(bdw - 200);
        pages.height(bdh - 36 - 100);
    },
    initTpl: function () {

        var me = this,
            tpl = "<div class='portal-west'>" +
                "<div class='portal-nav'></div>" +
                "</div>" +
                "<div class='portal-center'>" +
                "<div class='portal-tabs'></div>" +
                "<div class='portal-pages'></div>" +
                "</div>" +
                "<div class='portal-south'></div>";

        $(me.options.renderTo).append(tpl);
    },

    initNav: function () {
        var me = this;
        $.ajax({
            url: me.options.navUrl,
            dataType: "json"
        }).done(function (response) {
            var menu = $("<ul>").attr({
                "class": "portal-menu",
                "onselectstart": "return false;"
            });
            for (var i = 0; i < response.length; i++) {
                var children = response[i].children,
                    menuItem = $("<li>").addClass("portal-menu-item"),
                    lvl1 = $("<div>").addClass("lvl1").text(response[i].text),
                    lvl2 = $("<ul>").addClass("lvl2");

                for (var j = 0; j < children.length; j++) {
                    lvl2.append(
                        $("<li>").append(
                            $("<a>").attr("href", "javascript:void();")
                                .text(children[j].text)
                                .data(children[j])
                                .bind("click", function (e) {
                                    e.preventDefault();
                                    me.openPage($(this).data("text"), $(this).data("url"));
                                })
                        )
                    );
                }

                lvl1.bind("click", me.menuItemClick);
                menuItem.append(lvl1).append(lvl2);

                menu.append(menuItem);
            }
            $(".portal-nav").append(menu);
        });

    },

    menuItemClick: function () {

        if ($(this).hasClass("lvl1-focus")) {
            $(this).parent().removeClass("portal-menu-item-focus");
            $(this).removeClass("lvl1-focus");
            $(this).next().hide();
        } else {
            $(this).parent().addClass("portal-menu-item-focus");
            $(this).addClass("lvl1-focus");
            $(this).next().show();
        }
    },

    opened: {},

    openPage: function (title, url) {

        var me = this;

        $(".portal-tabs .focus").removeClass("focus");
        $(".portal-pages .focus").removeClass("focus");

        if (url in me.opened) {
            me.opened[url].tab.addClass("focus");
            me.opened[url].page.addClass("focus");
            return;
        }

        var closeIcon = $("<div>").addClass("close").text("X")
                .bind({
                    click: function () {
                        me.closeTab($(this).parent().data("url"));
                    }
                }),
            tab = $("<div>").addClass("tab focus")
                .text(title)
                .data("url", url)
                .append(closeIcon).bind({
                    click: function () {
                        me.activateTab($(this).data("url"));
                    }
                }),
            page = $("<iframe>").attr({
                width: "100%",
                height: "100%",
                frameBorder: "0",
                src: $('#basePath').val() + url
            }).addClass("focus");

        me.opened[url] = {
            tab: tab,
            page: page
        };


        $(".portal-tabs").append(tab);
        $(".portal-pages").append(page);
    },

    activateTab: function (url) {
        var me = this;
        // 移除当前的激活的tab
        $(".portal-tabs .focus").removeClass("focus");
        $(".portal-pages .focus").removeClass("focus");

        // 给要激活的tab加上焦点样式

        me.opened[url].tab.addClass("focus");
        me.opened[url].page.addClass("focus");
    },

    closeTab: function (url) {
        var me = this;
        var currTab = me.opened[url].tab,
            currPage = me.opened[url].page,
            nextTab = currTab.next(),
            nextPage = currPage.next(),
            prevTab = currTab.prev(),
            prevPage = currPage.prev();

        currTab.remove();
        currPage.remove();
        delete me.opened[url];

        if (currTab.hasClass("focus")) {

            if (nextTab.length > 0) {
                nextTab.addClass("focus");
                nextPage.addClass("focus");
                return;
            }

            if (prevTab.length > 0) {
                prevTab.addClass("focus");
                prevPage.addClass("focus");
                return;
            }
        }
    }
};


