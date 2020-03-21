package com.moj.mapper;

import com.moj.entity.Moviename;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovienameMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Moviename record);

    int insertSelective(Moviename record);


    Moviename selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Moviename record);

    int updateByPrimaryKey(Moviename record);
}