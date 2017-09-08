package com.wasu.service;

import com.wasu.model.QunZhuyj;

import java.util.List;

/**
 * Created by kale on 2017/8/22.
 */
public interface QunZhuyjService {
    List<QunZhuyj> getAll();

    List<QunZhuyj> getByUserId(QunZhuyj obj);

    List<QunZhuyj> getByUserName(String name);

}
