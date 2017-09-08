package com.wasu.service;

import com.wasu.model.Role;

/**
 * Created by kale on 2017/9/6.
 */
public interface RoleService {
    Role getRoleByUserId(String userId);
}
