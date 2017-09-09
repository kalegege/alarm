package com.wasu.service.impl;

import com.wasu.dao.LoginStatisticDateMapper;
import com.wasu.dao.QunZhuyjDetailMapper;
import com.wasu.model.QunZhuyjDetail;
import com.wasu.model.QunZhuyjDetailExample;
import com.wasu.service.QunZhuyjDetailService;
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
 * Created by kale on 2017/8/24.
 */
@Service("QunZhuyjDetailService")
public class QunZhuyjDetailServiceImpl implements QunZhuyjDetailService {
    private static Logger logger = Logger.getLogger(QunZhuyjDetailServiceImpl.class.getName());

    @Resource
    private QunZhuyjDetailMapper qunZhuyjDetailMapper;

    @Override
    public List<QunZhuyjDetail> getAll() {
        QunZhuyjDetailExample qunZhuyjDetailExample = new QunZhuyjDetailExample();
        QunZhuyjDetailExample.Criteria criteria = qunZhuyjDetailExample.createCriteria();
        return qunZhuyjDetailMapper.selectByExample(qunZhuyjDetailExample);
    }

    @Override
    public List<QunZhuyjDetail> getByExamle(QunZhuyjDetail obj) {
        QunZhuyjDetailExample qunZhuyjDetailExample = new QunZhuyjDetailExample();
        QunZhuyjDetailExample.Criteria criteria = qunZhuyjDetailExample.createCriteria();
        if (obj.getOpId() != null) {
            criteria.andOpIdEqualTo(obj.getOpId());
        }
        if (obj.getParentId() != null) {
            criteria.andParentIdEqualTo(obj.getParentId());
        }
        return qunZhuyjDetailMapper.selectByExample(qunZhuyjDetailExample);
    }

    @Override
    public List<QunZhuyjDetail> getByExamleAndDate(QunZhuyjDetail qunZhuyjDetail, String start, String stop) {
        QunZhuyjDetailExample qunZhuyjDetailExample = new QunZhuyjDetailExample();
        QunZhuyjDetailExample.Criteria criteria = qunZhuyjDetailExample.createCriteria();
        if (qunZhuyjDetail.getOpId() != null) {
            criteria.andOpIdEqualTo(qunZhuyjDetail.getOpId());
        }
        if (qunZhuyjDetail.getParentId() != null) {
            criteria.andParentIdEqualTo(qunZhuyjDetail.getParentId());
        }
        //解析日期
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start1 = LocalDate.parse(start, formatter);
        start1 = start1.minusDays(1);
        LocalDate stop1 = LocalDate.parse(stop, formatter);

        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt1 = start1.atStartOfDay(zoneId);
        Date start2 = Date.from(zdt1.toInstant());

        ZonedDateTime zdt2 = stop1.atStartOfDay(zoneId);
        Date stop2 = Date.from(zdt2.toInstant());

//        Date star21= (Date) DateTimeFormatter.ofPattern("%Y-%m-%d").parse(start);
//        Date start1=new Date(start);
//        Date stop1=new Date(stop);
        criteria.andOpDateGreaterThan(start2).andOpDateLessThan(stop2);
//        criteria.andLoginDateBetween(start2,stop2);
        qunZhuyjDetailExample.setOrderByClause("op_date DESC");

        return qunZhuyjDetailMapper.selectByExample(qunZhuyjDetailExample);
    }
}
