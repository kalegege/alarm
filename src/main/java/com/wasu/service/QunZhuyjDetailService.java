package com.wasu.service;

import com.wasu.model.QunZhuyjDetail;
import com.wasu.model.QunZhuyjDetailExample;

import java.util.List;

/**
 * Created by kale on 2017/8/24.
 */
public interface QunZhuyjDetailService {
    List<QunZhuyjDetail> getAll();

    List<QunZhuyjDetail> getByExamle(QunZhuyjDetail qunZhuyjDetail);
}
