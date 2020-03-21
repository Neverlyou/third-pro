package com.moj.mapper;

import com.moj.entity.Message;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);


    Message selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}