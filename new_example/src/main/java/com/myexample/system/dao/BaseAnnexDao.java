package com.myexample.system.dao;

import com.myexample.system.model.BaseAnnex;
import com.myexample.system.model.BaseAnnexExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseAnnexDao {
    int countByExample(BaseAnnexExample example);

    int deleteByExample(BaseAnnexExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseAnnex record);

    int insertSelective(BaseAnnex record);

    List<BaseAnnex> selectByExample(BaseAnnexExample example);

    BaseAnnex selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseAnnex record, @Param("example") BaseAnnexExample example);

    int updateByExample(@Param("record") BaseAnnex record, @Param("example") BaseAnnexExample example);

    int updateByPrimaryKeySelective(BaseAnnex record);

    int updateByPrimaryKey(BaseAnnex record);
}