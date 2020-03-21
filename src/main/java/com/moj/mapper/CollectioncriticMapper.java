package com.moj.mapper;

import com.moj.entity.Collectioncritic;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectioncriticMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Collectioncritic record);

    int insertSelective(Collectioncritic record);


    Collectioncritic selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Collectioncritic record);

    int updateByPrimaryKey(Collectioncritic record);
}