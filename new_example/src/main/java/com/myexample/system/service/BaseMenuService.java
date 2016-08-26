package com.myexample.system.service;

import java.util.List;

import com.myexample.base.service.IBaseService;
import com.myexample.system.model.BaseMenu;

public interface BaseMenuService extends IBaseService<BaseMenu>{
	
	public List<BaseMenu> findByParentid(Long id);
}
