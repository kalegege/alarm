package com.wasu.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actor")
public class ActorController {
    private static Logger logger = Logger.getLogger(ActorController.class.getName());

    @RequestMapping(value = "/index")
    public Object getAlarm(Model model) throws Exception {

        return "actor";
    }

    @RequestMapping(value = "/test1")
    public Object test1(Model model) throws Exception {

        return "test1";
    }
    @RequestMapping(value = "/test2")
    public Object test2(Model model) throws Exception {

        return "test2";
    }
}
