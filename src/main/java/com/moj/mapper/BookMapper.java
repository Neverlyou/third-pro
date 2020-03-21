package com.moj.mapper;

import com.moj.entity.Book;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {

    int deleteByPrimaryKey(String id);

    int insert(Book record);

    int insertSelective(Book record);


    Book selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}