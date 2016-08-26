package com.myexample.system.dao;

import com.myexample.system.model.BaseRole;
import com.myexample.system.model.BaseRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseRoleDao {
    int countByExample(BaseRoleExample example);

    int deleteByExample(BaseRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseRole record);

    int insertSelective(BaseRole record);

    List<BaseRole> selectByExample(BaseRoleExample example);

    BaseRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseRole record, @Param("example") BaseRoleExample example);

    int updateByExample(@Param("record") BaseRole record, @Param("example") BaseRoleExample example);

    int updateByPrimaryKeySelective(BaseRole record);

    int updateByPrimaryKey(BaseRole record);
}