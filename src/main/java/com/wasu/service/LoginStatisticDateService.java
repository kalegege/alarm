package com.wasu.service;

import com.wasu.model.LoginStatisticDate;

import java.util.List;

/**
 * Created by kale on 2017/8/17.
 */
public interface LoginStatisticDateService {
    //获取所有数据
    List<LoginStatisticDate> getAll();
    //获取指定时间段数据
    List<LoginStatisticDate> getCertainTime(String start,String stop);

}
