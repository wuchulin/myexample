package org.apache.jsp.WEB_002dINF.views.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/theme/lib/zTree3/js/jquery.ztree.excheck-3.5.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("\tvar setting = {\t\r\n");
      out.write("\t\t\tcheck: {\r\n");
      out.write("\t\t\t\tenable: true\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdata: {\r\n");
      out.write("\t\t\t\tsimpleData: {\r\n");
      out.write("\t\t\t\t\tenable: true\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcallback:{\r\n");
      out.write("                onCheck:onCheck\r\n");
      out.write("            }\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tvar zNodes ;\r\n");
      out.write("\t$.ajax({  \r\n");
      out.write("\t\tasync : false,  \r\n");
      out.write("        cache:false,  \r\n");
      out.write("        type: 'POST',  \r\n");
      out.write("        dataType : \"json\",  \r\n");
      out.write("        url: \"/menu/doGetMenuTree\",//请求的action路径  \r\n");
      out.write("        error: function () {//请求失败处理函数  \r\n");
      out.write("            alert('请求失败');  \r\n");
      out.write("        },  \r\n");
      out.write("        success:function(data){ //请求成功后处理函数。    \r\n");
      out.write("        \tif(data.success) {\r\n");
      out.write("\t            zNodes = $.parseJSON(data.message);  //把后台封装好的简单Json格式赋给treeNodes  \r\n");
      out.write("        \t}\r\n");
      out.write("        }  \r\n");
      out.write("\t});  \r\n");
      out.write("\t\r\n");
      out.write("\tfunction onCheck(e,treeId,treeNode){\r\n");
      out.write("         var treeObj=$.fn.zTree.getZTreeObj(\"treeDemo\"),\r\n");
      out.write("         nodes=treeObj.getCheckedNodes(true),\r\n");
      out.write("         v=\"\";\r\n");
      out.write("         for(var i=0;i<nodes.length;i++){\r\n");
      out.write("         \tv+=nodes[i].id + \",\";\r\n");
      out.write("         }\r\n");
      out.write("         $('#menuIds').val(v);\r\n");
      out.write("\t}\r\n");
      out.write("\t \r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvar treeObj=$.fn.zTree.init($(\"#treeDemo\"), setting, zNodes);\r\n");
      out.write("\t\tvar menuIds=$('#menuIds').val();\r\n");
      out.write("\t\tif(menuIds!=''){\r\n");
      out.write("\t\t\tmenuIds=menuIds.split(\",\");\r\n");
      out.write("\t\t\tfor(var i=0;i<menuIds.length;i++){\r\n");
      out.write("\t\t\t\tvar node=treeObj.getNodeByParam(\"id\", menuIds[i], null);\r\n");
      out.write("\t\t\t\ttreeObj.checkNode(node,true,false,false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar mos=''+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ modules }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("+'';\r\n");
      out.write("\t\tmos=mos.split(',');\r\n");
      out.write("\t\tfor(var i=0;i<mos.length;i++){\r\n");
      out.write("\t\t\t$(\"input[name='moduleIds']\").each(function(){\r\n");
      out.write("\t\t\t\tif($(this).val()==mos[i])\r\n");
      out.write("\t\t\t\t\t$(this).prop(\"checked\",\"checked\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"breadcrumbs\">\r\n");
      out.write("\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t<li><i class=\"icon-home\"></i> <a href=\"#\">系统管理</a><span class=\"divider\"><i class=\"icon-angle-right\"></i></span></li>\r\n");
      out.write("\t\t<li class=\"active\">角色编辑</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"page-content\" class=\"clearfix\">\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" method=\"post\" name=\"form1\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"menuIds\" id=\"menuIds\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ menuIds }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span4\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"name\">角色名</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<input type=\"text\" name=\"name\" id=\"name\" class=\"required input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t<div class=\"control-group span8\">\r\n");
      out.write("\t\t\t\t  \t\t\t<label class=\"control-label\" for=\"moduleIds\">系统权限</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t    \t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t  \t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t  \t\t<div class=\"span4\">\r\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t  \t\t<div class=\"control-group span4\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label class=\"control-label\" for=\"sequence\">排序</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input type=\"text\" name=\"sequence\" id=\"sequence\" class=\"required input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.sequence }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t  \t\t<div class=\"control-group span4\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t<label class=\"control-label\" for=\"description\">描述</label>\r\n");
      out.write("\t\t\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t    \t\t<input type=\"text\" name=\"description\" id=\"description\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.description }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"height:60px;width:200px;\" />\r\n");
      out.write("\t\t\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"span8\">\r\n");
      out.write("\t\t\t\t\t    \t<label class=\"control-label\" for=\"nature\">角色权限</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"zTreeDemoBackground left\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t<ul id=\"treeDemo\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
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
          out.write("\t\t\t    \t\t\t\t\t<label class=\"checkbox inline font-size\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"moduleIds\" type=\"checkbox\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ module.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>&nbsp;<span class=\"lbl\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ module.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
          out.write("\t\t\t    \t\t\t\t");
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
