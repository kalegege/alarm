package com.wasu.service.impl;

import com.wasu.dao.QunZhuyjDetailMapper;
import com.wasu.model.QunZhuyjDetail;
import com.wasu.model.QunZhuyjDetailExample;
import com.wasu.model.QunZhuyjGroupDetail;
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
        QunZhuyjDetailExample qunZhuyjDetailExample = addParams(qunZhuyjDetail, start, stop);

        return qunZhuyjDetailMapper.selectByExample(qunZhuyjDetailExample);
    }

    private QunZhuyjDetailExample addParams(QunZhuyjDetail qunZhuyjDetail, String start, String stop) {
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

        criteria.andOpDateGreaterThan(start2).andOpDateLessThan(stop2);
        qunZhuyjDetailExample.setOrderByClause("op_date DESC");
        return qunZhuyjDetailExample;
    }

    @Override
    public List<QunZhuyjGroupDetail> getByExamleAndDateGroup(QunZhuyjDetail qunZhuyjDetail, String start, String stop) {
        QunZhuyjDetailExample qunZhuyjDetailExample = addParams(qunZhuyjDetail, start, stop);
        return qunZhuyjDetailMapper.getByExamleAndDateGroup(qunZhuyjDetailExample);
    }
}
