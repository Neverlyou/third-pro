package com.moj.mapper;

import com.moj.entity.Adminaction;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminactionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Adminaction record);

    int insertSelective(Adminaction record);


    Adminaction selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(Adminaction record);

    int updateByPrimaryKey(Adminaction record);
}