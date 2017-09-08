package com.wasu.service.impl;

import com.wasu.dao.LoginStatisticDateMapper;
import com.wasu.dao.SummaryMapper;
import com.wasu.model.LoginStatisticDate;
import com.wasu.model.LoginStatisticDateExample;
import com.wasu.model.SummaryExample;
import com.wasu.service.LoginStatisticDateService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 * Created by kale on 2017/8/17.
 */
@Service("LoginStatisticDateService")
public class LoginStatiSticServiceImpl implements LoginStatisticDateService {

    private static Logger logger = Logger.getLogger(LoginStatiSticServiceImpl.class.getName());

    @Resource
    private LoginStatisticDateMapper loginStatisticDateMapper;

    @Override
    public List<LoginStatisticDate> getAll() {
        LoginStatisticDateExample loginStatisticDateExample =new LoginStatisticDateExample();
        LoginStatisticDateExample.Criteria criteria=loginStatisticDateExample.createCriteria();
        loginStatisticDateExample.setOrderByClause("login_date DESC");
        return loginStatisticDateMapper.selectByExample(loginStatisticDateExample);
    }

    @Override
    public List<LoginStatisticDate> getCertainTime(String start, String stop) {

        LoginStatisticDateExample loginStatisticDateExample =new LoginStatisticDateExample();
        LoginStatisticDateExample.Criteria criteria=loginStatisticDateExample.createCriteria();
        //解析日期
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start1= LocalDate.parse(start, formatter);
        LocalDate stop1= LocalDate.parse(stop, formatter);

        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt1 = start1.atStartOfDay(zoneId);
        Date start2 = Date.from(zdt1.toInstant());

        ZonedDateTime zdt2 = stop1.atStartOfDay(zoneId);
        Date stop2 = Date.from(zdt2.toInstant());

//        Date star21= (Date) DateTimeFormatter.ofPattern("%Y-%m-%d").parse(start);
//        Date start1=new Date(start);
//        Date stop1=new Date(stop);
        criteria.andLoginDateGreaterThan(start2).andLoginDateLessThan(stop2);
//        criteria.andLoginDateBetween(start2,stop2);
        loginStatisticDateExample.setOrderByClause("login_date DESC");
        return loginStatisticDateMapper.selectByExample(loginStatisticDateExample);
    }
}
