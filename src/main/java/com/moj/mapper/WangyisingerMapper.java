package com.moj.mapper;

import com.moj.entity.Wangyisinger;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WangyisingerMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Wangyisinger record);

    int insertSelective(Wangyisinger record);


    Wangyisinger selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Wangyisinger record);

    int updateByPrimaryKey(Wangyisinger record);
}