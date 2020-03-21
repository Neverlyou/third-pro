package com.moj.mapper;

import com.moj.entity.Checkin;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckinMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Checkin record);

    int insertSelective(Checkin record);


    Checkin selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Checkin record);

    int updateByPrimaryKey(Checkin record);
}