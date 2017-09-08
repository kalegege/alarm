package com.wasu.service.impl;

import com.wasu.dao.QunZhuMapper;
import com.wasu.model.QunZhu;
import com.wasu.model.QunZhuExample;
import com.wasu.service.QunZhuService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kale on 2017/9/7.
 */
@Service("QunZhuService")
public class QunZhuServiceImpl implements QunZhuService {

    private static Logger logger = Logger.getLogger(QunZhuServiceImpl.class.getName());


    @Autowired
    private QunZhuMapper qunZhuMapper;
    @Override
    public List<QunZhu> getAll() {
        QunZhuExample qunZhuExample=new QunZhuExample();
        QunZhuExample.Criteria criteria=qunZhuExample.createCriteria();
        return qunZhuMapper.selectByExample(qunZhuExample);
    }
}
