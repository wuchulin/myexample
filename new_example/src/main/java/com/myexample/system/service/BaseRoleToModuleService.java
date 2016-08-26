package com.myexample.system.service;

import java.util.List;

import com.myexample.base.service.IBaseService;
import com.myexample.system.model.BaseRoletomodule;

public interface BaseRoleToModuleService extends IBaseService<BaseRoletomodule>{
	public List<BaseRoletomodule> findByRoleid(Long id);
}
