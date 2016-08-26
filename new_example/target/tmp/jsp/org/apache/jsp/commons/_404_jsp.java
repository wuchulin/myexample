package org.apache.jsp.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");

	String pagepath = request.getContextPath();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>出错信息提示</title>\r\n");
      out.write("<!-- basic styles -->\r\n");
      out.write("<link href=\"/theme/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"/theme/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/font-awesome.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/bootstrap-datetimepicker.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace-responsive.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace-skins.min.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"breadcrumbs\">\r\n");
      out.write("\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t<i class=\"icon-home\"></i> \r\n");
      out.write("\t\t<a href=\"#\">系统管理</a>\r\n");
      out.write("\t\t<span class=\"divider\">\r\n");
      out.write("\t\t<i class=\"icon-angle-right\"></i></span>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"active\">404错误</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"page-content\" class=\"clearfix\">\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"error-container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"well\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"grey lighter smaller\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"blue bigger-125\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-sitemap\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t404\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t找不到访问页面！\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"lighter smaller\">请联系系统管理员！</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"space\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!-- PAGE CONTENT ENDS -->\r\n");
      out.write("\t\t\t\t</div><!-- /.col -->\r\n");
      out.write("\t\t\t</div><!-- /.row -->\r\n");
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
