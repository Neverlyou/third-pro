package com.moj.mapper;

import com.moj.entity.Publishcritic;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishcriticMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Publishcritic record);

    int insertSelective(Publishcritic record);


    Publishcritic selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Publishcritic record);

    int updateByPrimaryKey(Publishcritic record);
}