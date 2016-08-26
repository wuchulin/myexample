package org.apache.jsp.WEB_002dINF.views.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/lib/zTree3/css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/theme/lib/zTree3/js/jquery.ztree.core-3.5.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("\tvar setting = {\t\r\n");
      out.write("\t\tcallback: {\r\n");
      out.write("\t\t\tonClick: onClick\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t \r\n");
      out.write("\t var zNodes ;\r\n");
      out.write("\t $.ajax({  \r\n");
      out.write("\t        async : false,  \r\n");
      out.write("\t        cache:false,  \r\n");
      out.write("\t        type: 'POST',  \r\n");
      out.write("\t        dataType : \"json\",  \r\n");
      out.write("\t        url: \"/menu/doGetMenuTree\",//请求的action路径  \r\n");
      out.write("\t        error: function () {//请求失败处理函数  \r\n");
      out.write("\t            alert('请求失败');  \r\n");
      out.write("\t        },  \r\n");
      out.write("\t        success:function(data){ //请求成功后处理函数。    \r\n");
      out.write("\t        \tif(data.success) {\r\n");
      out.write("\t\t            zNodes = $.parseJSON(data.message);  //把后台封装好的简单Json格式赋给treeNodes  \r\n");
      out.write("\t        \t}\r\n");
      out.write("\t        }  \r\n");
      out.write("\t    });  \r\n");
      out.write("\t \r\n");
      out.write("\tfunction onClick(event, treeId, treeNode, clickFlag) {\r\n");
      out.write("\t\t $.ajax({  \r\n");
      out.write("\t\t        async : false,  \r\n");
      out.write("\t\t        cache:false,  \r\n");
      out.write("\t\t        type: 'POST', \r\n");
      out.write("\t\t        data:{'id':treeNode.id},\r\n");
      out.write("\t\t        dataType : \"json\",  \r\n");
      out.write("\t\t        url: \"/menu/doGetMenuOne\",//请求的action路径  \r\n");
      out.write("\t\t        error: function () {//请求失败处理函数  \r\n");
      out.write("\t\t            alert('请求失败');  \r\n");
      out.write("\t\t        },  \r\n");
      out.write("\t\t        success:function(data) { //请求成功后处理函数。   \r\n");
      out.write("\t\t        \tif(data.success) {\r\n");
      out.write("\t\t\t        \tdata = $.parseJSON(data.message);\r\n");
      out.write("\t\t\t\t        if(data.parentId==1 || data.id==1){\r\n");
      out.write("\t\t\t\t        \t$('#moduleDiv').show();\r\n");
      out.write("\t\t\t\t\t        $('#moduleId').val(data.module);\r\n");
      out.write("\t\t\t\t        }else{\r\n");
      out.write("\t\t\t\t        \t$(\"#moduleId\").val(\"\");\r\n");
      out.write("\t\t\t\t        \t$('#moduleDiv').hide();\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t\t\t        \t$('#id').val(data.id);\r\n");
      out.write("\t\t\t        \t$('#name').val(data.name);\r\n");
      out.write("\t\t\t        \t$('#value').val(data.value);\r\n");
      out.write("\t\t\t        \t$(\"input[name='icon']\").val([data.icon]);  \r\n");
      out.write("\t\t\t        \t$('#sequence').val(data.sequence);\r\n");
      out.write("\t\t\t        \t$('#description').val(data.description);\r\n");
      out.write("\t\t        \t}\r\n");
      out.write("\t\t        }  \r\n");
      out.write("\t\t    });  \r\n");
      out.write("\t}\r\n");
      out.write("\t \r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$.fn.zTree.init($(\"#treeDemo\"), setting, zNodes);\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction add(){\r\n");
      out.write("\t\tif($('#id').val()==''){\r\n");
      out.write("\t\t\talert('请先选择节点！');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar boo=true;\r\n");
      out.write("    \tvar forms = $('.form-horizontal');\r\n");
      out.write("    \tif($(forms).find('.required').length>0){\r\n");
      out.write("    \t\t$(forms).find('.required').each(function(){\r\n");
      out.write("    \t\t\t$(this).parent().parent().removeClass(\"error\");\r\n");
      out.write("    \t\t\tif($(this).val()==''){\r\n");
      out.write("    \t\t\t\t$(this).parent().parent().addClass(\"error\");\r\n");
      out.write("    \t\t\t\tboo=false;\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t}\r\n");
      out.write("    \tif(!boo)\r\n");
      out.write("    \t\treturn false;\r\n");
      out.write("\t\tform1.action=\"/menu/add\";\r\n");
      out.write("\t\tform1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction edit(){\r\n");
      out.write("\t\tif($('#id').val()==''){\r\n");
      out.write("\t\t\talert('请先选择节点！');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar boo=true;\r\n");
      out.write("    \tvar forms = $('.form-horizontal');\r\n");
      out.write("    \tif($(forms).find('.required').length>0){\r\n");
      out.write("    \t\t$(forms).find('.required').each(function(){\r\n");
      out.write("    \t\t\t$(this).parent().parent().removeClass(\"error\");\r\n");
      out.write("    \t\t\tif($(this).val()==''){\r\n");
      out.write("    \t\t\t\t$(this).parent().parent().addClass(\"error\");\r\n");
      out.write("    \t\t\t\tboo=false;\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t}\r\n");
      out.write("    \tif(!boo)\r\n");
      out.write("    \t\treturn false;\r\n");
      out.write("\t\tform1.action=\"/menu/edit\";\r\n");
      out.write("\t\tform1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction removeMenu(){\r\n");
      out.write("\t\tif(confirm(\"确定删除该节点？\")) {\r\n");
      out.write("\t\t\tif($('#id').val()==1){\r\n");
      out.write("\t\t\t\talert(\"根节点不允许删除！\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif($('#id').val()==''){\r\n");
      out.write("\t\t\t\talert('请先选择节点！');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tform1.action=\"/menu/delete\";\r\n");
      out.write("\t\t\tform1.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"breadcrumbs\">\r\n");
      out.write("\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t<li><i class=\"icon-home\"></i> <a href=\"#\">系统管理</a><span class=\"divider\"><i class=\"icon-angle-right\"></i></span></li>\r\n");
      out.write("\t\t<li class=\"active\">菜单管理</li>\r\n");
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
      out.write("\t\t\t\t\t\t<div class=\"span3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"height: 500px;overflow-y: auto; OVERFLOW-X:hidden;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul id=\"treeDemo\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"span9\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span12\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t<label class=\"control-label\" for=\"name\">节点名称</label>\r\n");
      out.write("\t\t\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t<input type=\"text\" name=\"name\" id=\"name\" class=\"required input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\" id=\"moduleDiv\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span12\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t<label class=\"control-label\" for=\"moduleId\">所属模块</label>\r\n");
      out.write("\t\t\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t<select name=\"moduleid\" id=\"moduleid\" class=\"input-medium\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<option value=\"\">-请选择-</option>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span12\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t<label class=\"control-label\" for=\"value\">路径</label>\r\n");
      out.write("\t\t\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t<input type=\"text\" name=\"value\" id=\"value\" class=\"input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.value }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span12\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label class=\"control-label\">图片</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-text-width\"/><span class=\"lbl\"> <i class=\"icon-text-width\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-desktop\"/><span class=\"lbl\"> <i class=\"icon-desktop\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-list\"/><span class=\"lbl\"> <i class=\"icon-list\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-edit\"/><span class=\"lbl\"> <i class=\"icon-edit\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-list-alt\"/><span class=\"lbl\"> <i class=\"icon-list-alt\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-calendar\"/><span class=\"lbl\"> <i class=\"icon-calendar\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-picture\"/><span class=\"lbl\"> <i class=\"icon-picture\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-th\"/><span class=\"lbl\"> <i class=\"icon-th\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"icon-file\"/><span class=\"lbl\"> <i class=\"icon-file\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"caiqie_16.png\"/><span class=\"lbl\"> <img src=\"../theme/images/caiqie_16.png\"/></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"caiqie_18.png\"/><span class=\"lbl\"> <img src=\"../theme/images/caiqie_18.png\"/></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"caiqie_20.png\"/><span class=\"lbl\"> <img src=\"../theme/images/caiqie_20.png\"/></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"caiqie_22.png\"/><span class=\"lbl\"> <img src=\"../theme/images/caiqie_22.png\"/></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"caiqie_24.png\"/><span class=\"lbl\"> <img src=\"../theme/images/caiqie_24.png\"/></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"caiqie_26.png\"/><span class=\"lbl\"> <img src=\"../theme/images/caiqie_26.png\"/></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<label class=\"radio inline font-size\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t<input name=\"icon\" type=\"radio\" value=\"caiqie_28.png\"/><span class=\"lbl\"> <img src=\"../theme/images/caiqie_28.png\"/></span>\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span12\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label class=\"control-label\" for=\"nature\">排序</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input type=\"text\" name=\"sequence\" id=\"sequence\" class=\"input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.sequence }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span12\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label class=\"control-label\" for=\"nature\">描述</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input type=\"text\" name=\"description\" id=\"description\" class=\"input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.description }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"height: 60px;\" />\r\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"text-align: left;padding-left: 90px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-info\" type=\"button\" onclick=\"add()\"><i class=\"icon-arrow-down\"></i> 保存到下级</button>\r\n");
      out.write("\t\t\t\t\t      \t\t<button class=\"btn btn-info\" type=\"button\" onclick=\"edit()\"><i class=\"icon-ok\"></i> 修改本级</button>\r\n");
      out.write("\t\t\t\t\t      \t\t<button class=\"btn btn-info\" type=\"button\" onclick=\"removeMenu()\"><i class=\"icon-remove\"></i> 删除本级</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${moduleList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("module");
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t    \t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${module.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${module.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t    \t\t\t\t");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
