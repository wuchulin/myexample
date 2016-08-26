package com.myexample.system.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.myexample.base.util.Constant;
import com.myexample.system.model.BaseRole;
import com.myexample.system.model.BaseUser;
import com.myexample.system.model.BaseUsertorole;
import com.myexample.system.service.BaseRoleService;
import com.myexample.system.service.BaseUserService;
import com.myexample.system.service.BaseUserToRoleService;

@Controller
@RequestMapping("/user")
public class BaseUserController {
	
	@Autowired
	private BaseUserService baseUserService;
	
	@Autowired
	private BaseRoleService baseRoleService;
	
	@Autowired
	private BaseUserToRoleService baseUserToRoleService;
	
	@RequestMapping("/index")
	public String index(
			BaseUser baseUser,
			@RequestParam(required = false, defaultValue = "1") int pageNum,
			@RequestParam(required = false, defaultValue = "15") int numPerPage,
			ModelMap modelMap) {
		
		List<BaseUser> dataList = baseUserService.listByPage(baseUser, pageNum, numPerPage);
		modelMap.addAttribute("pageInfo", new PageInfo<BaseUser>(dataList));
		modelMap.addAttribute("queryParam", baseUser);
		
		return "/user/index";
	}
	
	@RequestMapping("/add")
	public String add(ModelMap modelMap, BaseUser entity){
		List<BaseRole> roleList = baseRoleService.listAll();
		String roles = "";
		
		if(entity != null && entity.getId() != null) {
			entity = baseUserService.findOne(entity);
			
			List<BaseUsertorole> utrList = baseUserToRoleService.findByUserid(entity.getId());
			if (utrList != null && utrList.size() > 0) {
				roles = "";
				for (int i = 0; i < utrList.size(); i++) {
					roles += utrList.get(i).getRoleid() + ",";
				}
			}
			
		}else{
			entity = new BaseUser();
		}
		
		modelMap.addAttribute("entity", entity);
		modelMap.addAttribute("roleList", roleList);
		modelMap.addAttribute("roles", roles);
		
		return "/user/add";
	}
	
	@RequestMapping("/view")
	public String view(ModelMap modelMap, BaseUser entity) {
		if(entity != null && entity.getId() != null) {
			entity = baseUserService.findOne(entity);
			List<BaseUsertorole> utrList = baseUserToRoleService.findByUserid(entity.getId());
			String roleNames = "";
			if(utrList != null && utrList.size() > 0) {
				for (BaseUsertorole baseUsertorole : utrList) {
					BaseRole role = new BaseRole();
					role.setId(baseUsertorole.getRoleid());
					roleNames += baseRoleService.findOne(role).getName();
				}
			}
			
			modelMap.addAttribute("entity", entity);
			modelMap.addAttribute("roleNames", roleNames);
		}
		return "/user/view";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(BaseUser entity, Long[] roleIds) {
		try {
			entity.setCreatetime(new Date());
			entity.setStatus("YES");
			
			if(entity != null && entity.getId() == null) {
				entity.setPassword(Constant.newcode(entity.getPassword()));// md5加密
				baseUserService.insert(entity);
			}else{
				BaseUser user = baseUserService.findOne(entity);
				if(user != null) {
					if(!user.getPassword().equals(entity.getPassword())) {
						entity.setPassword(Constant.newcode(entity.getPassword()));// md5加密
					}
				}
				
				baseUserService.update(entity);
			}
			
			List<BaseUsertorole> utrList = baseUserToRoleService.findByUserid(entity.getId());
			if (utrList != null && utrList.size() > 0) {
				for (BaseUsertorole utr : utrList)
					baseUserToRoleService.delete(utr.getId());
			}

			if (roleIds != null && roleIds.length > 0) {
				for (Long roleId : roleIds) {
					BaseUsertorole utr = new BaseUsertorole();
					utr.setUserid(entity.getId());
					utr.setRoleid(roleId);
					baseUserToRoleService.insert(utr);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/user/index";
	}
	
	@RequestMapping(value="/editSave", method = RequestMethod.POST)
	public void editSave(String ymm, String xmm, 
			HttpServletRequest request, HttpServletResponse response) {
		try {
			BaseUser entity = (BaseUser) request.getSession().getAttribute("user");
			ymm = Constant.newcode(ymm);
			xmm = Constant.newcode(xmm);
			if (entity.getPassword().equals(ymm)) {
				entity.setPassword(xmm);
				baseUserService.update(entity);
				response.getWriter().println("1");
			} else {
				response.getWriter().println("2");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/delete")
	public String delete(BaseUser entity) throws Exception {
		if(entity != null && entity.getId() != null) {
			baseUserService.delete(entity.getId());
		}
		return "redirect:/user/index";
	}
	
	@RequestMapping(value="/deleteAll")
	public String delete(String ids) throws NumberFormatException, Exception {
		if(StringUtils.isNotEmpty(ids)) {
			String[] id = ids.split(",");
			
			for (String i : id) {
				int num = baseUserService.delete(Long.parseLong(i));
				
				if(num <= 0) {
					break;
				}
			}
		}
		return "redirect:/user/index";
	}
}
