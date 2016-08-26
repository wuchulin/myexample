package org.apache.jsp.WEB_002dINF.views.annex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("#idFileList .uploadTR{\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#idFileList .uploadTD{\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form id=\"frm_doc\" enctype=\"multipart/form-data\">\r\n");
      out.write("<table id=\"btns\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<span id=\"spanButtonPlaceholder\"></span>\r\n");
      out.write("\t\t\t<input id=\"btnUpload\" type=\"button\" value=\"上传\" style=\"vertical-align: top;margin-left: 140px;\"/>\r\n");
      out.write("\t\t\t<input id=\"btnCancel\" type=\"button\" value=\"取消\" disabled=\"disabled\" style=\"vertical-align: top;\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"关闭\" onclick=\"willReturnValue()\" style=\"vertical-align: top;\"/>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table id=\"idFileList\" style=\"margin-top: 10px;margin-bottom: 10px;\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"240px\">文件名</th>\r\n");
      out.write("\t\t<th width=\"100px\" style=\"text-align: left;\">状态</th>\r\n");
      out.write("\t\t<th width=\"35px\" style=\"text-align: left;\">操作</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<font style=\"font-size: 12px;\">等待上传 <span id=\"idFileListCount\">0</span> 个</font>\r\n");
      out.write("<input type=\"hidden\" id=\"fjIds\"/>\r\n");
      out.write("<div id=\"divSWFUploadUI\" style=\"visibility: hidden;\"></div>\r\n");
      out.write("<noscript style=\"display: block; margin: 10px 25px; padding: 10px 15px;\">\r\n");
      out.write("\t很抱歉，相片上传界面无法载入，请将浏览器设置成支持JavaScript。\r\n");
      out.write("</noscript>\r\n");
      out.write("<div id=\"divLoadingContent\" class=\"content\" style=\"background-color: #FFFF66; border-top: solid 4px #FF9966; border-bottom: solid 4px #FF9966; margin: 10px 25px; padding: 10px 15px; display: none;\">\r\n");
      out.write("\t相片上传界面正在载入，请稍后...\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"divLongLoading\" class=\"content\" style=\"background-color: #FFFF66; border-top: solid 4px #FF9966; border-bottom: solid 4px #FF9966; margin: 10px 25px; padding: 10px 15px; display: none;\">\r\n");
      out.write("\t相片上传界面载入失败，请确保浏览器已经开启对JavaScript的支持，并且已经安装可以工作的Flash插件版本。\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"divAlternateContent\" class=\"content\" style=\"background-color: #FFFF66; border-top: solid 4px #FF9966; border-bottom: solid 4px #FF9966; margin: 10px 25px; padding: 10px 15px; display: none;\">\r\n");
      out.write("\t很抱歉，相片上传界面无法载入，请安装或者升级您的Flash插件。\r\n");
      out.write("\t请访问： <a href=\"http://www.adobe.com/shockwave/download/download.cgi?P1_Prod_Version=ShockwaveFlash\" target=\"_blank\">Adobe网站</a> 获取最新的Flash插件。\r\n");
      out.write("</div>\r\n");
      out.write("</form>");
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
