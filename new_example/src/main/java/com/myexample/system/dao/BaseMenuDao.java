package com.myexample.system.dao;

import com.myexample.system.model.BaseMenu;
import com.myexample.system.model.BaseMenuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMenuDao {
    int countByExample(BaseMenuExample example);

    int deleteByExample(BaseMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseMenu record);

    int insertSelective(BaseMenu record);

    List<BaseMenu> selectByExample(BaseMenuExample example);

    BaseMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseMenu record, @Param("example") BaseMenuExample example);

    int updateByExample(@Param("record") BaseMenu record, @Param("example") BaseMenuExample example);

    int updateByPrimaryKeySelective(BaseMenu record);

    int updateByPrimaryKey(BaseMenu record);
}