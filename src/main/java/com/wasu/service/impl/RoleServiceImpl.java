package com.wasu.service.impl;

import com.wasu.dao.RoleMapper;
import com.wasu.model.Role;
import com.wasu.model.RoleExample;
import com.wasu.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kale on 2017/9/6.
 */
@Service("RoleService")
public class RoleServiceImpl implements RoleService {

    private static Logger logger = Logger.getLogger(RoleServiceImpl.class.getName());


    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role getRoleByUserId(String userId) {
        logger.info("getRoleByUserId-----userId:" + userId);
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        return roleMapper.selectByExampleByUserId(userId);
    }
}
