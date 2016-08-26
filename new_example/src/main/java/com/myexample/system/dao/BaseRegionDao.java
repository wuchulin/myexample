package com.myexample.system.dao;

import com.myexample.system.model.BaseRegion;
import com.myexample.system.model.BaseRegionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseRegionDao {
    int countByExample(BaseRegionExample example);

    int deleteByExample(BaseRegionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseRegion record);

    int insertSelective(BaseRegion record);

    List<BaseRegion> selectByExample(BaseRegionExample example);

    BaseRegion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseRegion record, @Param("example") BaseRegionExample example);

    int updateByExample(@Param("record") BaseRegion record, @Param("example") BaseRegionExample example);

    int updateByPrimaryKeySelective(BaseRegion record);

    int updateByPrimaryKey(BaseRegion record);
}