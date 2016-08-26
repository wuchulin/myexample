package com.myexample.system.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseModuleDao;
import com.myexample.system.model.BaseModule;
import com.myexample.system.model.BaseModuleExample;
import com.myexample.system.model.BaseModuleExample.Criteria;
import com.myexample.system.service.BaseModuleService;

@Service("baseModuleService")
public class BaseModuleServiceIml implements BaseModuleService {
	
	@Autowired
	private BaseModuleDao baseModuleDao;

	@Override
	public int insert(BaseModule baseModule) throws Exception {
		return this.baseModuleDao.insertSelective(baseModule);
	}

	@Override
	public int update(BaseModule baseModule) throws Exception {
		return this.baseModuleDao.updateByPrimaryKeySelective(baseModule);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseModuleDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseModule> list(BaseModule baseModule) {
		return null;
	}

	@Override
	public List<BaseModule> listAll() {
		BaseModuleExample example = new BaseModuleExample();
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseModuleDao.selectByExample(example);
	}

	@Override
	public BaseModule findOne(BaseModule baseModule) {
		return this.baseModuleDao.selectByPrimaryKey(baseModule.getId());
	}

	@Override
	public List<BaseModule> listByPage(BaseModule baseModule, Integer page,
			Integer rows) {
		BaseModuleExample example = new BaseModuleExample();
		
		Criteria c = example.createCriteria();
		if(StringUtils.isNotEmpty(baseModule.getName())) {
			c.andNameLike("%"+baseModule.getName()+"%");
		}
		
		if(StringUtils.isNotEmpty(baseModule.getDescription())) {
			c.andDescriptionLike("%"+baseModule.getDescription()+"%");
		}
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		return this.baseModuleDao.selectByExample(example);
	}

}
