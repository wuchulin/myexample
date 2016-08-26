package com.myexample.system.dao;

import com.myexample.system.model.BaseRoletomenu;
import com.myexample.system.model.BaseRoletomenuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseRoletomenuDao {
    int countByExample(BaseRoletomenuExample example);

    int deleteByExample(BaseRoletomenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseRoletomenu record);

    int insertSelective(BaseRoletomenu record);

    List<BaseRoletomenu> selectByExample(BaseRoletomenuExample example);

    BaseRoletomenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseRoletomenu record, @Param("example") BaseRoletomenuExample example);

    int updateByExample(@Param("record") BaseRoletomenu record, @Param("example") BaseRoletomenuExample example);

    int updateByPrimaryKeySelective(BaseRoletomenu record);

    int updateByPrimaryKey(BaseRoletomenu record);
}