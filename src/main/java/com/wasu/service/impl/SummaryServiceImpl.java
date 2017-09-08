package com.wasu.service.impl;

import com.wasu.dao.CallMapper;
import com.wasu.dao.SummaryMapper;
import com.wasu.model.Summary;
import com.wasu.model.SummaryExample;
import com.wasu.service.SummaryService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/8/11.
 */
@Service("SummaryService")
public class SummaryServiceImpl implements SummaryService{

    private static Logger logger = Logger.getLogger(CallServiceImpl.class.getName());

    @Resource
    private SummaryMapper summaryMapper;

    @Override
    public List<Summary> getSummary() {
        SummaryExample summaryExample =new SummaryExample();
        SummaryExample.Criteria criteria=summaryExample.createCriteria();
        return summaryMapper.selectByExample(summaryExample);
    }
}
