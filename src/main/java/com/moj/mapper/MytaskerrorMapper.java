package com.moj.mapper;

import com.moj.entity.Mytaskerror;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MytaskerrorMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Mytaskerror record);

    int insertSelective(Mytaskerror record);


    Mytaskerror selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Mytaskerror record);

    int updateByPrimaryKey(Mytaskerror record);
}