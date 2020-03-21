package com.moj.mapper;

import com.moj.entity.Integralsource;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralsourceMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Integralsource record);

    int insertSelective(Integralsource record);


    Integralsource selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Integralsource record);

    int updateByPrimaryKey(Integralsource record);
}