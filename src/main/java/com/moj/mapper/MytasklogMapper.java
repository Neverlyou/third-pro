package com.moj.mapper;

import com.moj.entity.Mytasklog;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MytasklogMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Mytasklog record);

    int insertSelective(Mytasklog record);


    Mytasklog selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Mytasklog record);

    int updateByPrimaryKey(Mytasklog record);
}