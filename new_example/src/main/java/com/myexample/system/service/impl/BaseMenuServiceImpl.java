package com.myexample.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseMenuDao;
import com.myexample.system.model.BaseMenu;
import com.myexample.system.model.BaseMenuExample;
import com.myexample.system.model.BaseMenuExample.Criteria;
import com.myexample.system.service.BaseMenuService;

@Service("baseMenuService")
public class BaseMenuServiceImpl implements BaseMenuService {
	
	@Autowired
	private BaseMenuDao baseMenuDao;

	@Override
	public int insert(BaseMenu baseMenu) throws Exception {
		return this.baseMenuDao.insertSelective(baseMenu);
	}

	@Override
	public int update(BaseMenu baseMenu) throws Exception {
		return this.baseMenuDao.updateByPrimaryKeySelective(baseMenu);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseMenuDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseMenu> list(BaseMenu baseMenu) {
		return null;
	}

	@Override
	public List<BaseMenu> listAll() {
		return null;
	}

	@Override
	public BaseMenu findOne(BaseMenu baseMenu) {
		return this.baseMenuDao.selectByPrimaryKey(baseMenu.getId());
	}

	@Override
	public List<BaseMenu> listByPage(BaseMenu baseMenu, Integer page, Integer rows) {
		BaseMenuExample example = new BaseMenuExample();
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		
		return this.baseMenuDao.selectByExample(example);
	}

	@Override
	public List<BaseMenu> findByParentid(Long id) {
		BaseMenuExample example = new BaseMenuExample();
		
		Criteria c = example.createCriteria();
		if(id != null)
			c.andParentidEqualTo(id);
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseMenuDao.selectByExample(example);
	}
}
