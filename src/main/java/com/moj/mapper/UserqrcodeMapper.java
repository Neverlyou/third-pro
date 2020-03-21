package com.moj.mapper;

import com.moj.entity.Userqrcode;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserqrcodeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Userqrcode record);

    int insertSelective(Userqrcode record);


    Userqrcode selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Userqrcode record);

    int updateByPrimaryKey(Userqrcode record);
}