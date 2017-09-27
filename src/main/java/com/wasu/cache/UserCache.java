package com.wasu.cache;

import com.wasu.model.User;
import com.wasu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/9/27.
 */
@Service("UserCache")
public class UserCache extends DbCache<String, List<User>> {

    @Resource
    private UserService userService;

    @Override
    protected List<User> fetch(String key) {
        return userService.getUserByCode(key);
    }
}
