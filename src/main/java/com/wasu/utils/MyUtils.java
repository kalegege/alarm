package com.wasu.utils;

import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by kale on 2017/8/28.
 */
public class MyUtils {
    private static Logger logger = Logger.getLogger(MyUtils.class.getName());
    public static String JSP_TYPE = "type";
    public static String JSP_MENU = "menu";
    public static String JSP_QUNZHU = "qunzhu";
    public static String JSP_DITUI = "ditui";
    public static String JSP_DATE = "date";

    public static String ROLE_ADMIN="ROLE_ADMIN";
    public static String ROLE_USER="ROLE_USER";
    public static String ROLE_PUSH="ROLE_PUSH";
    public static String ROLE_RESTRICTED_ADMIN="ROLE_RESTRICTED_ADMIN";
    public static String ROLE_SERV="ROLE_SERV";

    public static String SESSION_USER="adminsession";

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
     * @param model
     * @param text
     */
    public static void addJspType(Model model, String text) {
        if (text != null) {
            model.addAttribute(JSP_TYPE, text);
        }
    }

}
