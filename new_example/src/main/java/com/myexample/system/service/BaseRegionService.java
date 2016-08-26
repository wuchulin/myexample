package com.myexample.system.service;

import java.util.List;

import com.myexample.base.service.IBaseService;
import com.myexample.system.model.BaseRegion;

public interface BaseRegionService extends IBaseService<BaseRegion>{
	public List<BaseRegion> findByparentid(Long id);
}
