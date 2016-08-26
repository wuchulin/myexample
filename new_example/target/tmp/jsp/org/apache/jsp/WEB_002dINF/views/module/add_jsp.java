package org.apache.jsp.WEB_002dINF.views.module;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvar mos=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.icon }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\t$(\"input[type='radio']\").each(function(){\r\n");
      out.write("\t\t\tif($(this).val()==mos)\r\n");
      out.write("\t\t\t\t$(this).prop(\"checked\",\"checked\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"breadcrumbs\">\r\n");
      out.write("\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t<li><i class=\"icon-home\"></i> <a href=\"#\">系统管理</a><span class=\"divider\"><i class=\"icon-angle-right\"></i></span></li>\r\n");
      out.write("\t\t<li class=\"active\">系统编辑</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"page-content\" class=\"clearfix\">\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" method=\"post\" name=\"form1\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group offset1 span11\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"name\">系统名</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<input type=\"text\" name=\"name\" id=\"name\" class=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t  \t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group offset1 span11\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"sequence\">排序</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<input type=\"text\" name=\"sequence\" id=\"sequence\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.sequence }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group offset1 span11\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"jobName\">所属职位</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-text-width\"/><span class=\"lbl\"> <i class=\"icon-text-width\"></i></span>\r\n");
      out.write("\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-desktop\"/><span class=\"lbl\"> <i class=\"icon-desktop\"></i></span>\r\n");
      out.write("\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-list\"/><span class=\"lbl\"> <i class=\"icon-list\"></i></span>\r\n");
      out.write("\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-edit\"/><span class=\"lbl\"> <i class=\"icon-edit\"></i></span>\r\n");
      out.write("\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-list-alt\"/><span class=\"lbl\"> <i class=\"icon-list-alt\"></i></span>\r\n");
      out.write("\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-calendar\"/><span class=\"lbl\"> <i class=\"icon-calendar\"></i></span>\r\n");
      out.write("\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-picture\"/><span class=\"lbl\"> <i class=\"icon-picture\"></i></span>\r\n");
      out.write("\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-th\"/><span class=\"lbl\"> <i class=\"icon-th\"></i></span>\r\n");
      out.write("\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-file\"/><span class=\"lbl\"> <i class=\"icon-file\"></i></span>\r\n");
      out.write("\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group offset1 span11\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"description\">描述</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<input type=\"text\" name=\"description\" id=\"description\" style=\"height:60px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.description }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-info btn-save\" type=\"button\"><i class=\"icon-ok\"></i> 提交</button>&nbsp; &nbsp; &nbsp;\r\n");
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
