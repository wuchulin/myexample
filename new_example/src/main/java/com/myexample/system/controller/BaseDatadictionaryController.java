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

import com.myexample.system.model.BaseDatadictionary;
import com.myexample.system.service.BaseDataDictionaryService;

@Controller
@RequestMapping("/dataDictionary")
public class BaseDatadictionaryController {
	
	@Autowired
	private BaseDataDictionaryService baseDataDictionaryService;
	
	@RequestMapping("/index")
	public String index() {
		return "/dataDictionary/index";
	}

	@RequestMapping("/add")
	public String add(BaseDatadictionary entity) throws Exception {
		BaseDatadictionary dd = new BaseDatadictionary();
		dd.setName(entity.getName());
		dd.setLower(0);
		dd.setStatus("YES");
		dd.setParentid(entity.getId());
		dd.setSequence(entity.getSequence());
		dd.setDescription(entity.getDescription());
		dd.setCode(entity.getCode());
		baseDataDictionaryService.insert(dd);

		entity = baseDataDictionaryService.findOne(entity);
		entity.setLower(1);
		baseDataDictionaryService.update(entity);
		return "redirect:/dataDictionary/index";
	}

	@RequestMapping("/edit")
	public String edit(BaseDatadictionary entity) throws Exception {
		BaseDatadictionary dd = baseDataDictionaryService.findOne(entity);
		dd.setName(entity.getName());
		dd.setSequence(entity.getSequence());
		dd.setDescription(entity.getDescription());
		dd.setCode(entity.getCode());
		baseDataDictionaryService.update(dd);
		return "redirect:/dataDictionary/index";
	}

	@RequestMapping("/delete")
	public String delete(BaseDatadictionary entity) throws Exception {
		BaseDatadictionary dd = baseDataDictionaryService.findOne(entity);
		if(dd.getLower() == 1) {
			List<BaseDatadictionary> list = baseDataDictionaryService.findByParentid(entity.getId());
			for (BaseDatadictionary dataDictionary : list) {
				baseDataDictionaryService.delete(dataDictionary.getId());
			}
			
			baseDataDictionaryService.delete(entity.getId());
		} else {
			baseDataDictionaryService.delete(entity.getId());
		}
		return "redirect:/dataDictionary/index";
	}

	@RequestMapping("/doGetTree")
	public void doGetTree(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			JSONArray ja = new JSONArray();
			BaseDatadictionary d = new BaseDatadictionary();
			d.setId(1l);
			BaseDatadictionary dd = baseDataDictionaryService.findOne(d);
			JSONObject jo = new JSONObject();
			jo.put("id", dd.getId());
			jo.put("name", dd.getName());
			jo.put("parent_id", dd.getParentid());
			jo.put("code", dd.getCode());
			if (dd.getLower() == 1) {
				jo.put("open", true);
				jo.put("children", jsonAssemble(dd.getId()));
			}
			ja.put(jo);
			
			// 利用Json插件将Array转换成Json格式
			response.getWriter().print(ja.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	// json 格式组装
	public JSONArray jsonAssemble(Long id) {
		List<BaseDatadictionary> list = baseDataDictionaryService.findByParentid(id);
		JSONArray ja = new JSONArray();
		try {
			for (BaseDatadictionary dd : list) {
				JSONObject jo = new JSONObject();
				jo.put("id", dd.getId());
				jo.put("name", dd.getName());
				jo.put("parent_id", dd.getParentid());
				jo.put("code", dd.getCode());
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

	@RequestMapping("/doGetOne")
	public void doGetOne(BaseDatadictionary entity, HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			entity = baseDataDictionaryService.findOne(entity);
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
}
