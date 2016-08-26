package com.myexample.system.service;


import java.util.List;

import com.myexample.base.service.IBaseService;
import com.myexample.system.model.BaseDatadictionary;

public interface BaseDataDictionaryService extends IBaseService<BaseDatadictionary>{
	
	public List<BaseDatadictionary> findByParentid(Long id);
}
