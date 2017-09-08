package com.wasu.service.impl;

import com.wasu.dao.AuthorityMapper;
import com.wasu.model.Authority;
import com.wasu.model.AuthorityExample;
import com.wasu.service.AuthorityService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kale on 2017/9/6.
 */
@Service("AuthorityService")
public class AuthorityServiceImpl implements AuthorityService {

    private static Logger logger = Logger.getLogger(AuthorityServiceImpl.class.getName());

    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public List<Authority> getMenuByUserId(String userId) {
        AuthorityExample authorityExample=new AuthorityExample();
        AuthorityExample.Criteria criteria=authorityExample.createCriteria();

        return authorityMapper.selectByExampleByUserId(userId);
    }
}
