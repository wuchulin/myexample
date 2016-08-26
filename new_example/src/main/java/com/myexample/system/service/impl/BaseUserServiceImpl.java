package com.myexample.system.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseUserDao;
import com.myexample.system.model.BaseUser;
import com.myexample.system.model.BaseUserExample;
import com.myexample.system.model.BaseUserExample.Criteria;
import com.myexample.system.service.BaseUserService;

@Service("baseUserService")
public class BaseUserServiceImpl implements BaseUserService {
	
	@Autowired
	private BaseUserDao baseUserDao;

	@Override
	public int insert(BaseUser baseUser) throws Exception {
		return this.baseUserDao.insertSelective(baseUser);
	}

	@Override
	public int update(BaseUser baseUser) throws Exception {
		return this.baseUserDao.updateByPrimaryKeySelective(baseUser);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseUserDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseUser> list(BaseUser baseUser) {
		// 这里构建条件
		BaseUserExample example = new BaseUserExample();
		
		Criteria c = example.createCriteria();
		if(StringUtils.isNotEmpty(baseUser.getLoginid()))
			c.andLoginidEqualTo(baseUser.getLoginid());
		
		if(StringUtils.isNotEmpty(baseUser.getPassword()))
			c.andPasswordEqualTo(baseUser.getPassword());
		
		// 设置排序方式
		example.setOrderByClause("id");

		return this.baseUserDao.selectByExample(example);
	}

	@Override
	public List<BaseUser> listAll() {
		// 这里构建条件
		BaseUserExample example = new BaseUserExample();
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseUserDao.selectByExample(example);
	}

	@Override
	public BaseUser findOne(BaseUser baseUser) {
		return this.baseUserDao.selectByPrimaryKey(baseUser.getId());
	}

	@Override
	public List<BaseUser> listByPage(BaseUser baseUser, Integer page, Integer rows) {
		// 这里构建条件
		BaseUserExample example = new BaseUserExample();
		
		Criteria c = example.createCriteria();
		if(StringUtils.isNotEmpty(baseUser.getName()))
			c.andNameLike("%"+baseUser.getName()+"%");
		
		if(StringUtils.isNotEmpty(baseUser.getLoginid()))
			c.andLoginidLike("%"+baseUser.getLoginid()+"%");
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		
		return this.baseUserDao.selectByExample(example);
	}
}
