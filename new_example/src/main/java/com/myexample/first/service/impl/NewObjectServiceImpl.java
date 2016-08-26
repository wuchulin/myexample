package com.myexample.first.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.myexample.first.dao.NewObjectDao;
import com.myexample.first.model.NewObject;
import com.myexample.first.model.NewObjectExample;
import com.myexample.first.service.NewObjectService;

@Service("newObject")
public class NewObjectServiceImpl implements NewObjectService {
	
	@Autowired
	private NewObjectDao newObjectDao;

	@Override
	public int insert(NewObject object) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(NewObject object) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long param) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<NewObject> list(NewObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewObject> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewObject findOne(NewObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewObject> listByPage(NewObject object, Integer page,
			Integer rows) {
		
		NewObjectExample example = new NewObjectExample();
		
		example.setOrderByClause("id");
		
		// 分页查询
		PageHelper.startPage(page, rows);
		
		return this.newObjectDao.selectByExample(example);
	}
}
