package com.moj.mapper;

import com.moj.entity.Userheadpicture;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserheadpictureMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Userheadpicture record);

    int insertSelective(Userheadpicture record);


    Userheadpicture selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Userheadpicture record);

    int updateByPrimaryKey(Userheadpicture record);
}