package com.myexample.system.dao;

import com.myexample.system.model.BaseDatadictionary;
import com.myexample.system.model.BaseDatadictionaryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseDatadictionaryDao {
    int countByExample(BaseDatadictionaryExample example);

    int deleteByExample(BaseDatadictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseDatadictionary record);

    int insertSelective(BaseDatadictionary record);

    List<BaseDatadictionary> selectByExample(BaseDatadictionaryExample example);

    BaseDatadictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseDatadictionary record, @Param("example") BaseDatadictionaryExample example);

    int updateByExample(@Param("record") BaseDatadictionary record, @Param("example") BaseDatadictionaryExample example);

    int updateByPrimaryKeySelective(BaseDatadictionary record);

    int updateByPrimaryKey(BaseDatadictionary record);
}