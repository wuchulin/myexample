package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"description\" content=\"Static & Dynamic Tables\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"breadcrumbs\">\r\n");
      out.write("\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t<li><i class=\"icon-home\"></i> <a href=\"#\">系统管理</a><span class=\"divider\"><i class=\"icon-angle-right\"></i></span></li>\r\n");
      out.write("\t\t<li class=\"active\">用户详情</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"page-content\" class=\"clearfix\">\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" method=\"post\" name=\"form1\">\r\n");
      out.write("\t\t\t\t\t<input name=\"id\" id=\"id\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"name\">姓名：</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t    \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"identityCard\">身份证：</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t\t    \t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.identitycard}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t  \t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"gender\">性别：</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t    \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"phone\">电话：</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t\t    \t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"jobName\">所属职位：</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t    \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.jobname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"email\">邮箱：</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t\t    \t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"qq\">QQ：</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t    \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.qq}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"sequence\">排序：</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t\t    \t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.sequence}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"loginId\">登录名：</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t\t    \t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.loginid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"password\">密码：</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t    \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\">所属角色：</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls conts\">\r\n");
      out.write("\t\t\t\t    \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roleNames}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn\" type=\"reset\" onclick=\"history.go(-1)\"><i class=\"icon-undo\"></i> 返回</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
