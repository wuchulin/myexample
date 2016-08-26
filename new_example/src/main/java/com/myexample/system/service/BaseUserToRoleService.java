package com.myexample.system.service;

import java.util.List;

import com.myexample.base.service.IBaseService;
import com.myexample.system.model.BaseUsertorole;

public interface BaseUserToRoleService extends IBaseService<BaseUsertorole>{
	
	public List<BaseUsertorole> findByUserid(Long id);
}
