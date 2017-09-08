package com.wasu.service;

import com.wasu.model.User;
import com.wasu.model.UserDO;

import java.util.List;

/**
 * baozezhou
 * 123456
 * Created by kale on 2017/8/28.
 */
public interface UserService {
    Boolean isProved(UserDO userDO);

    List<User> getUserByCode(String userid);
}
