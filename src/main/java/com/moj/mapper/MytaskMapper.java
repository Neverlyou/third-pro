package com.moj.mapper;

import com.moj.entity.Mytask;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MytaskMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Mytask record);

    int insertSelective(Mytask record);


    Mytask selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Mytask record);

    int updateByPrimaryKey(Mytask record);
}