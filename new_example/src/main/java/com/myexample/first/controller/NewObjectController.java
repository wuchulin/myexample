package com.myexample.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.myexample.first.model.NewObject;
import com.myexample.first.service.NewObjectService;

@Controller
@RequestMapping("/object")
public class NewObjectController {
	
	@Autowired
	private NewObjectService newObjectService;
	
	@RequestMapping("/index")
	public String index(
			NewObject newObject,
			@RequestParam(required = false, defaultValue = "1") int pageNum,
			@RequestParam(required = false, defaultValue = "15") int numPerPage,
			ModelMap modelMap) {
		
		List<NewObject> dataList = newObjectService.listByPage(newObject, pageNum, numPerPage);
		modelMap.addAttribute("pageInfo", new PageInfo<NewObject>(dataList));
		modelMap.addAttribute("queryParam", newObject);
		
		return "/object/index";
	}
}
