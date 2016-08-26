package com.myexample.system.dao;

import com.myexample.system.model.BaseUser;
import com.myexample.system.model.BaseUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseUserDao {
    int countByExample(BaseUserExample example);

    int deleteByExample(BaseUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    List<BaseUser> selectByExample(BaseUserExample example);

    BaseUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

    int updateByExample(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
}