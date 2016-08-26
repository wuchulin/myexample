package com.myexample.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.system.dao.BaseRoletomoduleDao;
import com.myexample.system.model.BaseRoletomodule;
import com.myexample.system.model.BaseRoletomoduleExample;
import com.myexample.system.model.BaseRoletomoduleExample.Criteria;
import com.myexample.system.service.BaseRoleToModuleService;

@Service("baseRoleToModuleService")
public class BaseRoleToModuleServiceImpl implements BaseRoleToModuleService {
	
	@Autowired
	private BaseRoletomoduleDao baseRoletomoduleDao;

	@Override
	public int insert(BaseRoletomodule baseRoletomodule) throws Exception {
		return this.baseRoletomoduleDao.insertSelective(baseRoletomodule);
	}

	@Override
	public int update(BaseRoletomodule baseRoletomodule) throws Exception {
		return this.baseRoletomoduleDao.updateByPrimaryKeySelective(baseRoletomodule);
	}

	@Override
	public int delete(Long param) throws Exception {
		return this.baseRoletomoduleDao.deleteByPrimaryKey(param);
	}

	@Override
	public List<BaseRoletomodule> list(BaseRoletomodule baseRoletomodule) {
		return null;
	}

	@Override
	public List<BaseRoletomodule> listAll() {
		BaseRoletomoduleExample example = new BaseRoletomoduleExample();
		
		example.setOrderByClause("id");
		
		return this.baseRoletomoduleDao.selectByExample(example);
	}

	@Override
	public BaseRoletomodule findOne(BaseRoletomodule baseRoletomodule) {
		return this.baseRoletomoduleDao.selectByPrimaryKey(baseRoletomodule.getId());
	}

	@Override
	public List<BaseRoletomodule> listByPage(BaseRoletomodule baseRoletomodule,
			Integer page, Integer rows) {
		BaseRoletomoduleExample example = new BaseRoletomoduleExample();
		
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		
		return this.baseRoletomoduleDao.selectByExample(example);
	}

	@Override
	public List<BaseRoletomodule> findByRoleid(Long id) {
		BaseRoletomoduleExample example = new BaseRoletomoduleExample();
		
		Criteria c = example.createCriteria();
		if(id != null)
			c.andRoleidEqualTo(id);
		
		example.setOrderByClause("id");
		
		return this.baseRoletomoduleDao.selectByExample(example);
	}
}
