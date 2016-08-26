package com.myexample.system.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myexample.system.model.BaseRegion;
import com.myexample.system.service.BaseRegionService;

@Controller
@RequestMapping("/region")
public class BaseRegionController {

	@Autowired
	private BaseRegionService baseRegionService;
	
	@RequestMapping("/index")
	public String index() {
		return "/region/index";
	}

	@RequestMapping("/add")
	public String add(BaseRegion entity) {
		try {
			BaseRegion dd = new BaseRegion();
			dd.setName(entity.getName());
			dd.setLower(0);
			dd.setParentid(entity.getId());
			dd.setSequence(entity.getSequence());
			dd.setDescription(entity.getDescription());
			dd.setCode(entity.getCode());
			baseRegionService.insert(dd);
			
			entity = baseRegionService.findOne(entity);
			entity.setLower(1);
			baseRegionService.update(entity);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/region/index";
	}

	@RequestMapping("/edit")
	public String edit(BaseRegion entity) {
		try {
			BaseRegion dd = baseRegionService.findOne(entity);
			
			dd.setName(entity.getName());
			dd.setSequence(entity.getSequence());
			dd.setDescription(entity.getDescription());
			dd.setCode(entity.getCode());
			baseRegionService.update(dd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/region/index";
	}

	@RequestMapping("/delete")
	public String delete(BaseRegion entity) throws Exception {
		baseRegionService.delete(entity.getId());
		return "/region/index";
	}

	@RequestMapping("/doGetTreeRegion")
	public void doGetTree(BaseRegion entity, 
			HttpServletRequest request, HttpServletResponse response) {
		try {
			List<BaseRegion> list = baseRegionService.findByparentid(entity.getId());
			JSONArray ja = new JSONArray();
			for (BaseRegion dd : list) {
				JSONObject jo = new JSONObject();
				jo.put("id", dd.getId());
				jo.put("name", dd.getName());
				jo.put("parent_id", dd.getParentid());
				jo.put("code", dd.getCode());
				if (dd.getLower() == 1) {
					jo.put("open", false);
					jo.put("isParent", true);
				}
				ja.put(jo);
			}
			
			// 利用Json插件将Array转换成Json格式
			response.getWriter().print(ja.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// json 格式组装
	public JSONArray jsonAssemble(Long id) {
		JSONArray ja = new JSONArray();
		try {
			List<BaseRegion> list = baseRegionService.findByparentid(id);
			for (BaseRegion dd : list) {
				JSONObject jo = new JSONObject();
				jo.put("id", dd.getId());
				jo.put("name", dd.getName());
				jo.put("parent_id", dd.getParentid());
				jo.put("code", dd.getCode());
				if (dd.getLower() == 1) {
					jo.put("open", false);
				}
				ja.put(jo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ja;
	}

	@RequestMapping("/doGetOneRegion")
	public void doGetOneAction(BaseRegion entity, 
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			entity = baseRegionService.findOne(entity);
			JSONObject jo = new JSONObject();
			jo.put("id", entity.getId());
			jo.put("name", entity.getName());
			jo.put("sequence", entity.getSequence());
			jo.put("parent_id", entity.getParentid());
			jo.put("description", entity.getDescription());
			jo.put("code", entity.getCode());
			
			// 利用Json插件将Array转换成Json格式
			response.getWriter().print(jo.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("getRegion")
	public void getRegion(Long pid, 
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONArray json = new JSONArray();
		try {
			if (pid != null) {
				List<BaseRegion> rows = baseRegionService.findByparentid(pid);
				if (rows != null && rows.size() > 0) {
					for (BaseRegion re : rows) {
						JSONObject o = new JSONObject();
						o.put("id", re.getId());
						o.put("code", re.getCode());
						o.put("name", re.getName());
						json.put(o);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().print(json.toString());
	}
}
