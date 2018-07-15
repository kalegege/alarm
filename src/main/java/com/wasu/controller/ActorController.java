package com.wasu.controller;

import com.alibaba.fastjson.JSONArray;
import com.wasu.model.ActorDO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/actor")
public class ActorController {
    private static Logger logger = Logger.getLogger(ActorController.class.getName());

    @RequestMapping(value = "/index")
    public Object getAlarm(Model model) throws Exception {

        return "actor/actor";
    }

    @RequestMapping(value = "/test1")
    public Object test1(Model model) throws Exception {

        return "actor/index";
    }

    @RequestMapping(value = "/test2")
    public Object test2(Model model) throws Exception {

        return "actor/test2";
    }

    @RequestMapping(value = "/list")
    public Object listPage(HttpServletRequest request) throws Exception {
        return "actor/list";
    }

    @RequestMapping(value = "/movies")
    public Object player(HttpServletRequest request,Model model,String name) throws Exception {
        if(null == name){
            model.addAttribute("url","http://192.168.1.109/movies/3kv4bu.mp4");
        }else{
            model.addAttribute("url","http://192.168.1.109/movies/"+name);
        }
        return "actor/movies";
    }

    @RequestMapping(value = "/getTableInfo")
    @ResponseBody
    public String listPage1(HttpServletRequest request) throws Exception {
//        if("1" != queryDate){
//            return "";
//        }
        List<ActorDO> list = getActorDOS();
        String result = JSONArray.toJSONString(list);
        return result;
    }

    /**
     * 封装推荐列表数据
     * @return
     */
    private List<ActorDO> getActorDOS() {
        ActorDO actorDO1 = new ActorDO("李易峰", 1, "后台配置", 10, 1, "杭州","2017-07-11 10:12");
        ActorDO actorDO2 = new ActorDO("杨洋", 2, "协同过滤", 10, 1, "杭州","2017-07-11 10:15");
        ActorDO actorDO3 = new ActorDO("赵丽颖", 3, "协同过滤", 10, 1, "杭州","2017-07-11 10:17");
        ActorDO actorDO4 = new ActorDO("迪丽热巴", 4, "热度推荐", 25, 1, "杭州","2017-07-11 10:18");
        ActorDO actorDO5 = new ActorDO("薛之谦", 5, "热度推荐", 23, 1, "杭州","2017-07-11 10:19");
        List<ActorDO> list = new ArrayList<>();
        list.add(actorDO1);
        list.add(actorDO2);
        list.add(actorDO3);
        list.add(actorDO4);
        list.add(actorDO5);
        return list;
    }


}
