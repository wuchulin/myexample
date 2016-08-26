package com.myexample.first.dao;

import com.myexample.first.model.NewObject;
import com.myexample.first.model.NewObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewObjectDao {
    int countByExample(NewObjectExample example);

    int deleteByExample(NewObjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NewObject record);

    int insertSelective(NewObject record);

    List<NewObject> selectByExample(NewObjectExample example);

    NewObject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NewObject record, @Param("example") NewObjectExample example);

    int updateByExample(@Param("record") NewObject record, @Param("example") NewObjectExample example);

    int updateByPrimaryKeySelective(NewObject record);

    int updateByPrimaryKey(NewObject record);
}