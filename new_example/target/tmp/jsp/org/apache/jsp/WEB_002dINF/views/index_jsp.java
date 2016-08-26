package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.myexample.system.model.BaseUser;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_otherwise.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
	BaseUser user = (BaseUser) session.getAttribute("user"); 

      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>管理系统</title>\n");
      out.write("<meta name=\"description\" content=\"overview & stats\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("<!-- basic styles -->\n");
      out.write("<link href=\"/theme/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"/theme/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("<!-- ace styles -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace-responsive.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace-skins.min.css\" />\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".footer {\n");
      out.write("    padding-top: 75px;\n");
      out.write("    height: 0;\n");
      out.write("    width: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer .footer-inner {\n");
      out.write("    text-align: center;\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: auto;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer .footer-inner .footer-content {\n");
      out.write("    position: absolute;\n");
      out.write("    left: 200px;\n");
      out.write("    right: 12px;\n");
      out.write("    bottom: 4px;\n");
      out.write("    padding: 8px;\n");
      out.write("    line-height: 36px;\n");
      out.write("    border-top: 3px double #E5E5E5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bigger-120 {\n");
      out.write("    font-size: 120% !important;\n");
      out.write("    font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".blue {\n");
      out.write("    color: #478fca !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bolder {\n");
      out.write("    font-weight: bolder;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"skin-3\">\n");
      out.write("<div class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"navbar-inner\">\n");
      out.write("   <div class=\"container-fluid\">\n");
      out.write("\t  <!-- <small><img src=\"\" style=\"height: 45px\"></small> -->\n");
      out.write("\t  <ul class=\"nav ace-nav pull-right\">\n");
      out.write("\t\t<li class=\"purple\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t<i class=\"icon-bell-alt icon-animated-bell icon-only\"></i>\n");
      out.write("\t\t\t\t<span class=\"badge badge-important\">4</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul class=\"pull-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-closer\">\n");
      out.write("\t\t\t\t<li class=\"nav-header\">\n");
      out.write("\t\t\t\t\t<i class=\"icon-warning-sign\"></i>6 件待办理\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\" onClick=\"center('/loginCenter')\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"pull-left\"><i class=\"icon-flag btn btn-mini btn-success\"></i> 待评定</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"pull-right badge badge-success\">10</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\" onClick=\"center('/loginCenter')\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"pull-left\"><i class=\"icon-key btn btn-mini btn-pink\"></i> 待审核</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"pull-right badge badge-pink\">5</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\" onClick=\"center('/loginCenter')\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"pull-left\"><i class=\"icon-credit-card btn btn-mini btn-waming\"></i> 待打印</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"pull-right badge badge-waming\">8</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"green\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t<i class=\"icon-envelope-alt icon-animated-vertical icon-only\"></i>\n");
      out.write("\t\t\t\t<span class=\"badge badge-success\">10</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul class=\"pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-closer\">\n");
      out.write("\t\t\t\t<li class=\"nav-header\">\n");
      out.write("\t\t\t\t\t<i class=\"icon-envelope\"></i> 10 条公告\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t更多\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-arrow-right\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"grey\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t<i class=\"icon-tasks\"></i>\n");
      out.write("\t\t\t\t<span class=\"badge\">4</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul class=\"pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-closer\">\n");
      out.write("\t\t\t\t<li class=\"nav-header\">\n");
      out.write("\t\t\t\t\t<i class=\"icon-ok\"></i> 4种主题\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"background-color: #438EB9;width: 220px;height: 20px;\" onclick=\"oj('default')\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"background-color: #222A2D;width: 220px;height: 20px;\" onclick=\"oj('skin-1')\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"background-color: #C6487E;width: 220px;height: 20px;\" onclick=\"oj('skin-2')\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t<div style=\"background-color: #D0D0D0;width: 220px;height: 20px;\" onclick=\"oj('skin-3')\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li class=\"light-blue user-profile\">\n");
      out.write("\t\t\t<a class=\"user-menu dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t<span id=\"user_info\">\n");
      out.write("\t\t\t\t\t<small>Welcome</small>\n");
      out.write("\t\t\t\t\t");
      out.print(user.getName() );
      out.write(" \n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t<i class=\"icon-caret-down\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul id=\"user_menu\" class=\"pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-closer\">\n");
      out.write("\t\t\t\t<li><a href=\"#myModals\" data-toggle=\"modal\"><i class=\"icon-cog\"></i> 个人信息</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#myModal\" data-toggle=\"modal\"><i class=\"icon-user\"></i> 修改密码</a></li>\n");
      out.write("\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t<li><a href=\"#myModalout\" data-toggle=\"modal\"><i class=\"icon-off\"></i> 退出</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t  </ul><!--/.ace-nav-->\n");
      out.write("   </div><!--/.container-fluid-->\n");
      out.write("  </div><!--/.navbar-inner-->\n");
      out.write("</div><!--/.navbar-->\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\" id=\"main-container\">\n");
      out.write("\t<!-- 菜单 -->\n");
      out.write("\t<div id=\"sidebar\">\n");
      out.write("\t\t<ul class=\"nav nav-list\">\n");
      out.write("\t\t\t<li class=\"active\">\n");
      out.write("\t\t\t  <a href=\"#\" class=\"one\" onClick=\"center('/loginCenter')\">\n");
      out.write("\t\t\t\t<i class=\"icon-dashboard\"></i>\n");
      out.write("\t\t\t\t<span>首页</span>\n");
      out.write("\t\t\t  </a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<div id=\"sidebar-collapse\"><i class=\"icon-double-angle-left\"></i></div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"main-content\" class=\"clearfix\">\n");
      out.write("\t\t<iframe id=\"centerFrame\" name=\"centerFrame\" src=\"loginCenter.action\" width=\"100%;\" height=\"700px\" frameborder=\"0\" ></iframe>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"footer-inner\">\n");
      out.write("\t\t\t<div class=\"footer-content\">\n");
      out.write("\t\t\t\t<span class=\"bigger-120\">\n");
      out.write("\t\t\t\t\t<span class=\"blue bolder\">Ace</span>\n");
      out.write("\t\t\t\t\tApplication &copy; 2013-2014\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t<span class=\"action-buttons\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"ace-icon fa fa-twitter-square light-blue bigger-150\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"ace-icon fa fa-facebook-square text-primary bigger-150\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"ace-icon fa fa-rss-square orange bigger-150\"></i>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<a href=\"#\" id=\"btn-scroll-up\" class=\"btn-scroll-up btn btn-sm btn-inverse\">\n");
      out.write("\t\t<i class=\"icon-double-angle-up icon-only bigger-110\"></i>\n");
      out.write("\t</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"myModal\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-header\">\n");
      out.write("    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("    <h3 id=\"myModalLabel\">修改密码</h3>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"modal-body\" style=\"text-align: center;\">\n");
      out.write("  \t<table style=\"width: 100%;\">\n");
      out.write("  \t\t<tr>\n");
      out.write("  \t\t\t<td style=\"text-align: right;width: 30%;\">原密码：</td>\n");
      out.write("  \t\t\t<td style=\"text-align: left;\"><input type=\"text\" name=\"ymm\" id=\"ymm\" class=\"input-larger\" /></td>\n");
      out.write("  \t\t</tr>\n");
      out.write("  \t\t<tr>\n");
      out.write("  \t\t\t<td style=\"text-align: right;width: 30%;\">新密码：</td>\n");
      out.write("  \t\t\t<td style=\"text-align: left;\"><input type=\"text\" name=\"xmm\" id=\"xmm\" class=\"input-larger\" /></td>\n");
      out.write("  \t\t</tr>\n");
      out.write("  \t\t<tr>\n");
      out.write("  \t\t\t<td style=\"text-align: right;width: 30%;\">确认密码：</td>\n");
      out.write("  \t\t\t<td style=\"text-align: left;\"><input type=\"text\" name=\"qrmm\" id=\"qrmm\" class=\"input-larger\" /></td>\n");
      out.write("  \t\t</tr>\n");
      out.write("  \t</table>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"modal-footer\">\n");
      out.write("    <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">关闭</button>\n");
      out.write("    <button class=\"btn btn-primary\" onclick=\"sub()\">保存</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"myModals\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-header\">\n");
      out.write("    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("    <h3 id=\"myModalLabel\">个人信息</h3>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"modal-body\" style=\"text-align: center;\">\n");
      out.write("  \t<table style=\"width: 100%;\">\n");
      out.write("  \t\t<tr height=\"30px;\">\n");
      out.write("  \t\t\t<td style=\"width: 15%;text-align: right;\">姓名：</td>\n");
      out.write("  \t\t\t<td style=\"width: 35%;border-bottom: 1px #c5d0dc solid;font-weight: bold;\">");
      out.print(user.getName() );
      out.write("</td>\n");
      out.write("  \t\t\t<td style=\"width: 15%;text-align: right;\">身份证：</td>\n");
      out.write("  \t\t\t<td style=\"width: 35%;border-bottom: 1px #c5d0dc solid;font-weight: bold;\">");
      out.print(user.getIdentitycard() );
      out.write("</td>\n");
      out.write("  \t\t</tr>\n");
      out.write("  \t\t<tr height=\"20px;\"></tr>\n");
      out.write("  \t\t<tr height=\"30px;\">\n");
      out.write("  \t\t\t<td style=\"text-align: right;\">性别：</td>\n");
      out.write("  \t\t\t<td style=\"border-bottom: 1px #c5d0dc solid;font-weight: bold;\">");
      out.print(user.getGender() );
      out.write("</td>\n");
      out.write("  \t\t\t<td style=\"text-align: right;\">电话：</td>\n");
      out.write("  \t\t\t<td style=\"border-bottom: 1px #c5d0dc solid;font-weight: bold;\">");
      out.print(user.getPhone() );
      out.write("</td>\n");
      out.write("  \t\t</tr>\n");
      out.write("  \t\t<tr height=\"20px;\"></tr>\n");
      out.write("  \t\t<tr height=\"30px;\">\n");
      out.write("  \t\t\t<td style=\"text-align: right;\">所属职位：</td>\n");
      out.write("  \t\t\t<td style=\"border-bottom: 1px #c5d0dc solid;font-weight: bold;\">");
      out.print(user.getJobname() );
      out.write("</td>\n");
      out.write("  \t\t\t<td style=\"text-align: right;\">邮箱：</td>\n");
      out.write("  \t\t\t<td style=\"border-bottom: 1px #c5d0dc solid;font-weight: bold;\">");
      out.print(user.getEmail() );
      out.write("</td>\n");
      out.write("  \t\t</tr>\n");
      out.write("  \t\t<tr height=\"20px;\"></tr>\n");
      out.write("  \t\t<tr height=\"30px;\">\n");
      out.write("  \t\t\t<td style=\"text-align: right;\">QQ：</td>\n");
      out.write("  \t\t\t<td style=\"border-bottom: 1px #c5d0dc solid;font-weight: bold;\">");
      out.print(user.getQq() );
      out.write("</td>\n");
      out.write("  \t\t\t<td style=\"text-align: right;\">排序：</td>\n");
      out.write("  \t\t\t<td style=\"border-bottom: 1px #c5d0dc solid;font-weight: bold;\">");
      out.print(user.getSequence() );
      out.write("</td>\n");
      out.write("  \t\t</tr>\n");
      out.write("  \t\t");
      out.write("\n");
      out.write("  \t</table>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"modal-footer\">\n");
      out.write("    <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">关闭</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"myModalout\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-footer\">\n");
      out.write("  \t<b style=\"float: left;font-size: 20px;margin-top: 10px;\">是否退出系统</b>\n");
      out.write("    <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">否</button>\n");
      out.write("    <button class=\"btn btn-primary\" onclick=\"tc()\">是</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- <script src=\"/theme/1.9.1/jquery.min.js\"></script> -->\n");
      out.write("<script src=\"/theme/js/jquery-1.9.1.min.js\"></script>\n");
      out.write("<script src=\"/theme/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/theme/js/ace.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function oj(b){\n");
      out.write("    var a = $(document.body);\n");
      out.write("    a.attr(\"class\", a.hasClass(\"navbar-fixed\") ? \"navbar-fixed\" : \"\");\n");
      out.write("    if (b != \"default\") {\n");
      out.write("        a.addClass(b);\n");
      out.write("    }\n");
      out.write("    if (b == \"skin-1\") {\n");
      out.write("        $(\".ace-nav > li.grey\").addClass(\"dark\");\n");
      out.write("    } else {\n");
      out.write("        $(\".ace-nav > li.grey\").removeClass(\"dark\");\n");
      out.write("    }\n");
      out.write("    if (b == \"skin-2\") {\n");
      out.write("        $(\".ace-nav > li\").addClass(\"no-border margin-1\");\n");
      out.write("        $(\".ace-nav > li:not(:last-child)\").addClass(\"white-pink\").find('> a > [class*=\"icon-\"]').addClass(\"pink\").end().eq(0).find(\".badge\").addClass(\"badge-warning\");\n");
      out.write("    } else {\n");
      out.write("        $(\".ace-nav > li\").removeClass(\"no-border\").removeClass(\"margin-1\");\n");
      out.write("        $(\".ace-nav > li:not(:last-child)\").removeClass(\"white-pink\").find('> a > [class*=\"icon-\"]').removeClass(\"pink\").end().eq(0).find(\".badge\").removeClass(\"badge-warning\");\n");
      out.write("    }\n");
      out.write("    if (b == \"skin-3\") {\n");
      out.write("        $(\".ace-nav > li.grey\").addClass(\"red\").find(\".badge\").addClass(\"badge-yellow\");\n");
      out.write("    } else {\n");
      out.write("        $(\".ace-nav > li.grey\").removeClass(\"red\").find(\".badge\").removeClass(\"badge-yellow\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function tc(){\n");
      out.write("\tlocation.href='/loginOut';\n");
      out.write("}\n");
      out.write("function sub(){\n");
      out.write("\tif($(\"#ymm\").val()==''){\n");
      out.write("\t\tvar str='<div class=\"alert alert-error\">请输入原密码！</div>';\n");
      out.write("\t\t$('#myModal').append(str);\n");
      out.write("\t\twindow.setTimeout(function(){ \n");
      out.write("\t\t\t$('.alert').slideUp();\n");
      out.write("\t\t},2000); \n");
      out.write("\t\treturn;\n");
      out.write("\t}\n");
      out.write("\tif($(\"#xmm\").val()==''){\n");
      out.write("\t\tvar str='<div class=\"alert alert-error\">请输入新密码！</div>';\n");
      out.write("\t\t$('#myModal').append(str);\n");
      out.write("\t\twindow.setTimeout(function(){ \n");
      out.write("\t\t\t$('.alert').slideUp();\n");
      out.write("\t\t},2000); \n");
      out.write("\t\treturn;\n");
      out.write("\t}\n");
      out.write("\tif($(\"#qrmm\").val()==''){\n");
      out.write("\t\tvar str='<div class=\"alert alert-error\">请输入确认密码！</div>';\n");
      out.write("\t\t$('#myModal').append(str);\n");
      out.write("\t\twindow.setTimeout(function(){ \n");
      out.write("\t\t\t$('.alert').slideUp();\n");
      out.write("\t\t},2000); \n");
      out.write("\t\treturn;\n");
      out.write("\t}\n");
      out.write("\tif($(\"#xmm\").val() !=$(\"#qrmm\").val()){\n");
      out.write("\t\tvar str='<div class=\"alert alert-error\">两次输入的密码不一致！</div>';\n");
      out.write("\t\t$('#myModal').append(str);\n");
      out.write("\t\twindow.setTimeout(function(){ \n");
      out.write("\t\t\t$('.alert').slideUp();\n");
      out.write("\t\t},2000); \n");
      out.write("\t\treturn;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t$.ajax({\n");
      out.write("\t\ttype: \"POST\",\n");
      out.write("\t\turl: \"/user/editSave\",\n");
      out.write("\t\tdata:{'ymm':$(\"#ymm\").val(),'xmm':$(\"#xmm\").val()},\n");
      out.write("\t\tasync: false,\n");
      out.write("\t\tsuccess: function(data){\n");
      out.write("\t\t\tif(data==1){\n");
      out.write("\t\t\t\tvar str='<div class=\"alert alert-success\">密码修改成功！</div>';\n");
      out.write("\t\t\t\t$('#myModal').append(str);\n");
      out.write("\t\t\t\twindow.setTimeout(function(){ \n");
      out.write("\t\t\t\t\t$('.alert').slideUp();\n");
      out.write("\t\t\t\t\t$('#myModal').modal('hide')\n");
      out.write("\t\t\t\t},2000); \n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tvar str='<div class=\"alert alert-error\">原密码输入错误！</div>';\n");
      out.write("\t\t\t\t$('#myModal').append(str);\n");
      out.write("\t\t\t\twindow.setTimeout(function(){ \n");
      out.write("\t\t\t\t\t$('.alert').slideUp();\n");
      out.write("\t\t\t\t},2000); \n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ menuList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("item");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<li>\n");
          out.write("\t\t\t\t  <a href=\"#\" class=\"dropdown-toggle\" >\n");
          out.write("\t\t\t\t  \t");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ item.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("\t\t\t\t\t<b class=\"arrow icon-angle-down\"></b>\n");
          out.write("\t\t\t\t  </a>\n");
          out.write("\t\t\t\t  <ul class=\"submenu\">\n");
          out.write("\t\t\t\t  \t");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t  </ul>\n");
          out.write("\t\t\t\t</li>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t  \t\t");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t  \t\t");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t  \t");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ item.icon == '' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t  \t\t\t<i class=\"icon-desktop\"></i>\n");
        out.write("\t\t\t\t  \t\t");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t  \t\t\t<i class=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ item.icon }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></i>\n");
        out.write("\t\t\t\t  \t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ menuMap.get(item.id) }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("items");
    _jspx_th_c_forEach_1.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<li><a href=\"#\" onClick=\"center('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ items.value }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\"><i class=\"icon-double-angle-right\"></i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ items.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("\t\t\t\t  \t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
