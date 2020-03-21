package com.moj.mapper;

import com.moj.entity.CriticReport;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CriticReportMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CriticReport record);

    int insertSelective(CriticReport record);


    CriticReport selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(CriticReport record);

    int updateByPrimaryKey(CriticReport record);
}