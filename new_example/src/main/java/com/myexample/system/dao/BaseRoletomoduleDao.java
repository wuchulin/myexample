package com.myexample.system.dao;

import com.myexample.system.model.BaseRoletomodule;
import com.myexample.system.model.BaseRoletomoduleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseRoletomoduleDao {
    int countByExample(BaseRoletomoduleExample example);

    int deleteByExample(BaseRoletomoduleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseRoletomodule record);

    int insertSelective(BaseRoletomodule record);

    List<BaseRoletomodule> selectByExample(BaseRoletomoduleExample example);

    BaseRoletomodule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseRoletomodule record, @Param("example") BaseRoletomoduleExample example);

    int updateByExample(@Param("record") BaseRoletomodule record, @Param("example") BaseRoletomoduleExample example);

    int updateByPrimaryKeySelective(BaseRoletomodule record);

    int updateByPrimaryKey(BaseRoletomodule record);
}