package com.wasu.service;

import com.wasu.model.DiTuiyj;

import java.util.List;

/**
 * Created by kale on 2017/8/23.
 */
public interface DiTuiyjService {
    List<DiTuiyj> getAll();

    List<DiTuiyj> getByUserId(Long id);
}
