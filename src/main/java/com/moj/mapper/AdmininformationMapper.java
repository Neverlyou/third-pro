package com.moj.mapper;

import com.moj.entity.Admininformation;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmininformationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Admininformation record);

    int insertSelective(Admininformation record);


    Admininformation selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(Admininformation record);

    int updateByPrimaryKey(Admininformation record);
}