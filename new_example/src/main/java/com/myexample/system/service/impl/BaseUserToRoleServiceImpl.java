package com.myexample.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseUsertoroleDao;
import com.myexample.system.model.BaseUsertorole;
import com.myexample.system.model.BaseUsertoroleExample;
import com.myexample.system.model.BaseUsertoroleExample.Criteria;
import com.myexample.system.service.BaseUserToRoleService;

@Service("baseUserToRoleService")
public class BaseUserToRoleServiceImpl implements BaseUserToRoleService {
	
	@Autowired
	private BaseUsertoroleDao baseUsertoroleDao;

	@Override
	public int insert(BaseUsertorole baseUsertorole) throws Exception {
		return this.baseUsertoroleDao.insertSelective(baseUsertorole);
	}

	@Override
	public int update(BaseUsertorole baseUsertorole) throws Exception {
		return this.baseUsertoroleDao.updateByPrimaryKeySelective(baseUsertorole);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseUsertoroleDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseUsertorole> list(BaseUsertorole baseUsertorole) {
		BaseUsertoroleExample example = new BaseUsertoroleExample();
		
		Criteria c = example.createCriteria();
		if(baseUsertorole.getUserid() != null)
			c.andUseridEqualTo(baseUsertorole.getUserid());
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseUsertoroleDao.selectByExample(example);
	}

	@Override
	public List<BaseUsertorole> listAll() {
		return null;
	}

	@Override
	public BaseUsertorole findOne(BaseUsertorole baseUsertorole) {
		return this.baseUsertoroleDao.selectByPrimaryKey(baseUsertorole.getId());
	}

	@Override
	public List<BaseUsertorole> listByPage(BaseUsertorole baseUsertorole, Integer page,
			Integer rows) {
		BaseUsertoroleExample example = new BaseUsertoroleExample();
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		
		return this.baseUsertoroleDao.selectByExample(example);
	}

	@Override
	public List<BaseUsertorole> findByUserid(Long id) {
		BaseUsertoroleExample example = new BaseUsertoroleExample();
		
		Criteria c = example.createCriteria();
		if(id != null)
			c.andUseridEqualTo(id);
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseUsertoroleDao.selectByExample(example);
	}
}
