package com.moj.mapper;

import com.moj.entity.Movieforum;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieforumMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Movieforum record);

    int insertSelective(Movieforum record);


    Movieforum selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Movieforum record);

    int updateByPrimaryKey(Movieforum record);
}