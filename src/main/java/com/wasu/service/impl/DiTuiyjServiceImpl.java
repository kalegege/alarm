package com.wasu.service.impl;

import com.wasu.dao.DiTuiyjMapper;
import com.wasu.model.DiTuiyj;
import com.wasu.model.DiTuiyjExample;
import com.wasu.service.DiTuiyjService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/8/23.
 */
@Service("DiTuiService")
public class DiTuiyjServiceImpl implements DiTuiyjService {
    private static Logger logger = Logger.getLogger(DiTuiyjServiceImpl.class.getName());

    @Resource
    private DiTuiyjMapper diTuiyjMapper;

    @Override
    public List<DiTuiyj> getAll() {
        DiTuiyjExample diTuiyjExample=new DiTuiyjExample();
        DiTuiyjExample.Criteria criteria=diTuiyjExample.createCriteria();
        return diTuiyjMapper.selectByExample(diTuiyjExample);
    }

//    @Override
//    public List<DiTuiyj> getByUserName(String name) {
//        return diTuiyjMapper.selectByName(name);
//    }
}
