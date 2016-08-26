package com.myexample.system.service;


import java.util.List;

import com.myexample.base.service.IBaseService;
import com.myexample.system.model.BaseRoletomenu;

public interface BaseRoleToMenuService extends IBaseService<BaseRoletomenu>{
	
	public List<BaseRoletomenu> findByRoleid(Long id);
	
	public List<BaseRoletomenu> findByMenuid(Long id);
}
