package org.apache.jsp.WEB_002dINF.views.dataDictionary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/theme/lib/zTree3/css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/theme/lib/zTree3/js/jquery.ztree.core-3.5.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("var setting = {\t\r\n");
      out.write("\t\tcallback: {\r\n");
      out.write("\t\t\tonClick: onClick\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tvar zNodes ;\r\n");
      out.write("\t $.ajax({  \r\n");
      out.write("\t        async : false,  \r\n");
      out.write("\t        cache:false,  \r\n");
      out.write("\t        type: 'POST',  \r\n");
      out.write("\t        dataType : \"json\",  \r\n");
      out.write("\t        url: \"/dataDictionary/doGetTree\",//请求的action路径  \r\n");
      out.write("\t        error: function () {//请求失败处理函数  \r\n");
      out.write("\t            alert('请求失败');  \r\n");
      out.write("\t        },  \r\n");
      out.write("\t        success:function(data){ //请求成功后处理函数。    \r\n");
      out.write("\t            zNodes = data;   //把后台封装好的简单Json格式赋给treeNodes  \r\n");
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
      out.write("\t\t        url: \"/dataDictionary/doGetOne\",//请求的action路径  \r\n");
      out.write("\t\t        error: function () {//请求失败处理函数  \r\n");
      out.write("\t\t            alert('请求失败');  \r\n");
      out.write("\t\t        },  \r\n");
      out.write("\t\t        success:function(data){ //请求成功后处理函数。    \r\n");
      out.write("\t\t        \tdata = eval(data);\r\n");
      out.write("\t\t        \t$('#id').val(data.id);\r\n");
      out.write("\t\t        \t$('#name').val(data.name);\r\n");
      out.write("\t\t        \t$('#code').val(data.code);\r\n");
      out.write("\t\t        \t$('#sequence').val(data.sequence);\r\n");
      out.write("\t\t        \t$('#description').val(data.description);\r\n");
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
      out.write("\t\tvar boo = true;\r\n");
      out.write("\t\tvar forms = $('.form-horizontal');\r\n");
      out.write("\t\tif ($(forms).find('.required').length > 0) {\r\n");
      out.write("\t\t\t$(forms).find('.required').each(function() {\r\n");
      out.write("\t\t\t\t$(this).parent().parent().removeClass(\"error\");\r\n");
      out.write("\t\t\t\tif ($(this).val() == '') {\r\n");
      out.write("\t\t\t\t\t$(this).parent().parent().addClass(\"error\");\r\n");
      out.write("\t\t\t\t\tboo = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (!boo)\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tform1.action=\"/dataDictionary/add\";\r\n");
      out.write("\t\tform1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction edit(){\r\n");
      out.write("\t\tif($('#id').val()==''){\r\n");
      out.write("\t\t\talert('请先选择节点！');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar boo = true;\r\n");
      out.write("\t\tvar forms = $('.form-horizontal');\r\n");
      out.write("\t\tif ($(forms).find('.required').length > 0) {\r\n");
      out.write("\t\t\t$(forms).find('.required').each(function() {\r\n");
      out.write("\t\t\t\t$(this).parent().parent().removeClass(\"error\");\r\n");
      out.write("\t\t\t\tif ($(this).val() == '') {\r\n");
      out.write("\t\t\t\t\t$(this).parent().parent().addClass(\"error\");\r\n");
      out.write("\t\t\t\t\tboo = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (!boo)\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tform1.action=\"/dataDictionary/edit\";\r\n");
      out.write("\t\tform1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction removeDictionary(){\r\n");
      out.write("\t\tif($('#id').val()==1){\r\n");
      out.write("\t\t\talert(\"根节点不允许删除！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($('#id').val()==''){\r\n");
      out.write("\t\t\talert('请先选择节点！');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tform1.action=\"/dataDictionary/delete\";\r\n");
      out.write("\t\tform1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"breadcrumbs\">\r\n");
      out.write("\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t<li><i class=\"icon-home\"></i> <a href=\"#\">系统管理</a><span class=\"divider\"><i class=\"icon-angle-right\"></i></span></li>\r\n");
      out.write("\t\t<li class=\"active\">数据字典管理</li>\r\n");
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
      out.write("\t\t\t\t\t\t    \t\t\t<input type=\"text\" name=\"name\" id=\"name\" class=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t</div>\t\r\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span12\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t<label class=\"control-label\" for=\"code\">代码</label>\r\n");
      out.write("\t\t\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t    \t\t\t<input type=\"text\" name=\"code\" id=\"code\" class=\"required\" />\r\n");
      out.write("\t\t\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label class=\"control-label\" for=\"sequence\">排序</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input type=\"text\" name=\"sequence\" id=\"sequence\" />\r\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label class=\"control-label\" for=\"description\">描述</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input type=\"text\" name=\"description\" id=\"description\" style=\"height:60px;\" />\r\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"text-align: left;padding-left: 90px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-info\" type=\"button\" onclick=\"add()\"><i class=\"icon-arrow-down\"></i> 保存到下级</button>\r\n");
      out.write("\t\t\t\t\t      \t\t<button class=\"btn btn-info\" type=\"button\" onclick=\"edit()\"><i class=\"icon-ok\"></i> 修改本级</button>\r\n");
      out.write("\t\t\t\t\t      \t\t<button class=\"btn btn-info\" type=\"button\" onclick=\"removeDictionary()\"><i class=\"icon-remove\"></i> 删除本级</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
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
}
