package com.myexample.system.dao;

import com.myexample.system.model.BaseModule;
import com.myexample.system.model.BaseModuleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseModuleDao {
    int countByExample(BaseModuleExample example);

    int deleteByExample(BaseModuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseModule record);

    int insertSelective(BaseModule record);

    List<BaseModule> selectByExample(BaseModuleExample example);

    BaseModule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseModule record, @Param("example") BaseModuleExample example);

    int updateByExample(@Param("record") BaseModule record, @Param("example") BaseModuleExample example);

    int updateByPrimaryKeySelective(BaseModule record);

    int updateByPrimaryKey(BaseModule record);
}