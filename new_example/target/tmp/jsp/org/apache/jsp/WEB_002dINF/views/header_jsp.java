package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- basic styles -->\r\n");
      out.write("<link href=\"/theme/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"/theme/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/font-awesome.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/bootstrap-datetimepicker.min.css\" />\r\n");
      out.write("<!--[if IE 7]>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.min.css\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace-responsive.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace-skins.min.css\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/ace-ie.min.css\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script src=\"/theme/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script src=\"/theme/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- page specific plugin scripts -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/theme/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/theme/js/jquery.dataTables.bootstrap.js\"></script>\r\n");
      out.write("<!-- ace scripts -->\r\n");
      out.write("<script src=\"/theme/js/ace-elements.min.js\"></script>\r\n");
      out.write("<script src=\"/theme/js/ace.min.js\"></script>\r\n");
      out.write("<script src=\"/theme/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script src=\"/theme/js/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/theme/lib/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/theme/lib/jBox/jBox.min.js\"></script>\r\n");
      out.write("<link href=\"/theme/lib/jBox/jBox.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".search{\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type='text']{\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("select{\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".conts{\r\n");
      out.write("\tpadding-top: 4px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tborder-bottom: 1px #c5d0dc solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table th{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table td{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("em{\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tmargin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error{\r\n");
      out.write("\tborder-color: red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\t\r\n");
      out.write("\tjQuery.extend(jQuery.validator.messages, { \r\n");
      out.write("\t\trequired: \"必填字段\", \r\n");
      out.write("\t\tremote: \"请修正该字段\", \r\n");
      out.write("\t\temail: \"请输入正确格式的电子邮件\", \r\n");
      out.write("\t\turl: \"请输入合法的网址\", \r\n");
      out.write("\t\tdate: \"请输入合法的日期\", \r\n");
      out.write("\t\tdateISO: \"请输入合法的日期 (ISO).\", \r\n");
      out.write("\t\tnumber: \"请输入合法的数字\", \r\n");
      out.write("\t\tdigits: \"只能输入整数\", \r\n");
      out.write("\t\tcreditcard: \"请输入合法的信用卡号\", \r\n");
      out.write("\t\tequalTo: \"请再次输入相同的值\", \r\n");
      out.write("\t\taccept: \"请输入拥有合法后缀名的字符串\", \r\n");
      out.write("\t\tmaxlength: jQuery.validator.format(\"请输入一个长度最多是 {0} 的字符串\"), \r\n");
      out.write("\t\tminlength: jQuery.validator.format(\"请输入一个长度最少是 {0} 的字符串\"), \r\n");
      out.write("\t\trangelength: jQuery.validator.format(\"请输入一个长度介于 {0} 和 {1} 之间的字符串\"), \r\n");
      out.write("\t\trange: jQuery.validator.format(\"请输入一个介于 {0} 和 {1} 之间的值\"), \r\n");
      out.write("\t\tmax: jQuery.validator.format(\"请输入一个最大为 {0} 的值\"), \r\n");
      out.write("\t\tmin: jQuery.validator.format(\"请输入一个最小为 {0} 的值\") \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$('.datetimepicker').datetimepicker({\r\n");
      out.write("        //language:  'fr',\r\n");
      out.write("        weekStart: 1,\r\n");
      out.write("        minView: \"month\",\r\n");
      out.write("        todayBtn:  1,\r\n");
      out.write("\t\tautoclose: 1,\r\n");
      out.write("\t\ttodayHighlight: 1,\r\n");
      out.write("\t\tstartView: 2,\r\n");
      out.write("\t\tlanguage: 'zh-CN', //汉化\r\n");
      out.write("\t\tforceParse: 0,\r\n");
      out.write("\t\tformat: \"yyyy-mm-dd\",\r\n");
      out.write("        showMeridian: 1\r\n");
      out.write("    }); \r\n");
      out.write("\t\r\n");
      out.write("\t$.parsePath = function(){\r\n");
      out.write("\t\tvar path = location.pathname;\r\n");
      out.write("\t\tpath = \"/\" + path.split(\"/\")[1];\r\n");
      out.write("\t\treturn path;\r\n");
      out.write("\t};\r\n");
      out.write("    \r\n");
      out.write("\t$('.btn-query').click(function(){\r\n");
      out.write("    \t$('.form-query').attr(\"action\", $.parsePath() + \"/index\");\r\n");
      out.write("    \t$('.form-query').submit();\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('.btn-view').click(function(){\r\n");
      out.write("    \tvar chId=$(this).parent().parent().find('.ckTd').val();\r\n");
      out.write("    \tlocation.href=$.parsePath()+\"/view?id=\"+chId;\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('.btn-add').click(function(){\r\n");
      out.write("    \tlocation.href=$.parsePath()+\"/add\";\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('.btn-edit').click(function(){\r\n");
      out.write("    \tvar chId=$(this).parent().parent().find('.ckTd').val();\r\n");
      out.write("    \tlocation.href=$.parsePath()+\"/add?id=\"+chId;\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('.btn-delete').click(function(){\r\n");
      out.write("    \tif(confirm(\"确认删除记录吗?\")){\r\n");
      out.write("    \t\tvar chId=$(this).parent().parent().find('.ckTd').val(); \r\n");
      out.write("    \t\tlocation.href=$.parsePath()+\"/delete?id=\"+chId;\r\n");
      out.write("    \t}\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('.btn-deleteAll').click(function(){\r\n");
      out.write("    \tvar boo=true;\r\n");
      out.write("    \t$('.ckTd').each(function(){\r\n");
      out.write("\t\t\tif($(this).is(\":checked\")==true){\r\n");
      out.write("\t\t\t\tboo=false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif(boo){\r\n");
      out.write("\t\t\talert(\"请选择要删除的记录！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}    \t\t\r\n");
      out.write("    \tif(confirm(\"确认删除选中记录吗?\")){\r\n");
      out.write("   \t\t\tvar ids='';\r\n");
      out.write("    \t\t$('.ckTd').each(function(){\r\n");
      out.write("    \t\t\tif($(this).is(\":checked\")==true){\r\n");
      out.write("    \t\t\t\tids+=$(this).val()+\",\";\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t\tlocation.href=$.parsePath()+\"/deleteAll?ids=\"+ids;\r\n");
      out.write("    \t}\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('table th input:checkbox').on('click' , function(){\r\n");
      out.write("\t\tvar that = this;\r\n");
      out.write("\t\t$(this).closest('table').find('tr > td:first-child input:checkbox')\r\n");
      out.write("\t\t.each(function(){\r\n");
      out.write("\t\t\tthis.checked = that.checked;\r\n");
      out.write("\t\t\t$(this).closest('tr').toggleClass('selected');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t});\r\n");
      out.write("    \r\n");
      out.write("    $('.btn-save').click(function(){\r\n");
      out.write("    \tvar boo=true;\r\n");
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
      out.write("    \t\r\n");
      out.write("    \tif (!forms.validate().form()) return false;\r\n");
      out.write("    \t\r\n");
      out.write("\t\tvar path=$.parsePath().replace(\"add\",\"\");\r\n");
      out.write("\t\tform1.action=path+\"/save\";\r\n");
      out.write("\t\tform1.submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* $.ajax({  \r\n");
      out.write("\t        async:false,  \r\n");
      out.write("\t        cache:false,  \r\n");
      out.write("\t        type:'POST', \r\n");
      out.write("\t        dataType:\"json\",  \r\n");
      out.write("\t        data:forms.serialize(),\r\n");
      out.write("\t        url: path,//请求的action路径  \r\n");
      out.write("\t        error: function () {//请求失败处理函数  \r\n");
      out.write("\t            new jBox('Notice', {\r\n");
      out.write("\t\t\t\t\tcolor: 'red',\r\n");
      out.write("\t\t\t        content: '请求失败',\r\n");
      out.write("\t\t\t        position: {\r\n");
      out.write("\t\t\t        \tx: 'center', \r\n");
      out.write("\t\t\t        \ty: 'top'\r\n");
      out.write("\t\t\t        }, \r\n");
      out.write("\t\t\t        autoClose: 2000\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t        },  \r\n");
      out.write("\t        success:function(data){ //请求成功后处理函数。  \r\n");
      out.write("\t        \tif(data.success){\r\n");
      out.write("\t        \t\tnew jBox('Notice', {\r\n");
      out.write("\t\t\t\t\t\tcolor: 'green',\r\n");
      out.write("\t\t\t\t        content: data.message,\r\n");
      out.write("\t\t\t\t        position: {\r\n");
      out.write("\t\t\t\t        \tx: 'center', \r\n");
      out.write("\t\t\t\t        \ty: 'top'\r\n");
      out.write("\t\t\t\t        }, \r\n");
      out.write("\t\t\t\t        autoClose: 1900\r\n");
      out.write("\t\t\t\t    });\r\n");
      out.write("\t        \t\tsetTimeout('location.href=$.parsePath().replace(\"add\",\"\") + \"/index\"', 2000);\r\n");
      out.write("\t        \t}else{\r\n");
      out.write("\t        \t\tnew jBox('Notice', {\r\n");
      out.write("\t\t\t\t\t\tcolor: 'red',\r\n");
      out.write("\t\t\t\t        content: data.message,\r\n");
      out.write("\t\t\t\t        position: {\r\n");
      out.write("\t\t\t\t        \tx: 'center', \r\n");
      out.write("\t\t\t\t        \ty: 'center'\r\n");
      out.write("\t\t\t\t        }, \r\n");
      out.write("\t\t\t\t        autoClose: 1900\r\n");
      out.write("\t\t\t\t    });\r\n");
      out.write("\t        \t}\r\n");
      out.write("\t        }  \r\n");
      out.write("\t    }); */\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $('.btn-empty').click(function(){\r\n");
      out.write("    \t$('.form-query').find(\"input[type='text']\").val(\"\");\r\n");
      out.write("    \t$('.form-query').find(\"select\").val(\"\");\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('.btn-download').click(function(){\r\n");
      out.write("    \t$('.form-query').attr(\"action\",$.parsePath()+\"/download\");\r\n");
      out.write("    \t$('.form-query').submit();\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $('.btn-upload').click(function(){\r\n");
      out.write("    \twindow.showModelessDialog(\"annexAnnex.action?ran=\"+Math.random(),window,\"dialogWidth:400px;dialogHeight:300px;center:yes;status:no;scroll:no;help:no;\");\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    if($('.controls-upload').length>0){\r\n");
      out.write("    \t$('.controls-upload').find(\"input:hidden\").each(function(){\r\n");
      out.write("    \t\tvar obj=$(this).parent().find('.btn-upload');\r\n");
      out.write("\t\t\tif($(this).val()!=''){\r\n");
      out.write("\t\t\t\tvar strs=$(this).val().split(\",\");\r\n");
      out.write("\t\t\t\t$.each(strs,function(i,value) {\r\n");
      out.write("\t    \t\t\t$.ajax({  \r\n");
      out.write("\t    \t\t        async : false,  \r\n");
      out.write("\t    \t\t        cache:false,  \r\n");
      out.write("\t    \t\t        type: 'POST', \r\n");
      out.write("\t    \t\t        data:{'id':value},\r\n");
      out.write("\t    \t\t        dataType : \"json\",  \r\n");
      out.write("\t    \t\t        url: \"annexOne.action\",//请求的action路径  \r\n");
      out.write("\t    \t\t        error: function () {//请求失败处理函数  \r\n");
      out.write("\t    \t\t            alert('请求失败');  \r\n");
      out.write("\t    \t\t        },  \r\n");
      out.write("\t    \t\t        success:function(data){ //请求成功后处理函数。    \r\n");
      out.write("\t    \t\t        \tdata = eval(data);\r\n");
      out.write("\t    \t\t        \tvar ss='<span id=\"fj_'+data.id+'\" style=\"vertical-align: bottom;;margin-left: 10px;\">●<a href=\"upload'+data.filePath+'\" target=\"_blank\" style=\"margin-right: 5px;margin-left: 5px;\">'+data.fileName+'</a>[<a style=\"font-size: 12px;\" onclick=\"fjdel('+data.id+')\">删除</a>]</span>';\r\n");
      out.write("\t    \t\t        \tobj.before(ss);\r\n");
      out.write("\t    \t\t        }  \r\n");
      out.write("\t    \t\t    }); \r\n");
      out.write("\t            });\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("    }\r\n");
      out.write("});  \r\n");
      out.write("\r\n");
      out.write("function fjdel(id){\r\n");
      out.write("\tif(confirm(\"确认删除附件吗?\")){\r\n");
      out.write("\t\t$('#fj_'+id).remove();\r\n");
      out.write("\t\t$('.controls-upload').find(\"input:hidden\").each(function(){\r\n");
      out.write("\t\t\tif($(this).val()!=''){\r\n");
      out.write("\t\t\t\tvar strs=$(this).val().split(\",\");\r\n");
      out.write("\t\t\t\tvar fjids='';\r\n");
      out.write("\t\t\t\t$.each(strs,function(i,value) {\r\n");
      out.write("\t    \t\t\tif(value!=id)\r\n");
      out.write("\t    \t\t\t\tfjids=fjids+value+',';\r\n");
      out.write("\t            });\r\n");
      out.write("\t\t\t\tfjids=fjids.substring(0,fjids.length-1);\r\n");
      out.write("\t\t\t\t$(this).val(fjids);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function gopage(num){\r\n");
      out.write("\t$('#pageNum').val(num);\r\n");
      out.write("\t$('#numPerPage').val($('#perPage').val());\r\n");
      out.write("\t$('.form-query').submit();\r\n");
      out.write("}\r\n");
      out.write("</script>");
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
