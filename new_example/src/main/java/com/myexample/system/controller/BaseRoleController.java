package com.myexample.system.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.myexample.system.model.BaseModule;
import com.myexample.system.model.BaseRole;
import com.myexample.system.model.BaseRoletomenu;
import com.myexample.system.model.BaseRoletomodule;
import com.myexample.system.service.BaseModuleService;
import com.myexample.system.service.BaseRoleService;
import com.myexample.system.service.BaseRoleToMenuService;
import com.myexample.system.service.BaseRoleToModuleService;

@Controller
@RequestMapping("/role")
public class BaseRoleController {
	
	@Autowired
	private BaseRoleService baseRoleService;
	
	@Autowired
	private BaseModuleService baseModuleService;
	
	@Autowired
	private BaseRoleToModuleService baseRoleToModuleService;
	
	@Autowired
	private BaseRoleToMenuService baseRoleToMenuService;
	
	@RequestMapping("/index")
	public String index(BaseRole baseRole,
			@RequestParam(required = false, defaultValue = "1") int pageNum,
			@RequestParam(required = false, defaultValue = "15") int numPerPage,
			ModelMap modelMap) {
		
		List<BaseRole> dataList = baseRoleService.listByPage(baseRole, pageNum, numPerPage);
		modelMap.addAttribute("pageInfo", new PageInfo<BaseRole>(dataList));
		modelMap.addAttribute("queryParam", baseRole);
		
		return "/role/index";
	}
	
	@RequestMapping("/add")
	public String add(ModelMap modelMap, BaseRole entity) {
		List<BaseModule> moduleList = baseModuleService.listAll();
		Long[] moduleIds = null;
		String modules = " ";
		String menuIds = " ";
		
		if (entity != null && entity.getId() != null) {
			entity = baseRoleService.findOne(entity);
			List<BaseRoletomodule> modList = baseRoleToModuleService.findByRoleid(entity.getId());
			if (modList != null && modList.size() > 0) {
				moduleIds = new Long[modList.size()];
				modules = "";
				for (int i = 0; i < modList.size(); i++) {
					moduleIds[i] = modList.get(i).getModuleid();
					modules += modList.get(i).getModuleid() + ",";
				}
				modules = modules.substring(0, modules.length() - 1);
			}
			List<BaseRoletomenu> rtmList = baseRoleToMenuService.findByRoleid(entity.getId());
			if (rtmList != null && rtmList.size() > 0) {
				menuIds = "";
				for (BaseRoletomenu rtm : rtmList)
					menuIds += rtm.getMenuid()+ ",";
				menuIds = menuIds.substring(0, menuIds.length() - 1);
			}
		}
		
		modelMap.addAttribute("moduleList", moduleList);
		modelMap.addAttribute("modules", modules);
		modelMap.addAttribute("menuIds", menuIds);
		modelMap.addAttribute("entity", entity);
		
		return "/role/add";
	}
	
	@RequestMapping("/save")
	public String save(ModelMap modelMap, BaseRole entity, Long[] moduleIds, String menuIds) {
		try {
			entity.setStatus("YES");
			if(entity != null && entity.getId() != null) 
				baseRoleService.update(entity);
			else
				baseRoleService.insert(entity);

			List<BaseRoletomodule> modList = baseRoleToModuleService.findByRoleid(entity.getId());
			if (modList != null && modList.size() > 0) {
				for (BaseRoletomodule rtm : modList)
					baseRoleToModuleService.delete(rtm.getId());
			}
			if (moduleIds != null && moduleIds.length > 0) {
				for (int i = 0; i < moduleIds.length; i++) {
					BaseRoletomodule rtm = new BaseRoletomodule();
					rtm.setModuleid(moduleIds[i]);
					rtm.setRoleid(entity.getId());
					baseRoleToModuleService.insert(rtm);
				}
			}
			List<BaseRoletomenu> rtmList = baseRoleToMenuService.findByRoleid(entity.getId());
			if (rtmList != null && rtmList.size() > 0) {
				for (BaseRoletomenu rtm : rtmList)
					baseRoleToMenuService.delete(rtm.getId());
			}

			if (StringUtils.isNotEmpty(menuIds)) {
				String[] mIds = menuIds.split(",");
				for (int i = 0; i < mIds.length; i++) {
					BaseRoletomenu rtm = new BaseRoletomenu();
					rtm.setMenuid(Long.valueOf(mIds[i]));
					rtm.setRoleid(entity.getId());
					baseRoleToMenuService.insert(rtm);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/role/index";
	}
	
	@RequestMapping(value="/delete")
	public String delete(BaseRole entity) throws Exception {
		if(entity != null && entity.getId() != null) {
			baseRoleService.delete(entity.getId());
		}
		return "redirect:/role/index";
	}
}
