package com.wasu.controller;

import com.google.common.collect.Lists;
import com.wasu.model.Authority;
import com.wasu.model.Item;
import com.wasu.model.Menu;
import com.wasu.model.UserDO;
import com.wasu.service.AuthorityService;
import com.wasu.service.UserService;
import com.wasu.utils.DataSourceConst;
import com.wasu.utils.DataSourceContextHolder;
import com.wasu.utils.MyUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by kale on 2017/8/23.
 */
@Controller
//@RequestMapping("/alarm/login")
public class LoginController {
    private static Logger logger = Logger.getLogger(LoginController.class.getName());

    @Autowired
    private UserService userService;

    @Autowired
    private AuthorityService authorityService;

    /**
     * 默认登陆页面
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/")
    public Object index() throws Exception {
        return "login1";
    }

    /**
     * 登陆接口，正常进入查看图表首页
     * 根据session的过期时间，如果超过时间，返回登陆页面
     *
     * @param userDO
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login")
    public Object login(@ModelAttribute("form") UserDO userDO, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String kaptchaExpected = (String) request.getSession()
                .getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);

        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);

        if (userDO.getUserid() == null) {
            return "login1";
        }
        if (!userService.isProved(userDO)) {
            System.out.println("密码错误");
            return "login1";
        }

//        System.out.println(userDO.getPasswd());
        HttpSession session = request.getSession();
        session.setAttribute(MyUtils.SESSION_USER, userDO);
        session.setMaxInactiveInterval(7 * 24 * 60 * 60);
        return "index";
    }

    /**
     * 退出登录
     *
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/logout")
    public Object logout(HttpServletRequest request) throws Exception {

        HttpSession session = request.getSession();
        session.removeAttribute(MyUtils.SESSION_USER);
        return "login1";
    }

    /**
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/code")
    public void code(HttpServletRequest request,HttpServletResponse response) throws Exception{
        int width=100;
        int height=30;
        String strs="abcdefghijklmnopqrstuvwxyz0123456789";
        Random random=new Random();
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        Graphics graphics=image.getGraphics();
        graphics.setColor(Color.gray);
        graphics.fillRect(0,0,100,30);
        graphics.setColor(Color.BLUE);

        for(int i=0;i<4;i++){
            int position=random.nextInt(strs.length());
            graphics.drawString(strs.substring(position,position+1),20*(i+1),15);
        }

        ImageIO.write(image,"jpg",response.getOutputStream());

    }

    /**
     * @return
     */
    @RequestMapping(value = "/menu")
    @ResponseBody
    public Object menu(HttpServletRequest request) throws Exception {
        UserDO userDO = (UserDO) request.getSession().getAttribute(MyUtils.SESSION_USER);

        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);

        List<Authority> menuByUserId = authorityService.getMenuByUserId(userDO.getUserid());

        List<Menu> menus = new ArrayList<Menu>();
        for (int i = 0; i < menuByUserId.size(); i++) {
            if (menuByUserId.get(i).getMenuType() == 0) {
                Authority authority = menuByUserId.get(i);
                Menu menu = new Menu(authority.getMenuName(), authority.getMenuCode());
                menus.add(menu);
            }
        }

        for (int j = 0; j < menus.size(); j++) {
            Menu m = menus.get(j);
            List<Item> child = Lists.newArrayList();
            for (Authority a : menuByUserId) {
                String icon = m.getIcon();
                if (icon.equals(a.getParentMenucode())) {
                    Item i = new Item(a.getSequence(), a.getMenuName(), a.getMenuCode(), a.getMenuUrl());
                    child.add(i);
                }
            }
            m.setChildren(child);
        }

//        List<Menu> menus = new ArrayList<Menu>();
//        Menu test = new Menu();
//        List<Item> items = new ArrayList<>();
//
//        Item item1 = new Item();
//        item1.setText("房间和玩家信息表");
//        item1.setId(2);
//        item1.setIcon("room");
//        item1.setUrl("alarm/getRoom");
//        items.add(item1);
//
//        Item item2 = new Item();
//        item2.setText("登录情况按天统计表");
//        item2.setId(2);
//        item2.setIcon("login");
//        item2.setUrl("alarm/getLogin");
//        items.add(item2);
//
//        test.setIcon("sys");
//        test.setId(1);
//        test.setText("统计报表");
//        test.setChildren(items);
////        menus.add(menu);
//        menus.add(test);
        return menus;
    }

}
