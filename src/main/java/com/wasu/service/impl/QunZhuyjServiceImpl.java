package com.wasu.service.impl;

import com.wasu.dao.LoginStatisticDateMapper;
import com.wasu.dao.QunZhuyjMapper;
import com.wasu.model.LoginStatisticDateExample;
import com.wasu.model.QunZhuyj;
import com.wasu.model.QunZhuyjExample;
import com.wasu.service.QunZhuyjService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/8/22.
 */
@Service("QunZhuyjService")
public class QunZhuyjServiceImpl implements QunZhuyjService {
    private static Logger logger = Logger.getLogger(QunZhuyjServiceImpl.class.getName());

    @Resource
    private QunZhuyjMapper qunZhuyjMapper;

    @Override
    public List<QunZhuyj> getAll() {
        QunZhuyjExample qunZhuyjExample =new QunZhuyjExample();
        QunZhuyjExample.Criteria criteria=qunZhuyjExample.createCriteria();
        return qunZhuyjMapper.selectByExample(qunZhuyjExample);
    }

    @Override
    public List<QunZhuyj> getByUserId(QunZhuyj obj) {
        QunZhuyjExample qunZhuyjExample =new QunZhuyjExample();
        QunZhuyjExample.Criteria criteria=qunZhuyjExample.createCriteria();
        if(obj.get发展人id()!= null){
            criteria.and发展人idEqualTo(obj.get发展人id());
        }
        if(obj.get群主id()!=null){
            criteria.and群主idEqualTo(obj.get群主id());
        }
        return qunZhuyjMapper.selectByExample(qunZhuyjExample);
    }

    @Override
    public List<QunZhuyj> getByUserName(String name) {
        return qunZhuyjMapper.selectByName(name);
    }
}
