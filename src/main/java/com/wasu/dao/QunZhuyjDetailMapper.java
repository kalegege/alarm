package com.wasu.dao;

import com.wasu.model.QunZhuyjDetail;
import com.wasu.model.QunZhuyjDetailExample;
import com.wasu.model.QunZhuyjGroupDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QunZhuyjDetailMapper {
    int countByExample(QunZhuyjDetailExample example);

    int deleteByExample(QunZhuyjDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QunZhuyjDetail record);

    int insertSelective(QunZhuyjDetail record);

    List<QunZhuyjDetail> selectByExample(QunZhuyjDetailExample example);

    List<QunZhuyjGroupDetail> getByExamleAndDateGroup(QunZhuyjDetailExample example);

    QunZhuyjDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QunZhuyjDetail record, @Param("example") QunZhuyjDetailExample example);

    int updateByExample(@Param("record") QunZhuyjDetail record, @Param("example") QunZhuyjDetailExample example);

    int updateByPrimaryKeySelective(QunZhuyjDetail record);

    int updateByPrimaryKey(QunZhuyjDetail record);
}