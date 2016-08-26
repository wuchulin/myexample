package com.myexample.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseAnnexDao;
import com.myexample.system.model.BaseAnnex;
import com.myexample.system.model.BaseAnnexExample;
import com.myexample.system.service.BaseAnnexService;

@Service("baseAnnexService")
public class BaseAnnexServiceImpl implements BaseAnnexService {
	
	@Autowired
	private BaseAnnexDao baseAnnexDao;

	@Override
	public int insert(BaseAnnex object) throws Exception {
		return this.baseAnnexDao.insertSelective(object);
	}

	@Override
	public int update(BaseAnnex object) throws Exception {
		return this.baseAnnexDao.updateByPrimaryKeySelective(object);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseAnnexDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseAnnex> list(BaseAnnex object) {
		return null;
	}

	@Override
	public List<BaseAnnex> listAll() {
		return null;
	}

	@Override
	public BaseAnnex findOne(BaseAnnex object) {
		return this.baseAnnexDao.selectByPrimaryKey(object.getId());
	}

	@Override
	public List<BaseAnnex> listByPage(BaseAnnex object, Integer page,
			Integer rows) {
		BaseAnnexExample example = new BaseAnnexExample();
		
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		
		return this.baseAnnexDao.selectByExample(example);
	}
}
