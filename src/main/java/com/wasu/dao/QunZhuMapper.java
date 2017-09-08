package com.wasu.dao;

import com.wasu.model.QunZhu;
import com.wasu.model.QunZhuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QunZhuMapper {
    int countByExample(QunZhuExample example);

    int deleteByExample(QunZhuExample example);

    int insert(QunZhu record);

    int insertSelective(QunZhu record);

    List<QunZhu> selectByExample(QunZhuExample example);

    int updateByExampleSelective(@Param("record") QunZhu record, @Param("example") QunZhuExample example);

    int updateByExample(@Param("record") QunZhu record, @Param("example") QunZhuExample example);
}