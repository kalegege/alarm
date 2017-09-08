package com.wasu.dao;

import com.wasu.model.QunZhuyj;
import com.wasu.model.QunZhuyjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QunZhuyjMapper {
    int countByExample(QunZhuyjExample example);

    int deleteByExample(QunZhuyjExample example);

    int insert(QunZhuyj record);

    int insertSelective(QunZhuyj record);

    List<QunZhuyj> selectByExample(QunZhuyjExample example);

    List<QunZhuyj> selectByName(String name);

    int updateByExampleSelective(@Param("record") QunZhuyj record, @Param("example") QunZhuyjExample example);

    int updateByExample(@Param("record") QunZhuyj record, @Param("example") QunZhuyjExample example);
}