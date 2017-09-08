package com.wasu.service;

import com.wasu.model.Authority;

import java.util.List;

/**
 * Created by kale on 2017/9/6.
 */
public interface AuthorityService {
    List<Authority> getMenuByUserId(String userId);
}
