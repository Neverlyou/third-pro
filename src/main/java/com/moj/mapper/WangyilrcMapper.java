package com.moj.mapper;

import com.moj.entity.Wangyilrc;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WangyilrcMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Wangyilrc record);

    int insertSelective(Wangyilrc record);


    Wangyilrc selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Wangyilrc record);

    int updateByPrimaryKeyWithBLOBs(Wangyilrc record);
}