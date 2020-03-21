package com.moj.mapper;

import com.moj.entity.Myfriends;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyfriendsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Myfriends record);

    int insertSelective(Myfriends record);


    Myfriends selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Myfriends record);

    int updateByPrimaryKey(Myfriends record);
}