package com.wasu.controller;

import com.google.common.collect.Lists;
import com.wasu.model.*;
import com.wasu.service.*;
import com.wasu.utils.DataSourceConst;
import com.wasu.utils.DataSourceContextHolder;
import com.wasu.utils.MyUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.soap.Detail;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by kale on 2016/12/22.
 */
@Controller
@RequestMapping("/alarm")
public class AlarmController {
    private static Logger logger = Logger.getLogger(AlarmController.class.getName());

    @Autowired
    private CallService callService;

    @Autowired
    private SummaryService summaryService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private LoginStatisticDateService loginStatisticDateService;

    @Autowired
    private QunZhuyjService qunZhuyjService;

    @Autowired
    private DiTuiyjService diTuiyjService;

    @Autowired
    private QunZhuyjDetailService qunZhuyjDetailService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getalarm")
    public Object getAlarm(Model model) throws Exception {
//		Response responses=badiduYunUtils.createGeotable("geotable");
        model.addAttribute("result", "first name");
//        callService.findCall();
//		System.out.println("message"+responses.getMessage()+"id"+responses.getId());
        return "alarm";
    }


    /**
     * 房间和玩家信息表
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getRoom")
    public Object getRooms(Model model) throws Exception {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(new Date());
        Date today = null;

        try {
            today = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.TABLE);

        int players = roomService.getOnlinePlayers(today);
        int onlineRooms = roomService.getOnlineRooms(today);
        int waitRooms = roomService.getWaitRooms(today);

        System.out.println("当前在线玩家有" + players);
        System.out.println("当前在线房间数有" + onlineRooms);
        System.out.println("当前等待开局数有" + waitRooms);

        model.addAttribute("players", players);
        model.addAttribute("onlineRooms", onlineRooms);
        model.addAttribute("waitRooms", waitRooms);

        return "summary";
    }

    /**
     * 点击菜单跳转查询页面的链接
     * 登录情况按天统计表
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getLogin")
    public Object getLogin(Model model) throws Exception {

        MyUtils.addJspType(model, "getLoginTable");
        MyUtils.addModelByRole(model, null);
        return "s_table";
    }

    /**
     * 点击菜单跳转查询页面的链接
     * 群主业绩统计表（累计）
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getHost")
    public Object getHost(Model model, HttpServletRequest request) throws Exception {
        UserDO userDO = (UserDO) request.getSession().getAttribute("adminsession");
        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);
        //获取当前用户权限
        Role role = roleService.getRoleByUserId(userDO.getUserid());

        MyUtils.addJspType(model, "getHostTable");
        addQunZhuAndDiTui(model, MyUtils.addModelByRole(model, role), userDO);
        return "s_table";
    }

    /**
     * 点击菜单跳转查询页面的链接
     * 地推业绩统计表（累计）
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getSale")
    public Object getSale(Model model, HttpServletRequest request) throws Exception {
        UserDO userDO = (UserDO) request.getSession().getAttribute("adminsession");
        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);
        //获取当前用户权限
        Role role = roleService.getRoleByUserId(userDO.getUserid());

        MyUtils.addJspType(model, "getSaleTable");
        addQunZhuAndDiTui(model, MyUtils.addModelByRole(model, role), userDO);
        return "s_dtable";
    }

    /**
     * 点击菜单跳转查询页面的链接
     * 群主业绩统计表(按天)
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getHostDetail")
    public Object getHostDetail(Model model, HttpServletRequest request) throws Exception {
        UserDO userDO = (UserDO) request.getSession().getAttribute("adminsession");
        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);
        //获取当前用户权限
        Role role = roleService.getRoleByUserId(userDO.getUserid());

        MyUtils.addJspType(model, "getHostDetailTable");
        addQunZhuAndDiTui(model, MyUtils.addModelByRole(model, role), userDO);
        return "s_table";
    }

    /**
     * 点击菜单跳转查询页面的链接
     * 地推业绩统计表(按天)
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getSaleDetail")
    public Object getSaleDetail(Model model, HttpServletRequest request) throws Exception {
        UserDO userDO = (UserDO) request.getSession().getAttribute("adminsession");
        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);
        //获取当前用户权限
        Role role = roleService.getRoleByUserId(userDO.getUserid());
        //1-时间2-不显示3-显示群主4-显示群主和地推

        // 根据权限返回值添加下拉框数据
        addQunZhuAndDiTui(model, MyUtils.addModelByRole(model, role), userDO);

        MyUtils.addJspType(model, "getSaleDetailTable");
        return "s_table";
    }

    /**
     * 添加返回群主和地推数据
     *
     * @param model
     * @param menuId
     * @param userDO
     */
    private void addQunZhuAndDiTui(Model model, int menuId, UserDO userDO) {
        if (menuId == 3) {
            //地推用户
//            qunZhuyjs=qunZhuyjService.getByUserName(userDO.getUserid());
            model.addAttribute(MyUtils.JSP_QUNZHU, qunZhuyjService.getByUserName(userDO.getUserid()));
        }
        if (menuId == 4) {
            //管理员用户
//            diTuiyjs=diTuiyjService.getByUserName(userDO.getUserid());
            model.addAttribute(MyUtils.JSP_DITUI, diTuiyjService.getAll());
            model.addAttribute(MyUtils.JSP_QUNZHU, qunZhuyjService.getAll());
        }

    }

    /**
     * 登录情况按天统计表---表格的数据
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getLoginTable")
    public Object getLoginTable(Model model, String startDate, String stopDate, String parentId, String opId) throws Exception {
        System.out.println("开始时间：" + startDate + "结束时间：" + stopDate + "群主id：" + opId + "发展人id：" + parentId);

        DataSourceContextHolder.setDataSourceType(DataSourceConst.TABLE);
        List<LoginStatisticDate> result = loginStatisticDateService.getCertainTime(startDate, stopDate);
        model.addAttribute("data", result);
        return "s_loginTable";
    }

    /**
     * 群主业绩统计表（累计）---表格的数据
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getHostTable")
    public Object getHostTable(Model model, String startDate, String stopDate, String parentId, String opId, HttpServletRequest request) throws Exception {
        UserDO userDO = (UserDO) request.getSession().getAttribute("adminsession");
        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);
        //获取当前用户权限
        QunZhuyj qunZhuyj = new QunZhuyj();
        if (!opId.equals("")) {
            if (!parentId.equals("")) {
                //管理员
                Long pId = Long.parseLong(parentId);
                Long oId = Long.parseLong(opId);
                if (pId != 0) {
                    qunZhuyj.set发展人id(pId);
                }
                if (oId != 0) {
                    qunZhuyj.set群主id(oId);
                }
            } else {
                //地推
                Long oId = Long.parseLong(opId);
                if (oId != 0) {
                    qunZhuyj.set群主id(oId);
                }
            }
        } else {
            //群主
            List<User> users = userService.getUserByCode(userDO.getUserid());
            qunZhuyj.set群主id(users.get(0).getId());
        }

        List<QunZhuyj> result = qunZhuyjService.getByUserId(qunZhuyj);

        model.addAttribute("data", result);

        return "s_hostTable";
    }

    /**
     * 地推业绩统计表（累计）---表格的数据
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getSaleTable")
    public Object getSaleTable(Model model, String startDate, String stopDate, String parentId, String opId, HttpServletRequest request) throws Exception {
        UserDO userDO = (UserDO) request.getSession().getAttribute("adminsession");
        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);

        Long pId = Long.parseLong(parentId);

        List<DiTuiyj> result = diTuiyjService.getByUserId(pId);

        //测试数据
//        List<LoginStatisticDate> bb = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            LoginStatisticDate aa = new LoginStatisticDate();
//            aa.setAreaname("杭州");
//            aa.setIpCount(100);
//            aa.setLoginCount(200);
//            aa.setLoginDate(new Date());
//            bb.add(aa);
//        }

        model.addAttribute("data", result);

        return "s_saleTable";
    }

    /**
     * 群主业绩按天统计表---表格的数据
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getHostDetailTable")
    public Object getHostDetailTable(Model model, String startDate, String stopDate, String parentId, String opId, HttpServletRequest request) throws Exception {

        UserDO userDO = (UserDO) request.getSession().getAttribute("adminsession");

        System.out.println("开始时间：" + startDate + "结束时间：" + stopDate + "群主id：" + opId + "发展人id：" + parentId);

        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);
        //获取当前用户权限
        QunZhuyjDetail qunZhuyjDetail = new QunZhuyjDetail();
        if (!opId.equals("")) {
            if (!parentId.equals("")) {
                //管理员
                Long pId = Long.parseLong(parentId);
                Long oId = Long.parseLong(opId);
                if (pId != 0) {
                    qunZhuyjDetail.setParentId(pId.intValue());
                }
                if (oId != 0) {
                    qunZhuyjDetail.setOpId(oId.intValue());
                }
            } else {
                //地推
                Long oId = Long.parseLong(opId);
                if (oId != 0) {
                    qunZhuyjDetail.setOpId(oId.intValue());
                }
            }
        } else {
            //群主
            List<User> users = userService.getUserByCode(userDO.getUserid());
            qunZhuyjDetail.setOpId(users.get(0).getId().intValue());
        }
        List<QunZhuyjDetail> result = qunZhuyjDetailService.getByExamle(qunZhuyjDetail);
        //获取全部数据
//        List<QunZhuyjDetail> result = qunZhuyjDetailService.getAll();

        model.addAttribute("data", result);

        return "s_hostDetailTable";
    }

    @RequestMapping(value = "/getSaleDetailTable")
    public Object getSaleDetailTable(Model model, String startDate, String stopDate, String parentId, String opId, HttpServletRequest request) throws Exception {

        UserDO userDO = (UserDO) request.getSession().getAttribute("adminsession");

        System.out.println("开始时间：" + startDate + "结束时间：" + stopDate + "群主id：" + opId + "发展人id：" + parentId);

        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);
        //获取当前用户权限
        QunZhuyjDetail qunZhuyjDetail = new QunZhuyjDetail();
        if (!opId.equals("")) {
            if (!parentId.equals("")) {
                //管理员
                Long pId = Long.parseLong(parentId);
                Long oId = Long.parseLong(opId);
                if (pId != 0) {
                    qunZhuyjDetail.setParentId(pId.intValue());
                }
                if (oId != 0) {
                    qunZhuyjDetail.setOpId(oId.intValue());
                }
            } else {
                //地推
                Long oId = Long.parseLong(opId);
                if (oId != 0) {
                    qunZhuyjDetail.setOpId(oId.intValue());
                }
            }
        } else {
            //群主
            List<User> users = userService.getUserByCode(userDO.getUserid());
            qunZhuyjDetail.setOpId(users.get(0).getId().intValue());
        }
        List<QunZhuyjDetail> result = qunZhuyjDetailService.getByExamle(qunZhuyjDetail);
        //获取全部数据
//        List<QunZhuyjDetail> result = qunZhuyjDetailService.getAll();

        model.addAttribute("data", result);

        return "s_hostDetailTable";
    }

    @RequestMapping(value = "getTableData")
    @ResponseBody
    public Object getTableData() throws Exception {
        //测试数据
        List<LoginStatisticDate> bb = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            LoginStatisticDate aa = new LoginStatisticDate();
            aa.setAreaname("杭州");
            aa.setIpCount(100);
            aa.setLoginCount(200);
            aa.setLoginDate(new Date());
            bb.add(aa);
        }

        return bb;
    }

    /**
     * 登录情况按天统计表--折线图数据
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getLoginTableData")
    @ResponseBody
    public Object getLoginTableData(String startDate, String stopDate, String parentId, String opId, HttpServletRequest request) throws Exception {

        System.out.println("开始时间：" + startDate + "结束时间：" + stopDate + "群主id：" + opId + "发展人id：" + parentId);
        DataSourceContextHolder.setDataSourceType(DataSourceConst.TABLE);
//        List<LoginStatisticDate> resultDO = loginStatisticDateService.getCertainTime(startDate, stopDate);
//
//        List<LoginStatisticDate> resultDO = loginStatisticDateService.getAll();
        List<LoginStatisticDate> resultDO = loginStatisticDateService.getCertainTime(startDate, stopDate);

        List<DetailDO> result = formatResult(resultDO);


        //测试数据
//        List<LineTableDO> result = new ArrayList<LineTableDO>();
//        for (int i = 0; i < 1; i++) {
//            List<List<Integer>> l2 = new ArrayList<>();
//            for (int j = 0; j < 10; j++) {
//                List l1 = new ArrayList();
//                l1.add(2000 + j);
//                if (i % 2 == 0) {
//                    l1.add(1000 - i * 200 + j * 100);
//                } else {
//                    l1.add(2000 + i * 200 - j * 100);
//                }
//
//                l2.add(l1);
//            }
//
//            LineTableDO item = new LineTableDO("李涛" + i, l2);
//            result.add(item);
//        }
        return result;
    }

    /**
     * 群主业绩统计表（累计）--折线图数据
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getHostTableData")
    @ResponseBody
    public Object getHostTableData() throws Exception {
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);

        List<QunZhuyj> resultDO = qunZhuyjService.getAll();

//        List<LoginStatisticDate> resultDO = loginStatisticDateService.getAll();
//        List<LineTableDO> result = new ArrayList<LineTableDO>();
//        List<List<Integer>> l2 = new ArrayList<>();
//        for (int j = 0; j < resultDO.size(); j++) {
//            List l1 = new ArrayList();
//            Date time=resultDO.get(j).getLoginDate();
//
//            l1.add(time.getDate());
//            l1.add(resultDO.get(j).getIpCount());
//            l2.add(l1);
//        }
//        LineTableDO item1 = new LineTableDO("IP", l2);
//        result.add(item1);
//
//        List<List<Integer>> l4 = new ArrayList<>();
//        for (int j = 0; j < resultDO.size(); j++) {
//            List l3 = new ArrayList();
//            Date time=resultDO.get(j).getLoginDate();
//
//            l3.add(time.getDate());
//            l3.add(resultDO.get(j).getLoginCount());
//            l4.add(l3);
//        }
//        LineTableDO item2 = new LineTableDO("Login", l4);
//        result.add(item2);


        //测试数据
        List<LineTableDO> result = new ArrayList<LineTableDO>();
        for (int i = 0; i < 1; i++) {
            List<List<Integer>> l2 = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                List l1 = new ArrayList();
                l1.add(2000 + j);
                if (i % 2 == 0) {
                    l1.add(1000 - i * 200 + j * 100);
                } else {
                    l1.add(2000 + i * 200 - j * 100);
                }

                l2.add(l1);
            }

            LineTableDO item = new LineTableDO("李涛" + i, l2);
            result.add(item);
        }
        return result;
    }

    /**
     * 地推业绩统计表（累计）--折线图数据
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getSaleTableData")
    @ResponseBody
    public Object getSaleTableData() throws Exception {
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);

        List<QunZhuyj> resultDO = qunZhuyjService.getAll();

//        List<LoginStatisticDate> resultDO = loginStatisticDateService.getAll();
//        List<LineTableDO> result = new ArrayList<LineTableDO>();
//        List<List<Integer>> l2 = new ArrayList<>();
//        for (int j = 0; j < resultDO.size(); j++) {
//            List l1 = new ArrayList();
//            Date time=resultDO.get(j).getLoginDate();
//
//            l1.add(time.getDate());
//            l1.add(resultDO.get(j).getIpCount());
//            l2.add(l1);
//        }
//        LineTableDO item1 = new LineTableDO("IP", l2);
//        result.add(item1);
//
//        List<List<Integer>> l4 = new ArrayList<>();
//        for (int j = 0; j < resultDO.size(); j++) {
//            List l3 = new ArrayList();
//            Date time=resultDO.get(j).getLoginDate();
//
//            l3.add(time.getDate());
//            l3.add(resultDO.get(j).getLoginCount());
//            l4.add(l3);
//        }
//        LineTableDO item2 = new LineTableDO("Login", l4);
//        result.add(item2);


        //测试数据
        List<LineTableDO> result = new ArrayList<LineTableDO>();
        for (int i = 0; i < 1; i++) {
            List<List<Integer>> l2 = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                List l1 = new ArrayList();
                l1.add(2000 + j);
                if (i % 2 == 0) {
                    l1.add(1000 - i * 200 + j * 100);
                } else {
                    l1.add(2000 + i * 200 - j * 100);
                }

                l2.add(l1);
            }

            LineTableDO item = new LineTableDO("李涛" + i, l2);
            result.add(item);
        }
        return result;
    }

    /**
     * 登录情况按天统计表--折线图数据
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getHostDetailTableData")
    @ResponseBody
    public Object getHostDetailTableData() throws Exception {
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);

//        List<QunZhuyj> resultDO = qunZhuyjService.getAll();

//        List<LoginStatisticDate> resultDO = loginStatisticDateService.getAll();
//        List<LineTableDO> result = new ArrayList<LineTableDO>();
//        List<List<Integer>> l2 = new ArrayList<>();
//        for (int j = 0; j < resultDO.size(); j++) {
//            List l1 = new ArrayList();
//            Date time=resultDO.get(j).getLoginDate();
//
//            l1.add(time.getDate());
//            l1.add(resultDO.get(j).getIpCount());
//            l2.add(l1);
//        }
//        LineTableDO item1 = new LineTableDO("IP", l2);
//        result.add(item1);
//
//        List<List<Integer>> l4 = new ArrayList<>();
//        for (int j = 0; j < resultDO.size(); j++) {
//            List l3 = new ArrayList();
//            Date time=resultDO.get(j).getLoginDate();
//
//            l3.add(time.getDate());
//            l3.add(resultDO.get(j).getLoginCount());
//            l4.add(l3);
//        }
//        LineTableDO item2 = new LineTableDO("Login", l4);
//        result.add(item2);


        //测试数据
        List<LineTableDO> result = new ArrayList<LineTableDO>();
        for (int i = 0; i < 1; i++) {
            List<List<Integer>> l2 = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                List l1 = new ArrayList();
                l1.add(2000 + j);
                if (i % 2 == 0) {
                    l1.add(1000 - i * 200 + j * 100);
                } else {
                    l1.add(2000 + i * 200 - j * 100);
                }

                l2.add(l1);
            }

            LineTableDO item = new LineTableDO("李涛" + i, l2);
            result.add(item);
        }
        return result;
    }

    /**
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getQunZhuByParentId")
    @ResponseBody
    public Object getQunZhuByParentId(String parentId) throws Exception {
        QunZhuyj qunZhuyj = new QunZhuyj();
        Long pId = Long.parseLong(parentId);
        if (pId != 0) {
            qunZhuyj.set发展人id(pId);
        }
        qunZhuyj.set发展人id(pId);
        //选择视图数据库
        DataSourceContextHolder.setDataSourceType(DataSourceConst.VIRTUAL);
        List<QunZhuyj> result = qunZhuyjService.getByUserId(qunZhuyj);

        List<Map<String, Object>> mapList = Lists.newArrayList();
        for (int i = 0; i < result.size(); i++) {
            Map<String, Object> item = new HashMap<>();
            QunZhuyj qunZhuyj1 = result.get(i);
            item.put("name", qunZhuyj1.get群主姓名());
            item.put("id", qunZhuyj1.get群主id());
            mapList.add(item);
        }
        return mapList;
    }

    //将获得的数据封装成detaildo
    private List<DetailDO> formatResult(List<LoginStatisticDate> resultDO) {
        List<DetailDO> result = new ArrayList<>();
        DetailDO loginData = new DetailDO("login");
        DetailDO ipData = new DetailDO("ip");

        List<DetailDTO> logins = new ArrayList<>();
        List<DetailDTO> ips = new ArrayList<>();

        for (int i = 0; i < resultDO.size(); i++) {
            double time = resultDO.get(i).getLoginDate().getTime();
            DetailDTO login = new DetailDTO(time);
            DetailDTO ip = new DetailDTO(time);
            login.setNumber(resultDO.get(i).getLoginCount());
            ip.setNumber(resultDO.get(i).getIpCount());
            logins.add(login);
            ips.add(ip);
        }
        loginData.setValue(logins);
        ipData.setValue(ips);
        result.add(loginData);
        result.add(ipData);
        return result;
    }


}
