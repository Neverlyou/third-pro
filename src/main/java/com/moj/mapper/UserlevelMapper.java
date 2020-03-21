package com.moj.mapper;

import com.moj.entity.Userlevel;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlevelMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Userlevel record);

    int insertSelective(Userlevel record);


    Userlevel selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Userlevel record);

    int updateByPrimaryKey(Userlevel record);
}