package com.moj.mapper;

import com.moj.entity.Userintegral;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserintegralMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Userintegral record);

    int insertSelective(Userintegral record);


    Userintegral selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Userintegral record);

    int updateByPrimaryKey(Userintegral record);
}