package com.moj.mapper;

import com.moj.entity.Userpassword;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserpasswordMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Userpassword record);

    int insertSelective(Userpassword record);


    Userpassword selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Userpassword record);

    int updateByPrimaryKey(Userpassword record);
}