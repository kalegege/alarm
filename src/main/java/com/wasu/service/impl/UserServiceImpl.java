package com.wasu.service.impl;

import com.wasu.dao.UserMapper;
import com.wasu.model.User;
import com.wasu.model.UserDO;
import com.wasu.model.UserExample;
import com.wasu.service.UserService;
import com.wasu.utils.MyUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/8/28.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    @Resource
    private UserMapper userMapper;

    @Override
    public Boolean isProved(UserDO userDO) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCodeEqualTo(userDO.getUserid()).andPasswordEqualTo(MyUtils.getSHA256Str(userDO.getPasswd()));
        List<User> result = userMapper.selectByExample(userExample);
        return result.size() >= 1 ? true : false;
    }

    @Override
    public List<User> getUserByCode(String userid) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCodeEqualTo(userid);
        return userMapper.selectByExample(userExample);
    }
}
