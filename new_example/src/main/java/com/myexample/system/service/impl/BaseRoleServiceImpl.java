package com.myexample.system.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseRoleDao;
import com.myexample.system.model.BaseRole;
import com.myexample.system.model.BaseRoleExample;
import com.myexample.system.model.BaseRoleExample.Criteria;
import com.myexample.system.service.BaseRoleService;

@Service("baseRoleService")
public class BaseRoleServiceImpl implements BaseRoleService {
	
	@Autowired
	private BaseRoleDao baseRoleDao;

	@Override
	public int insert(BaseRole baseRole) throws Exception {
		return this.baseRoleDao.insertSelective(baseRole);
	}

	@Override
	public int update(BaseRole baseRole) throws Exception {
		return this.baseRoleDao.updateByPrimaryKeySelective(baseRole);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseRoleDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseRole> list(BaseRole baseRole) {
		return null;
	}

	@Override
	public List<BaseRole> listAll() {
		// 这里构建条件
		BaseRoleExample example = new BaseRoleExample();
		
		// 设置排序方式
		example.setOrderByClause("id");

		return this.baseRoleDao.selectByExample(example);
	}

	@Override
	public BaseRole findOne(BaseRole baseRole) {
		return this.baseRoleDao.selectByPrimaryKey(baseRole.getId());
	}

	@Override
	public List<BaseRole> listByPage(BaseRole baseRole, Integer page, Integer rows) {
		// 这里构建条件
		BaseRoleExample example = new BaseRoleExample();
		
		Criteria c = example.createCriteria();
		if(StringUtils.isNotEmpty(baseRole.getName())) {
			c.andNameLike("%"+baseRole.getName()+"%");
		}
		
		if(StringUtils.isNotEmpty(baseRole.getDescription())) {
			c.andDescriptionLike("%"+baseRole.getDescription()+"%");
		}
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);

		return this.baseRoleDao.selectByExample(example);
	}
}
