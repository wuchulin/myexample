package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_type_nobody.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
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
      out.write("\t\t<li class=\"active\">用户编辑</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"page-content\" class=\"clearfix\">\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" method=\"post\" name=\"form1\" id=\"form1\">\r\n");
      out.write("\t\t\t\t\t<input name=\"id\" id=\"id\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"name\">姓名</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<input type=\"text\" name=\"name\" id=\"name\" class=\"required input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"identitycard\">身份证</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t    \t\t<input type=\"text\" name=\"identitycard\" id=\"identitycard\" class=\"required input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.identitycard }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t  \t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"gender\">性别</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"phone\">电话</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t    \t\t<input type=\"text\" name=\"phone\" id=\"phone\" class=\"input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.phone }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"jobName\">所属职位</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<input type=\"text\" name=\"jobname\" id=\"jobname\" class=\"input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.jobname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"email\">邮箱</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t    \t\t<input type=\"email\" name=\"email\" id=\"email\" class=\"email input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.email }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"qq\">QQ</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<input type=\"text\" name=\"qq\" id=\"qq\" class=\"input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.qq }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"sequence\">排序</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t    \t\t<input type=\"text\" name=\"sequence\" id=\"sequence\" class=\"input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.sequence }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"loginId\">登录名</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t    \t\t<input type=\"text\" name=\"loginid\" id=\"loginid\" class=\"required input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.loginid }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"password\">密码</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t<input type=\"text\" name=\"password\" id=\"password\" class=\"required input-medium\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.password }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t    \t\t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\" for=\"createtime\">创建时间</label>\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t    \t\t<input type=\"text\" name=\"createtime\" id=\"createtime\" class=\"input-medium datetimepicker\" value=\"");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span6\">\r\n");
      out.write("\t\t\t\t    \t\t<label class=\"control-label\">所属角色</label>\r\n");
      out.write("\t\t\t\t    \t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t    \t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.gender.equals('男') }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t    \t<label class=\"radio inline font-size\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"gender\" type=\"radio\" value=\"男\" checked=\"checked\"/><span class=\"lbl\"> 男</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t <label class=\"radio inline font-size\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"gender\" type=\"radio\" value=\"女\"/><span class=\"lbl\"> 女</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t    ");
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

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.gender.equals('女') }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t    \t<label class=\"radio inline font-size\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"gender\" type=\"radio\" value=\"男\"/><span class=\"lbl\"> 男</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t    \t<label class=\"radio inline font-size\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"gender\" type=\"radio\" value=\"女\" checked=\"checked\"/><span class=\"lbl\"> 女</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
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
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t        <label class=\"radio inline font-size\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"gender\" type=\"radio\" value=\"男\"/><span class=\"lbl\"> 男</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t        <label class=\"radio inline font-size\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"gender\" type=\"radio\" value=\"女\"/><span class=\"lbl\"> 女</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t    ");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ entity.createtime }", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setType("date");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ roleList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("role");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
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

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ roles.contains(role.id.toString()) }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t    \t\t\t\t\t<label class=\"checkbox inline font-size\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"roleIds\" type=\"checkbox\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" checked=\"checked\"><span class=\"lbl\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t    \t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t    \t\t\t\t\t<label class=\"checkbox inline font-size\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"roleIds\" type=\"checkbox\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><span class=\"lbl\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t    \t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }
}
