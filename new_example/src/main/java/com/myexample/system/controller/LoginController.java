package com.myexample.system.controller;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myexample.base.util.Constant;
import com.myexample.base.util.MenuComparator;
import com.myexample.system.model.BaseMenu;
import com.myexample.system.model.BaseRoletomenu;
import com.myexample.system.model.BaseUser;
import com.myexample.system.model.BaseUsertorole;
import com.myexample.system.service.BaseMenuService;
import com.myexample.system.service.BaseRoleToMenuService;
import com.myexample.system.service.BaseUserService;
import com.myexample.system.service.BaseUserToRoleService;

@Controller
public class LoginController {
	
	@Autowired
	private BaseUserService baseUserService;
	
	@Autowired
	private BaseMenuService baseMenuService;
	
	@Autowired
	private BaseUserToRoleService baseUserToRoleService;
	
	@Autowired
	private BaseRoleToMenuService baseRoleToMenuService;
	
	/**
	 * 首页
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("index")
	public String index(ModelMap modelMap, 
				HttpServletRequest request, HttpServletResponse response) {
		BaseUser user = (BaseUser) request.getSession().getAttribute("user");
		
		if(user != null) {
			List<BaseMenu> menuList = new ArrayList<BaseMenu>();
			List<BaseUsertorole> userToRoles = baseUserToRoleService.findByUserid(user.getId());
			List<BaseRoletomenu> roleToMenus = new ArrayList<BaseRoletomenu>();
			
			if(userToRoles.isEmpty()) {
				modelMap.addAttribute("errorstr", "3");
				return "login";
			}else{
				
				for (BaseUsertorole ur : userToRoles) {
					roleToMenus = baseRoleToMenuService.findByRoleid(ur.getRoleid());
					for (BaseRoletomenu s : roleToMenus) {
						BaseMenu baseMenu = new BaseMenu();
						baseMenu.setId(s.getMenuid());
						BaseMenu menu = baseMenuService.findOne(baseMenu);
						if (menu.getParentid() != null && menu.getParentid() == 1l && menu.getModuleid() == 1l) {
							menuList.add(menu);
						}
					}
				}
				
				Collections.sort(menuList, new MenuComparator());
				
				HashMap<Long, List<BaseMenu>> menuMap = new HashMap<Long, List<BaseMenu>>();
				for (BaseMenu menu : menuList) { // 根据一级菜单找所属二级菜单
					List<BaseMenu> meList = baseMenuService.findByParentid(menu.getId());// 根据父id找到该父id的所有二级菜单
					List<BaseMenu> mList = new ArrayList<BaseMenu>();
					for (BaseMenu m : meList) {// 遍历该父id的所有二级菜单
						for (BaseRoletomenu s : roleToMenus) {// 遍历该角色的所有RoleToMenu对象
							BaseMenu baseMenu = new BaseMenu();
							baseMenu.setId(s.getMenuid());
							BaseMenu menus = baseMenuService.findOne(baseMenu);
							if (m.getId() == menus.getId()) {// 如果二级菜单的记录在RoleToMenu对象里也有，就添加到mList集合
								mList.add(m);
							}
						}
					}
					
					Collections.sort(mList, new MenuComparator());
					menuMap.put(menu.getId(), mList);
				}
				
				modelMap.addAttribute("menuList", menuList);
				modelMap.addAttribute("menuMap", menuMap);
			}
		}
		
		return "index";
	}
	
	@RequestMapping("login")
	public String login(HttpServletRequest request) {
		return "login";
	}
	
	@RequestMapping("signIn")
	public String signIn(ModelMap modelMap, 
				String loginId, 
				String password,
				HttpServletRequest request, HttpServletResponse response) throws NoSuchAlgorithmException
    {
		HttpSession httpSession = request.getSession();
		
		if(StringUtils.isNotEmpty(loginId) && StringUtils.isNotEmpty(password)) {
			
			BaseUser u = new BaseUser();
			u.setLoginid(loginId);
			u.setPassword(Constant.newcode(password));
			List<BaseUser> userList = baseUserService.list(u);
			
			if(userList.size() == 0 || userList.size() > 1) {
				modelMap.addAttribute("errorstr", "2");
				return "login";
				
			} else {
				BaseUser user = userList.get(0);
				httpSession.setAttribute("user", user);
				
				List<BaseUsertorole> userToRoles = baseUserToRoleService.findByUserid(user.getId());
				
				if(userToRoles.isEmpty()) {
					modelMap.addAttribute("errorstr", "3");
					return "login";
				}else{
					return "redirect:/index";
				}
			}
		}else{
			return "login";
		}
    }
	
	@RequestMapping("loginCenter")
	public String loginCenter() {
        return "center";
	}
	
	@RequestMapping("loginOut")
	public String loginOut() {
		return "redirect:/login";
	}
}
