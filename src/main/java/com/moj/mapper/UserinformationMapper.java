package com.moj.mapper;

import com.moj.entity.Userinformation;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinformationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Userinformation record);

    int insertSelective(Userinformation record);


    Userinformation selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Userinformation record);

    int updateByPrimaryKey(Userinformation record);
}