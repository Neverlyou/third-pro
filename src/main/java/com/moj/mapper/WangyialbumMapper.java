package com.moj.mapper;

import com.moj.entity.Wangyialbum;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WangyialbumMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Wangyialbum record);

    int insertSelective(Wangyialbum record);


    Wangyialbum selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Wangyialbum record);

    int updateByPrimaryKey(Wangyialbum record);
}