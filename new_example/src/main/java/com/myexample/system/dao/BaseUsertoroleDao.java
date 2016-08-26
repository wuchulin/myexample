package com.myexample.system.dao;

import com.myexample.system.model.BaseUsertorole;
import com.myexample.system.model.BaseUsertoroleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseUsertoroleDao {
    int countByExample(BaseUsertoroleExample example);

    int deleteByExample(BaseUsertoroleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseUsertorole record);

    int insertSelective(BaseUsertorole record);

    List<BaseUsertorole> selectByExample(BaseUsertoroleExample example);

    BaseUsertorole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseUsertorole record, @Param("example") BaseUsertoroleExample example);

    int updateByExample(@Param("record") BaseUsertorole record, @Param("example") BaseUsertoroleExample example);

    int updateByPrimaryKeySelective(BaseUsertorole record);

    int updateByPrimaryKey(BaseUsertorole record);
}