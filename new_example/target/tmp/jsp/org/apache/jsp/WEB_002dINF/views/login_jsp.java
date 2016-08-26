package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>管理系统</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/theme/lib/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/theme/lib/jquery.cookie.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/theme/lib/jBox/jBox.min.js\"></script>\r\n");
      out.write("<link href=\"/theme/lib/jBox/jBox.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/theme/lib/jBox/themes/TooltipDark.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(" body {\r\n");
      out.write(" \tbackground-image: url(/theme/images/banner_slide_03.jpg);\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" html,body,table{\r\n");
      out.write(" \tbackground-color:#f5f5f5;\r\n");
      out.write(" \twidth:100%;\r\n");
      out.write(" \theight: 100%;\r\n");
      out.write(" \ttext-align:center;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .logindiv{\r\n");
      out.write("\t position:absolute;\r\n");
      out.write("\t left: 37%;\r\n");
      out.write("\t top: 120px;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .form-signin-heading{\r\n");
      out.write(" \tfont-family:Helvetica, Georgia, Arial, sans-serif, 黑体;\r\n");
      out.write(" \tfont-size:36px;\r\n");
      out.write(" \tmargin-bottom:20px;\r\n");
      out.write(" \tcolor:#0663a2;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .form-signin{\r\n");
      out.write(" \t\tposition:relative;\r\n");
      out.write(" \t\ttext-align:left;\r\n");
      out.write(" \t\twidth:300px;\r\n");
      out.write(" \t\tpadding:25px 29px 29px;\r\n");
      out.write(" \t\tmargin:0 auto 20px;\r\n");
      out.write(" \t\tbackground-color:#fff;\r\n");
      out.write(" \t\tborder:1px solid #e5e5e5;\r\n");
      out.write("   \t\t-webkit-border-radius:5px;\r\n");
      out.write("   \t\t-moz-border-radius:5px;\r\n");
      out.write("   \t\tborder-radius:5px;\r\n");
      out.write("   \t\t-webkit-box-shadow:0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("   \t\t-moz-box-shadow:0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("   \t\tbox-shadow:0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write(" .form-signin .checkbox{\r\n");
      out.write(" \tmargin-bottom:10px;\r\n");
      out.write(" \tcolor:#0663a2;\r\n");
      out.write(" } \r\n");
      out.write(" \r\n");
      out.write(" .form-signin .input-label{\r\n");
      out.write(" \tfont-size:16px;\r\n");
      out.write(" \tline-height:23px;\r\n");
      out.write(" \tcolor:#999;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .form-signin .input-block-level{\r\n");
      out.write(" \tfont-size:16px;\r\n");
      out.write(" \theight:auto;\r\n");
      out.write(" \tmargin-bottom:15px;\r\n");
      out.write(" \tpadding:7px;\r\n");
      out.write(" \t*width:283px;\r\n");
      out.write(" \t*padding-bottom:0;\r\n");
      out.write(" \t_padding:7px 7px 9px 7px;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .form-signin .btn.btn-large{font-size:16px;} \r\n");
      out.write(" \r\n");
      out.write(" .form-signin #themeSwitch{position:absolute;right:15px;bottom:10px;}\r\n");
      out.write(" \r\n");
      out.write(" .form-signin div.validateCode {padding-bottom:15px;} \r\n");
      out.write(" \r\n");
      out.write(" .mid{vertical-align:middle;}\r\n");
      out.write(" \r\n");
      out.write(" .header{height:80px;padding-top:20px;} \r\n");
      out.write(" \r\n");
      out.write(" .alert{position:relative;width:300px;margin:0 auto;*padding-bottom:0px;}\r\n");
      out.write(" \r\n");
      out.write(" label.error{background:none;width:270px;font-weight:normal;color:inherit;margin:0;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function verifyForm(){\r\n");
      out.write("\tif($(\"#loginId\").val()==''){\r\n");
      out.write("\t\tnew jBox('Tooltip', {\r\n");
      out.write("\t\t\ttheme: 'TooltipDark',\r\n");
      out.write("\t\t\tcloseOnClick: 'body',\r\n");
      out.write("\t\t\tcloseOnEsc: true,\r\n");
      out.write("\t\t\tanimation: 'move',\r\n");
      out.write("\t\t\toffset: {\r\n");
      out.write("\t\t\t\tx: 100,\r\n");
      out.write("\t            y: 245\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcontent: '请输入用户名',\r\n");
      out.write("\t\t}).open();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif($(\"#password\").val()==''){\r\n");
      out.write("\t\tnew jBox('Tooltip', {\r\n");
      out.write("\t\t\ttheme: 'TooltipDark',\r\n");
      out.write("\t\t\tcloseOnClick: 'body',\r\n");
      out.write("\t\t\tcloseOnEsc: true,\r\n");
      out.write("\t\t\tanimation: 'move',\r\n");
      out.write("\t\t\toffset: {\r\n");
      out.write("\t\t\t\tx: 107,\r\n");
      out.write("\t            y: 320\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcontent: '请输入密码',\r\n");
      out.write("\t\t}).open();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif($('#remember').is(\":checked\")){\r\n");
      out.write("\t\t$.cookie(\"loginId_\",$(\"#loginId\").val(), { path: '/', expires: 10 });\r\n");
      out.write("\t\t$.cookie(\"password_\",$(\"#password\").val(), { path: '/', expires: 10 });\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\tvar errorstr = $('#errorstr').val();\r\n");
      out.write("\tif(errorstr!=''){\r\n");
      out.write("\t\tif(errorstr=='2') {\r\n");
      out.write("\t\t\tnew jBox('Notice', {\r\n");
      out.write("\t\t\t\tcolor: 'red',\r\n");
      out.write("\t\t        content: '用户名密码错误',\r\n");
      out.write("\t\t        position: {\r\n");
      out.write("\t\t        \tx: 'center', \r\n");
      out.write("\t\t        \ty: 'top'\r\n");
      out.write("\t\t        }, \r\n");
      out.write("\t\t        pointer: 'top:20',\r\n");
      out.write("\t\t        autoClose: 2000\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(errorstr=='3') {\r\n");
      out.write("\t\t\tnew jBox('Notice', {\r\n");
      out.write("\t\t\t\tcolor: 'red',\r\n");
      out.write("\t\t        content: '用户没有权限',\r\n");
      out.write("\t\t        position: {\r\n");
      out.write("\t\t        \tx: 'center', \r\n");
      out.write("\t\t        \ty: 'top'\r\n");
      out.write("\t\t        }, \r\n");
      out.write("\t\t        autoClose: 2000\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#loginId\").val($.cookie(\"loginId_\"));\r\n");
      out.write("\t$(\"#password\").val($.cookie(\"password_\"));\r\n");
      out.write("});\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"logindiv\">\r\n");
      out.write("\t<h1 class=\"form-signin-heading\" style=\"color: white;\">管理平台</h1>\r\n");
      out.write("\t<form id=\"loginForm\" class=\"form-signin\" action=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" method=\"post\" onsubmit=\"return verifyForm()\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"errorstr\" id=\"errorstr\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ errorstr }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t<label class=\"input-label\" for=\"username\">用户名</label>\r\n");
      out.write("\t\t<input type=\"text\" id=\"loginId\" name=\"loginId\" class=\"input-block-level required\" value=\"\" />\r\n");
      out.write("\t\t<label class=\"input-label\" for=\"password\">密码</label>\r\n");
      out.write("\t\t<input type=\"password\" id=\"password\" name=\"password\" class=\"input-block-level required\" />\r\n");
      out.write("\t\t<input class=\"btn btn-large btn-primary\" type=\"submit\" value=\"登 录\"/>&nbsp;&nbsp;\r\n");
      out.write("\t\t<label for=\"remember\" title=\"下次不需要再登录\"><input type=\"checkbox\" id=\"remember\" name=\"remember\" /> 记住我（公共场所慎用）</label>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/signIn");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
