package com.myexample.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.myexample.system.model.BaseModule;
import com.myexample.system.service.BaseModuleService;

@Controller
@RequestMapping("/module")
public class BaseModuleController {
	
	@Autowired
	private BaseModuleService baseModuleService;
	
	@RequestMapping("/index")
	public String index(BaseModule baseModule,
			@RequestParam(required = false, defaultValue = "1") int pageNum,
			@RequestParam(required = false, defaultValue = "15") int numPerPage,
			ModelMap modelMap) {
		
		List<BaseModule> dataList = baseModuleService.listByPage(baseModule, pageNum, numPerPage);
		modelMap.addAttribute("pageInfo", new PageInfo<BaseModule>(dataList));
		modelMap.addAttribute("queryParam", baseModule);
		
		return "/module/index";
	}
	
	@RequestMapping("/add")
	public String add(ModelMap modelMap, BaseModule entity) {
		if(entity != null && entity.getId() != null) {
			entity = baseModuleService.findOne(entity);
		}else{
			entity = new BaseModule();
		}
		modelMap.addAttribute("entity", entity);
		return "/module/add";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(BaseModule entity) throws Exception {
		if(entity != null && entity.getId() != null) {
			baseModuleService.update(entity);
		}else{
			baseModuleService.insert(entity);
		}
		return "redirect:/module/index";
	}
	
	@RequestMapping(value="/delete")
	public String delete(BaseModule entity) throws Exception {
		if(entity != null && entity.getId() != null) {
			baseModuleService.delete(entity.getId());
		}
		return "redirect:/module/index";
	}
	
}
