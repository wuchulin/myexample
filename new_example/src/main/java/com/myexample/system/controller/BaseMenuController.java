package com.myexample.system.controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myexample.base.util.JsonResult;
import com.myexample.system.model.BaseMenu;
import com.myexample.system.model.BaseModule;
import com.myexample.system.model.BaseRoletomenu;
import com.myexample.system.service.BaseMenuService;
import com.myexample.system.service.BaseModuleService;
import com.myexample.system.service.BaseRoleToMenuService;

@Controller
@RequestMapping("/menu")
public class BaseMenuController {
	
	@Autowired
	private BaseMenuService baseMenuService;
	
	@Autowired
	private BaseModuleService baseModuleService; 
	
	@Autowired
	private BaseRoleToMenuService baseRoleToMenuService;
	
	@RequestMapping("/index")
	public String index(ModelMap modelMap) {
		List<BaseModule> moduleList = baseModuleService.listAll();
		modelMap.addAttribute("moduleList", moduleList);
		return "/menu/index";
	}
	
	@RequestMapping(value = "/add")
	public String add(BaseMenu entity) throws Exception {
		BaseMenu dd = new BaseMenu();
		dd.setName(entity.getName());
		dd.setLower(0);
		dd.setStatus("YES");
		dd.setParentid(entity.getId());
		dd.setSequence(entity.getSequence());
		dd.setDescription(entity.getDescription());
		dd.setValue(entity.getValue());
		dd.setIcon(entity.getIcon());
		dd.setModuleid(entity.getModuleid());
		baseMenuService.insert(dd);

		entity = baseMenuService.findOne(entity);
		entity.setLower(1);
		baseMenuService.update(entity);
		return "redirect:/menu/index";
	}
	
	@RequestMapping(value = "/edit")
	public String edit(BaseMenu entity) throws Exception {
		BaseMenu dd = baseMenuService.findOne(entity);
		dd.setName(entity.getName());
		dd.setSequence(entity.getSequence());
		dd.setDescription(entity.getDescription());
		dd.setValue(entity.getValue());
		dd.setIcon(entity.getIcon());
		dd.setModuleid(entity.getModuleid());
		baseMenuService.update(entity);
		return "redirect:/menu/index";
	}

	@RequestMapping(value = "/delete")
	public String delete(BaseMenu entity) throws Exception {
		List<BaseRoletomenu> list = baseRoleToMenuService.findByMenuid(entity.getId());
		if(list != null && list.size() > 0) {
			for (BaseRoletomenu roleToMenu : list) {
				baseRoleToMenuService.delete(roleToMenu.getId());
			}
		}
		baseMenuService.delete(entity.getId());
		return "redirect:/menu/index";
	}
	
	@RequestMapping(value="/doGetMenuTree", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult doGetTree() throws IOException {
		JsonResult json = null;
		JSONArray ja = new JSONArray();
		BaseMenu m = new BaseMenu();
		m.setId(1l);
		BaseMenu menu = baseMenuService.findOne(m);
		
		try {
			if(menu != null) {
				JSONObject jo = new JSONObject();
				jo.put("id", menu.getId());
				jo.put("name", menu.getName());
				jo.put("value", menu.getValue());
				jo.put("parent_id", menu.getParentid());
				if (menu.getLower() == 1) {
					jo.put("open", true);
					jo.put("children", jsonAssemble(menu.getId()));
				}
				ja.put(jo);
				
				json = new JsonResult(true, ja.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return json;
	}
	
	// json 格式组装
	public JSONArray jsonAssemble(Long id) {
		List<BaseMenu> list = baseMenuService.findByParentid(id);
		JSONArray ja = new JSONArray();
		
		try {
			for (BaseMenu dd : list) {
				JSONObject jo = new JSONObject();
				jo.put("id", dd.getId());
				if (dd.getModuleid() != null) {
					BaseModule m = new BaseModule();
					m.setId(dd.getModuleid());
					BaseModule baseModule = baseModuleService.findOne(m);
					jo.put("name", dd.getName() + "(" + baseModule.getName() + ")");
				}
				else
					jo.put("name", dd.getName());
				jo.put("value", dd.getValue());
				jo.put("parent_id", dd.getParentid());
				if (dd.getLower() == 1) {
					jo.put("open", false);
					jo.put("children", jsonAssemble(dd.getId()));
				}
				ja.put(jo);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ja;
	}
	
	@RequestMapping(value="/doGetMenuOne", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult doGetOneAction(BaseMenu entity) throws IOException {
		JsonResult json = null;
		
		try {
			if(entity != null) {
				BaseMenu menu = baseMenuService.findOne(entity);
				JSONObject jo = new JSONObject();
				jo.put("id", menu.getId());
				jo.put("name", menu.getName());
				jo.put("sequence", menu.getSequence());
				jo.put("parent_id", menu.getParentid());
				jo.put("icon", menu.getIcon());
				jo.put("description", menu.getDescription());
				jo.put("value", menu.getValue());
				jo.put("module", menu.getModuleid());
				
				json = new JsonResult(true, jo.toString());
			} else {
				json = new JsonResult(false, "查询错误！");
			}
		} catch (Exception e) {
			json = new JsonResult(false, "查询错误！");
			e.printStackTrace();
		}
		
		return json;
	}
}
