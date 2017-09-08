package com.wasu.service.impl;

import com.wasu.dao.LoginStatisticDateMapper;
import com.wasu.dao.QunZhuyjDetailMapper;
import com.wasu.model.QunZhuyjDetail;
import com.wasu.model.QunZhuyjDetailExample;
import com.wasu.service.QunZhuyjDetailService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/8/24.
 */
@Service("QunZhuyjDetailService")
public class QunZhuyjDetailServiceImpl implements QunZhuyjDetailService{
    private static Logger logger = Logger.getLogger(QunZhuyjDetailServiceImpl.class.getName());

    @Resource
    private QunZhuyjDetailMapper qunZhuyjDetailMapper;

    @Override
    public List<QunZhuyjDetail> getAll() {
        QunZhuyjDetailExample qunZhuyjDetailExample=new QunZhuyjDetailExample();
        QunZhuyjDetailExample.Criteria criteria=qunZhuyjDetailExample.createCriteria();
        return qunZhuyjDetailMapper.selectByExample(qunZhuyjDetailExample);
    }

    @Override
    public List<QunZhuyjDetail> getByExamle(QunZhuyjDetail obj) {
        QunZhuyjDetailExample qunZhuyjDetailExample=new QunZhuyjDetailExample();
        QunZhuyjDetailExample.Criteria criteria=qunZhuyjDetailExample.createCriteria();
        if(obj.getOpId()!= null){
            criteria.andOpIdEqualTo(obj.getOpId());
        }
        if(obj.getParentId()!=null){
            criteria.andParentIdEqualTo(obj.getParentId());
        }
        return qunZhuyjDetailMapper.selectByExample(qunZhuyjDetailExample);
    }
}
