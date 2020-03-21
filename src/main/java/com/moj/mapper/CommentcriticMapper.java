package com.moj.mapper;

import com.moj.entity.Commentcritic;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentcriticMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Commentcritic record);

    int insertSelective(Commentcritic record);


    Commentcritic selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Commentcritic record);

    int updateByPrimaryKey(Commentcritic record);
}