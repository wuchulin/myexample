package com.myexample.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseDatadictionaryDao;
import com.myexample.system.model.BaseDatadictionary;
import com.myexample.system.model.BaseDatadictionaryExample;
import com.myexample.system.model.BaseDatadictionaryExample.Criteria;
import com.myexample.system.service.BaseDataDictionaryService;

@Service("baseDataDictionaryService")
public class BaseDataDictionaryServiceImpl implements BaseDataDictionaryService {
	
	@Autowired
	private BaseDatadictionaryDao baseDatadictionaryDao;

	@Override
	public int insert(BaseDatadictionary baseDatadictionary) throws Exception {
		return this.baseDatadictionaryDao.insertSelective(baseDatadictionary);
	}

	@Override
	public int update(BaseDatadictionary baseDatadictionary) throws Exception {
		return this.baseDatadictionaryDao.updateByPrimaryKeySelective(baseDatadictionary);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseDatadictionaryDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseDatadictionary> list(BaseDatadictionary baseDatadictionary) {
		return null;
	}

	@Override
	public List<BaseDatadictionary> listAll() {
		BaseDatadictionaryExample example = new BaseDatadictionaryExample();
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseDatadictionaryDao.selectByExample(example);
	}

	@Override
	public BaseDatadictionary findOne(BaseDatadictionary baseDatadictionary) {
		return this.baseDatadictionaryDao.selectByPrimaryKey(baseDatadictionary.getId());
	}

	@Override
	public List<BaseDatadictionary> listByPage(BaseDatadictionary baseDatadictionary,
			Integer page, Integer rows) {
		BaseDatadictionaryExample example = new BaseDatadictionaryExample();
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		
		return this.baseDatadictionaryDao.selectByExample(example);
	}

	@Override
	public List<BaseDatadictionary> findByParentid(Long id) {
		BaseDatadictionaryExample example = new BaseDatadictionaryExample();
		
		Criteria c = example.createCriteria();
		if(id != null)
			c.andParentidEqualTo(id);
		
		// 设置排序方式
		example.setOrderByClause("id");
		
		return this.baseDatadictionaryDao.selectByExample(example);
	}
}
