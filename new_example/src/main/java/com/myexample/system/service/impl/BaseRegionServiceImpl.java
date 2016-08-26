package com.myexample.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseRegionDao;
import com.myexample.system.model.BaseRegion;
import com.myexample.system.model.BaseRegionExample;
import com.myexample.system.model.BaseRegionExample.Criteria;
import com.myexample.system.service.BaseRegionService;

@Service("baseRegionService")
public class BaseRegionServiceImpl implements BaseRegionService {
	
	@Autowired
	private BaseRegionDao baseRegionDao;

	@Override
	public int insert(BaseRegion object) throws Exception {
		return this.baseRegionDao.insertSelective(object);
	}

	@Override
	public int update(BaseRegion object) throws Exception {
		return this.baseRegionDao.updateByPrimaryKeySelective(object);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseRegionDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseRegion> list(BaseRegion object) {
		// 这里构建条件
		BaseRegionExample example = new BaseRegionExample();
		
		// 设置排序方式
		example.setOrderByClause("id");

		return this.baseRegionDao.selectByExample(example);
	}

	@Override
	public List<BaseRegion> listAll() {
		// 这里构建条件
		BaseRegionExample example = new BaseRegionExample();
		
		// 设置排序方式
		example.setOrderByClause("id");

		return this.baseRegionDao.selectByExample(example);
	}

	@Override
	public BaseRegion findOne(BaseRegion object) {
		return this.baseRegionDao.selectByPrimaryKey(object.getId());
	}

	@Override
	public List<BaseRegion> listByPage(BaseRegion object, Integer page,
			Integer rows) {
		// 这里构建条件
		BaseRegionExample example = new BaseRegionExample();
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);

		return this.baseRegionDao.selectByExample(example);
	}

	@Override
	public List<BaseRegion> findByparentid(Long id) {
		
		// 这里构建条件
		BaseRegionExample example = new BaseRegionExample();
		
		Criteria c = example.createCriteria();
		if(id != null)
			c.andParentidEqualTo(id);
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseRegionDao.selectByExample(example);
	}
}
