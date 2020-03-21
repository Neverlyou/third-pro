package com.moj.mapper;

import com.moj.entity.Goodcritic;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodcriticMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Goodcritic record);

    int insertSelective(Goodcritic record);


    Goodcritic selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Goodcritic record);

    int updateByPrimaryKey(Goodcritic record);
}