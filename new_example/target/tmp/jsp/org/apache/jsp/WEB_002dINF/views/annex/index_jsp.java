package org.apache.jsp.WEB_002dINF.views.annex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/theme/lib/uploadify/uploadify.css\">\r\n");
      out.write("<script src=\"/theme/lib/uploadify/jquery.uploadify.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function () {\r\n");
      out.write("    $(\"#uploadify\").uploadify({\r\n");
      out.write("        //指定swf文件\r\n");
      out.write("        'swf': '/theme/lib/uploadify/uploadify.swf',\r\n");
      out.write("        //后台处理的页面\r\n");
      out.write("        'uploader': '/annex/upload',\r\n");
      out.write("        //按钮显示的文字\r\n");
      out.write("        'buttonText': '选择文件',\r\n");
      out.write("        //按钮的高度和宽度，默认 height 30；width 120\r\n");
      out.write("        //'height': 15,\r\n");
      out.write("        //'width': 80,\r\n");
      out.write("        //上传文件的类型  默认为所有文件    'All Files'  ;  '*.*'\r\n");
      out.write("        'fileTypeDesc': 'All Files',//'Image Files',\r\n");
      out.write("        //允许上传的文件后缀 '*.gif; *.jpg; *.png',\r\n");
      out.write("        'fileTypeExts': '*.*',\r\n");
      out.write("        //发送给后台的其他参数通过formData指定， 动态传参\r\n");
      out.write("        //'formData': { 'emergencyId': 1 },\r\n");
      out.write("        //上传文件页面中，你想要用来作为文件队列的元素的id, 默认为false  自动生成,  不带#\r\n");
      out.write("        //'queueID': 'fileQueue',\r\n");
      out.write("        //选择文件后自动上传\r\n");
      out.write("        'auto': true,\r\n");
      out.write("        //设置为true将允许多文件上传\r\n");
      out.write("        'multi': true,\r\n");
      out.write("        'onUploadSuccess': function(file, data, response) {  \r\n");
      out.write("            alert( file.name + ' 上传成功！ ');  \r\n");
      out.write("        },\r\n");
      out.write("        'onError': function(event, queueID, file)   \r\n");
      out.write("        {    \r\n");
      out.write("       \t\talert(file.name + \" 上传失败\");    \r\n");
      out.write("        },\r\n");
      out.write("        //onUploadStart 动态传参的关键\r\n");
      out.write("        //'onUploadStart': function(){\r\n");
      out.write("        //\t$(\"#file_upload\").uploadify(\"settings\", \"formData\", {'emergencyId': $(\"#id\").val()});\r\n");
      out.write("        //},\r\n");
      out.write("        //检测FLASH失败调用  \r\n");
      out.write("        'onFallback' : function() {\r\n");
      out.write("            alert(\"您未安装FLASH控件，无法上传图片！请安装FLASH控件后再试。\");  \r\n");
      out.write("        }, \r\n");
      out.write("    }); \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"breadcrumbs\">\r\n");
      out.write("\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t<li><i class=\"icon-home\"></i> <a href=\"#\">系统管理</a><span class=\"divider\"><i class=\"icon-angle-right\"></i></span></li>\r\n");
      out.write("\t\t<li class=\"active\">附件上传</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"page-content\" class=\"clearfix\">\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"control-group span1\">\r\n");
      out.write("\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<input type=\"file\" name=\"uploadify\" id=\"uploadify\" class=\"uploadify-button\" />\r\n");
      out.write("\t    \t\t</div>\r\n");
      out.write("\t  \t\t</div>\r\n");
      out.write("\t  \t\t<form class=\"form-query\" method=\"post\" name=\"form1\">\r\n");
      out.write("\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"pageNum\" name=\"pageNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageInfo.pageNum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"numPerPage\" name=\"numPerPage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageInfo.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"orderField\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.orderField}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"orderDirection\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.orderDirection}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<table class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"center input-minis\"><label><input type=\"checkbox\" /><span class=\"lbl\"></span></label></th>\r\n");
      out.write("\t\t\t\t\t\t<th>序号</th>\r\n");
      out.write("\t\t\t\t\t\t<th>附件显示名</th>\r\n");
      out.write("\t\t\t\t\t\t<th>附件名</th>\r\n");
      out.write("\t\t\t\t\t\t<th>附件地址</th>\r\n");
      out.write("\t\t\t\t\t\t<th>创建时间</th>\r\n");
      out.write("\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<tr style=\"background:#F8F8F8;\">\r\n");
      out.write("\t\t\t\t\t<td colspan=\"7\" style=\"border-bottom:none;\">\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../pagination.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageInfo.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("entity");
    _jspx_th_c_forEach_0.setVarStatus("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td class='center'>\r\n");
          out.write("\t\t\t\t\t\t\t<label>\r\n");
          out.write("\t\t\t\t\t\t\t\t<input type='checkbox' value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"checkId\" class=\"ckTd\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"lbl\"></span>\r\n");
          out.write("\t\t\t\t\t\t\t</label>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ s.index + 1 }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.displayname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.filename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entity.filepath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t<a class=\"btn btn-delete btn-mini btn-danger\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<i class=\"icon-trash\"></i> \r\n");
          out.write("\t\t\t\t\t\t\t\t删除\r\n");
          out.write("\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.createtime }", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }
}
