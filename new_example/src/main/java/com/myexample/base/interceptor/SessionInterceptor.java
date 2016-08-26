package com.myexample.base.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.myexample.base.util.AuthorizationException;
import com.myexample.system.model.BaseUser;

@Repository
public class SessionInterceptor extends HandlerInterceptorAdapter {
	
	private static final String[] IGNORE_URI = { "/login", "/signIn", "/logout", "/theme/" };

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		boolean flag = false;
		String url = request.getRequestURL().toString();
		for (String s : IGNORE_URI) {
			if (StringUtils.containsIgnoreCase(url, s)) {
				System.out.println(s+":包含在内跳过");
				flag = true;
				break;
			}
		}
		
		String domain_path = "http://" + request.getServerName() +(request.getServerPort()==80?"":":"+request.getServerPort())+"/";
		String main_path = "http://" + request.getServerName() +(request.getServerPort()==80?"":":"+request.getServerPort())+"/index";
		//判断是否访问了更目录，像这样http://localhost/，应该是跳转到登录界面
		if(StringUtils.equals(url, domain_path)){
			throw new AuthorizationException("访问根目录，系统直接跳转到登录页");
		}
		
		if (!flag) {
			BaseUser user = (BaseUser) request.getSession().getAttribute("user");
			
			if (user != null)
				flag = true;
			else {
				//session失效，这个时候如果刷新整个页面，不要返回json，需要下面的判断
				if(StringUtils.equals(url, main_path)){
					throw new AuthorizationException("访问根目录，系统直接跳转到登录页");
				}else{
					//response.getWriter().print("超时，请重新登录！");
					response.sendRedirect("error.jsp");
					response.sendRedirect("/login");
				}
			}
		}

		return flag;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}  
	
}