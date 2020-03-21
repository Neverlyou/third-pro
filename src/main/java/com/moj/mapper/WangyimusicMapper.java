package com.moj.mapper;

import com.moj.entity.Wangyimusic;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WangyimusicMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Wangyimusic record);

    int insertSelective(Wangyimusic record);


    Wangyimusic selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Wangyimusic record);

    int updateByPrimaryKey(Wangyimusic record);
}