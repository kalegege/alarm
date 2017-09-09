package com.wasu.utils;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by kale on 2017/8/23.
 */
public class CommonInterceptor implements HandlerInterceptor {

    //拦截前处理
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {

//        Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组
//        if(null==cookies) {
//            System.out.println("没有cookie=========");
//        }else{
//            for(Cookie cookie : cookies){
//                if((cookie.getName() == "admincookies")&&(cookie.getValue()!=null)){
//                    return true;
//                }
//                System.out.println("name:"+cookie.getName()+",value:"+ cookie.getValue());
//            }
//        }


        HttpSession session=request.getSession();
        Object sessionObj = session.getAttribute(MyUtils.SESSION_USER);

        if (sessionObj != null) {
            return true;
        }
        response.sendRedirect("/alarm/login");
        return false;

//        return true;
    }

    //拦截后处理
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav) throws Exception {
    }

    //全部完成后处理
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) throws Exception {
    }
}
