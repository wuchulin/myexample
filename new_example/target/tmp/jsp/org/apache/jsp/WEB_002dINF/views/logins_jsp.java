package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logins_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>管理系统</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/theme/lib/login/css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/theme/lib/login/css/supersized.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/theme/lib/login/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body oncontextmenu=\"return false\">\r\n");
      out.write("\t<div class=\"page-container\">\r\n");
      out.write("         <h1>Login</h1>\r\n");
      out.write("         <form action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"username\" class=\"username\" placeholder=\"UserName\" autocomplete=\"off\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("            <div>\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"password\" class=\"password\" placeholder=\"Password\" oncontextmenu=\"return false\" onpaste=\"return false\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <button id=\"submit\" type=\"button\">Sign in</button>\r\n");
      out.write("         </form>\r\n");
      out.write("         <div class=\"connect\">\r\n");
      out.write("         \t<p>If we can only encounter each other rather than stay with each other,then I wish we had never encountered.</p>\r\n");
      out.write("\t\t\t<p style=\"margin-top:20px;\">如果只是遇见，不能停留，不如不遇见。</p>\r\n");
      out.write("         </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"alert\" style=\"display:none\">\r\n");
      out.write("\t\t<h2>消息</h2>\r\n");
      out.write("\t\t<div class=\"alert_con\">\r\n");
      out.write("\t\t\t<p id=\"ts\"></p>\r\n");
      out.write("\t\t\t<p style=\"line-height:70px\"><a class=\"btn\">确定</a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Javascript -->\r\n");
      out.write("\t<script src=\"http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"/theme/lib/login/js/supersized.3.2.7.min.js\"></script>\r\n");
      out.write("\t<script src=\"/theme/lib/login/js/supersized-init.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(\".btn\").click(function(){\r\n");
      out.write("\t\t\tis_hide();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\tvar u = $(\"input[name=username]\");\r\n");
      out.write("\t\tvar p = $(\"input[name=password]\");\r\n");
      out.write("\t\t$(\"#submit\").live('click',function(){\r\n");
      out.write("\t\t\tif(u.val() == '' || p.val() =='')\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t$(\"#ts\").html(\"用户名或密码不能为空~\");\r\n");
      out.write("\t\t\t\tis_show();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\tvar reg = /^[0-9A-Za-z]+$/;\r\n");
      out.write("\t\t\t\tif(!reg.exec(u.val()))\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(\"#ts\").html(\"用户名错误\");\r\n");
      out.write("\t\t\t\t\tis_show();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\twindow.onload = function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(\".connect p\").eq(0).animate({\"left\":\"0%\"}, 600);\r\n");
      out.write("\t\t\t$(\".connect p\").eq(1).animate({\"left\":\"0%\"}, 400);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction is_hide(){ $(\".alert\").animate({\"top\":\"-40%\"}, 300) }\r\n");
      out.write("\t\tfunction is_show(){ $(\".alert\").show().animate({\"top\":\"45%\"}, 300) }\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
