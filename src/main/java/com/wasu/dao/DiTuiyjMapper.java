package com.wasu.dao;

import com.wasu.model.DiTuiyj;
import com.wasu.model.DiTuiyjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiTuiyjMapper {
    int countByExample(DiTuiyjExample example);

    int deleteByExample(DiTuiyjExample example);

    int insert(DiTuiyj record);

    int insertSelective(DiTuiyj record);

    List<DiTuiyj> selectByExample(DiTuiyjExample example);

    int updateByExampleSelective(@Param("record") DiTuiyj record, @Param("example") DiTuiyjExample example);

    int updateByExample(@Param("record") DiTuiyj record, @Param("example") DiTuiyjExample example);
}