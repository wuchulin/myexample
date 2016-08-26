package com.myexample.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseRoletomenuDao;
import com.myexample.system.model.BaseRoletomenu;
import com.myexample.system.model.BaseRoletomenuExample;
import com.myexample.system.model.BaseRoletomenuExample.Criteria;
import com.myexample.system.service.BaseRoleToMenuService;

@Service("baseRoleToMenuService")
public class BaseRoleToMenuServiceImpl implements BaseRoleToMenuService {
	
	@Autowired
	private BaseRoletomenuDao baseRoletomenuDao;

	@Override
	public int insert(BaseRoletomenu baseRoletomenu) throws Exception {
		return this.baseRoletomenuDao.insertSelective(baseRoletomenu);
	}

	@Override
	public int update(BaseRoletomenu baseRoletomenu) throws Exception {
		return this.baseRoletomenuDao.updateByPrimaryKeySelective(baseRoletomenu);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseRoletomenuDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseRoletomenu> list(BaseRoletomenu baseRoletomenu) {
		return null;
	}

	@Override
	public List<BaseRoletomenu> listAll() {
		return null;
	}

	@Override
	public BaseRoletomenu findOne(BaseRoletomenu baseRoletomenu) {
		return null;
	}

	@Override
	public List<BaseRoletomenu> listByPage(BaseRoletomenu baseRoletomenu, Integer page,
			Integer rows) {
		
		BaseRoletomenuExample example = new BaseRoletomenuExample();
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		
		return this.baseRoletomenuDao.selectByExample(example);
	}

	@Override
	public List<BaseRoletomenu> findByRoleid(Long id) {
		BaseRoletomenuExample example = new BaseRoletomenuExample();
		
		Criteria c = example.createCriteria();
		if(id != null)
			c.andRoleidEqualTo(id);
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseRoletomenuDao.selectByExample(example);
	}

	@Override
	public List<BaseRoletomenu> findByMenuid(Long id) {
BaseRoletomenuExample example = new BaseRoletomenuExample();
		
		Criteria c = example.createCriteria();
		if(id != null)
			c.andMenuidEqualTo(id);
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseRoletomenuDao.selectByExample(example);
	}

}
