package com.wasu.dao;

import com.wasu.model.LoginStatisticDate;
import com.wasu.model.LoginStatisticDateExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginStatisticDateMapper {
    int countByExample(LoginStatisticDateExample example);

    int deleteByExample(LoginStatisticDateExample example);

    int deleteByPrimaryKey(Date loginDate);

    int insert(LoginStatisticDate record);

    int insertSelective(LoginStatisticDate record);

    List<LoginStatisticDate> selectByExample(LoginStatisticDateExample example);

    LoginStatisticDate selectByPrimaryKey(Date loginDate);

    int updateByExampleSelective(@Param("record") LoginStatisticDate record, @Param("example") LoginStatisticDateExample example);

    int updateByExample(@Param("record") LoginStatisticDate record, @Param("example") LoginStatisticDateExample example);

    int updateByPrimaryKeySelective(LoginStatisticDate record);

    int updateByPrimaryKey(LoginStatisticDate record);
}