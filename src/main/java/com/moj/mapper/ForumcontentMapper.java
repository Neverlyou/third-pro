package com.moj.mapper;

import com.moj.entity.Forumcontent;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumcontentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Forumcontent record);

    int insertSelective(Forumcontent record);


    Forumcontent selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Forumcontent record);

    int updateByPrimaryKey(Forumcontent record);
}