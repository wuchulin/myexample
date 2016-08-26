package com.myexample.system.controller;


import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.github.pagehelper.PageInfo;
import com.myexample.system.model.BaseAnnex;
import com.myexample.system.service.BaseAnnexService;

@Controller
@RequestMapping("/annex")
public class BaseAnnexController {
	
	@Autowired
	private BaseAnnexService baseAnnexService;
	
	@RequestMapping("/index")
	public String index(
			BaseAnnex baseAnnex,
			@RequestParam(required = false, defaultValue = "1") int pageNum,
			@RequestParam(required = false, defaultValue = "15") int numPerPage,
			ModelMap modelMap) {
		
		List<BaseAnnex> dataList = baseAnnexService.listByPage(baseAnnex, pageNum, numPerPage);
		modelMap.addAttribute("pageInfo", new PageInfo<BaseAnnex>(dataList));
		modelMap.addAttribute("queryParam", baseAnnex);
		
		return "/annex/index";
	}
	
	@RequestMapping("/upload")
	public void upload(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;  
			Map<String,MultipartFile> fileMap = multipartRequest.getFileMap();
			
			for(String key : fileMap.keySet()) {
				MultipartFile mFile = fileMap.get(key);
				String filename = mFile.getOriginalFilename();
		      
				BaseAnnex annex = new BaseAnnex();
				annex.setCreatetime(new Date());
				annex.setDisplayname(filename);
				annex.setFilename(filename.substring(0, filename.lastIndexOf(".")));
				Calendar CD = Calendar.getInstance();
				// 采用年月日毫秒组成字符串防止重复
				String filePathString = String.valueOf(CD.get(Calendar.YEAR))
						+ String.valueOf(CD.get(Calendar.MONTH) + 1)
						+ String.valueOf(CD.get(Calendar.DATE))
						+ String.valueOf(CD.get(Calendar.HOUR))
						+ String.valueOf(CD.get(Calendar.MINUTE))
						+ String.valueOf(CD.get(Calendar.SECOND))
						+ String.valueOf(CD.get(Calendar.MILLISECOND));
				
				filename = filePathString + (filename.substring(filename.lastIndexOf(".")));
				annex.setFilepath("/" + filename);
				baseAnnexService.insert(annex);
				
				//获取服务器地址
				ServletContext sc = request.getSession().getServletContext();
				
				//附件存放服务器路径
			    String uploadDir = sc.getRealPath("/upload/");
			    
			    //如果文件夹不存在，则创建文件夹
			    if (!new File(uploadDir).exists()){
			    	new File(uploadDir).mkdirs();
			    }
				
				File dirPath = new File(uploadDir);  
				if (!dirPath.exists()) {  
					dirPath.mkdirs();  
				}  
				
				FileUtils.writeByteArrayToFile(new File(uploadDir, filename), mFile.getBytes());//服务器中生成文件
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	@RequestMapping(value="/delete")
	public String delete(HttpServletRequest request, HttpServletResponse response) {
		try {
			String annexId = request.getParameter("id");
			if(StringUtils.isNotEmpty(annexId)) {
				BaseAnnex annex = new BaseAnnex();
				annex.setId(Long.parseLong(annexId));
				
				annex = baseAnnexService.findOne(annex);
				if(annex != null) {
					ServletContext sc = request.getSession().getServletContext();
					String filePath = sc.getRealPath("/upload" + annex.getFilepath());
					
					File file = new File(filePath);
					// 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
					if (file.exists() && file.isFile()) {
						if (file.delete()) {
							baseAnnexService.delete(annex.getId());
						} 
					} else {
						file.delete();
						baseAnnexService.delete(annex.getId());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/annex/index";
	} 
}
