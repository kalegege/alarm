package com.wasu.utils;

import com.wasu.controller.AlarmController;
import com.wasu.model.*;
import com.wasu.service.DiTuiyjService;
import com.wasu.service.QunZhuyjService;
import com.wasu.service.RoleService;
import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import org.apache.commons.codec.binary.Hex;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

/**
 * Created by kale on 2017/8/28.
 */
public class MyUtils {
    private static Logger logger = Logger.getLogger(MyUtils.class.getName());

    @Autowired
    private QunZhuyjService qunZhuyjService;

    @Autowired
    private DiTuiyjService diTuiyjService;

    @Autowired
    private RoleService roleService;

    public static String JSP_TYPE = "type";
    public static String JSP_MENU = "menu";
    public static String JSP_QUNZHU = "qunzhu";
    public static String JSP_DITUI = "ditui";

    public static String ROLE_ADMIN="ROLE_ADMIN";
    public static String ROLE_USER="ROLE_USER";
    public static String ROLE_PUSH="ROLE_PUSH";
    public static String ROLE_RESTRICTED_ADMIN="ROLE_RESTRICTED_ADMIN";
    public static String ROLE_SERV="ROLE_SERV";


    /***
     *  利用Apache的工具类实现SHA-256加密
     * @param str 加密后的报文
     * @return
     */
    public static String getSHA256Str(String str) {
        MessageDigest messageDigest;
        String encdeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encdeStr = Hex.encodeHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encdeStr;
    }

    /**
     * json对象转换成java对象，并获取java对象属性t
     */
    public static Menu fromJsonToJava() {
        String laststr = "";
        Menu stu = null;
        String path = "/Users/kale/test/menu1.json";
        String path1 = "/json/menu1.json";
        // 读取原始json文件并进行操作和输出
        try {
            BufferedReader br = new BufferedReader(new FileReader(path1));// 读取原始json文件
            String tempString = null;
            while ((tempString = br.readLine()) != null) {
                laststr = laststr + tempString;
            }
            br.close();

            JSONObject json = JSONObject.fromObject(laststr);
            JSONArray jarry = json.getJSONArray("children");
            List<Item> blist = (List<Item>) JSONArray.toCollection(jarry, Item.class);
            stu = (Menu) JSONObject.toBean(json, Menu.class);
            stu.setChildren(blist);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return stu;
    }

    /**
     * 显示时间和地推 2--群主 3--地推 4--管理员
     * <p>
     * id   key
     * 1    ROLE_ADMIN                  2
     * 2    ROLE_RESTRICTED_ADMIN       2
     * 3    ROLE_USER                   0
     * 4    ROLE_PUSH                   1
     * 12   ROLE_SERV                   2
     * 13   ROLE_JIESAN                 2
     */
    public static int addModelByRole(Model model, Role role) {
        int menu = 0;
//        List<DiTuiyj> diTuiyjs = null;
//        List<QunZhu> qunZhus = null;

        if (role == null) {
            //只显示时间
            menu = 1;
        } else if (role.getRoleKey().equals(ROLE_USER)) {
            //群主
            menu = 2;
        } else if (role.getRoleKey().equals(ROLE_PUSH)) {
            //地推
            menu = 3;
        } else {
            //管理员
            menu = 4;
        }

        if (menu != 0) {
            model.addAttribute(JSP_MENU, menu);
        }
        return menu;
//        if (diTuiyjs != null) {
//            model.addAttribute(JSP_DITUI, diTuiyjs);
//        }
//        if (qunZhus != null) {
//            model.addAttribute(JSP_DITUI, qunZhus);
//        }
    }

    /**
     * @param model
     * @param text
     */
    public static void addJspType(Model model, String text) {
        if (text != null) {
            model.addAttribute(JSP_TYPE, text);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Menu menu = fromJsonToJava();
        System.out.println("test");
    }
}
