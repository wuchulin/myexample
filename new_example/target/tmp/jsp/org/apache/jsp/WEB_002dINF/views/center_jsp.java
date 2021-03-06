package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class center_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"description\" content=\"overview & stats\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("<!-- basic styles -->\n");
      out.write("<link href=\"/theme/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"/theme/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/font-awesome.min.css\" />\n");
      out.write("<!--[if IE 7]>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.min.css\" />\n");
      out.write("<![endif]-->\n");
      out.write("<!-- page specific plugin styles -->\n");
      out.write("\n");
      out.write("<!-- ace styles -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace-responsive.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"/theme/css/ace-skins.min.css\" />\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/ace-ie.min.css\" />\n");
      out.write("<![endif]-->\n");
      out.write("<!-- <script src=\"/theme/1.9.1/jquery.min.js\"></script> -->\n");
      out.write("<script src=\"/theme/js/jquery-1.9.1.min.js\"></script>\n");
      out.write("<script src=\"/theme/lib/highcharts/js/highcharts.js\"></script>\n");
      out.write("<script src=\"/theme/lib/highcharts/js/highcharts-more.js\"></script>\n");
      out.write("</head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function () {\n");
      out.write("    $('#container').highcharts({\n");
      out.write("        chart: {\n");
      out.write("            type: 'column'\n");
      out.write("        },\n");
      out.write("        title: {\n");
      out.write("            text: '按残疾类型统计(浙江省)'\n");
      out.write("        },\n");
      out.write("        xAxis: {\n");
      out.write("            categories: ['视力残疾', '听力残疾', '言语残疾', '肢体残疾', '智力残疾', '精神残疾', '多重残疾']\n");
      out.write("        },\n");
      out.write("        yAxis: {\n");
      out.write("            min: 0,\n");
      out.write("            title: {\n");
      out.write("                text: '人数'\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        credits:{\n");
      out.write("        \tenabled:false\n");
      out.write("        },\n");
      out.write("        tooltip: {\n");
      out.write("            pointFormat: '<span style=\"color:{series.color}\">{series.name}</span>: <b>{point.y}</b> ({point.percentage:.0f}%)<br/>',\n");
      out.write("            shared: true\n");
      out.write("        },\n");
      out.write("        plotOptions: {\n");
      out.write("            column: {\n");
      out.write("                stacking: 'normal'\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("            series: [{\n");
      out.write("            name: '一级',\n");
      out.write("            data: [5, 3, 4, 7, 2,4,5]\n");
      out.write("        }, {\n");
      out.write("            name: '二级',\n");
      out.write("            data: [2, 2, 3, 2, 1,4,5]\n");
      out.write("        }, {\n");
      out.write("            name: '三级',\n");
      out.write("            data: [3, 4, 4, 2, 5,4,5]\n");
      out.write("        },{\n");
      out.write("            name: '四级',\n");
      out.write("            data: [3, 4, 4, 2, 5,4,5]\n");
      out.write("        }]\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $('#container3').highcharts({\n");
      out.write("        chart: {\n");
      out.write("            type: 'column'\n");
      out.write("        },\n");
      out.write("        title: {\n");
      out.write("            text: '非常规数据统计'\n");
      out.write("        },\n");
      out.write("        xAxis: {\n");
      out.write("            categories: ['杭州市', '温州市', '宁波市', '丽水市', '嘉兴市', '绍兴市', '湖州市']\n");
      out.write("        },\n");
      out.write("        yAxis: {\n");
      out.write("            min: 0,\n");
      out.write("            title: {\n");
      out.write("                text: '数量'\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        credits:{\n");
      out.write("        \tenabled:false\n");
      out.write("        },\n");
      out.write("        tooltip: {\n");
      out.write("            pointFormat: '<span style=\"color:{series.color}\">{series.name}</span>: <b>{point.y}<br/>',\n");
      out.write("            shared: true\n");
      out.write("        },\n");
      out.write("        series: [{\n");
      out.write("            name: '身份证不足18位',\n");
      out.write("            data: [5, 3, 4, 7, 2,4,5]\n");
      out.write("        }, {\n");
      out.write("            name: '姓名有乱码',\n");
      out.write("            data: [2, 2, 3, 2, 1,4,5]\n");
      out.write("        }, {\n");
      out.write("            name: '残疾证类型不对应',\n");
      out.write("            data: [3, 4, 4, 2, 5,4,5]\n");
      out.write("        }]\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $('#container4').highcharts({\n");
      out.write("        chart: {\n");
      out.write("            type: 'line'\n");
      out.write("        },\n");
      out.write("        title: {\n");
      out.write("            text: '公安部出生数据对接'\n");
      out.write("        },\n");
      out.write("        xAxis: {\n");
      out.write("            categories: ['2015-07-21', '2015-07-25', '2015-07-27', '2015-07-31', '2015-08-01', '2015-08-03', '2015-08-05']\n");
      out.write("        },\n");
      out.write("        yAxis: {\n");
      out.write("            min: 0,\n");
      out.write("            title: {\n");
      out.write("                text: '数量'\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        credits:{\n");
      out.write("        \tenabled:false\n");
      out.write("        },\n");
      out.write("        tooltip: {\n");
      out.write("            pointFormat: '<span style=\"color:{series.color}\">{series.name}</span>: <b>{point.y}<br/>',\n");
      out.write("            shared: true\n");
      out.write("        },\n");
      out.write("        series: [{\n");
      out.write("            name: '人数',\n");
      out.write("            data: [5, 3, 4, 7, 2,4,5]\n");
      out.write("        }]\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $('#container1').highcharts({\n");
      out.write("        chart: {\n");
      out.write("            plotBackgroundColor: null,\n");
      out.write("            plotBorderWidth: null,\n");
      out.write("            plotShadow: false\n");
      out.write("        },\n");
      out.write("        title: {\n");
      out.write("            text: '按年龄统计(浙江省)'\n");
      out.write("        },\n");
      out.write("        tooltip: {\n");
      out.write("    \t    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'\n");
      out.write("        },\n");
      out.write("        credits:{\n");
      out.write("        \tenabled:false\n");
      out.write("        },\n");
      out.write("        plotOptions: {\n");
      out.write("            pie: {\n");
      out.write("                allowPointSelect: true,\n");
      out.write("                cursor: 'pointer',\n");
      out.write("                dataLabels: {\n");
      out.write("                    enabled: false\n");
      out.write("                },\n");
      out.write("                showInLegend: true\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        series: [{\n");
      out.write("            type: 'pie',\n");
      out.write("            name: '百分比',\n");
      out.write("            data: [\n");
      out.write("                ['0-7岁',   15.0],\n");
      out.write("                ['8-16岁',       26.8],\n");
      out.write("                ['17-22岁',    8.5],\n");
      out.write("                ['23-50岁',     6.2],\n");
      out.write("                ['51-55岁',   17],\n");
      out.write("                ['55-60岁',   13],\n");
      out.write("                ['61-75岁',   11],\n");
      out.write("                {\n");
      out.write("                    name: '76岁以上',\n");
      out.write("                    y: 12.8,\n");
      out.write("                    sliced: false,\n");
      out.write("                    selected: false\n");
      out.write("                }\n");
      out.write("            ]\n");
      out.write("        }]\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $('#container2').highcharts({\n");
      out.write("        \n");
      out.write("\t    chart: {\n");
      out.write("\t        polar: true,\n");
      out.write("\t        type: 'line'\n");
      out.write("\t    },\n");
      out.write("\t    \n");
      out.write("\t    title: {\n");
      out.write("\t        text: '按性别和户口统计(浙江省)'\n");
      out.write("\t    },\n");
      out.write("\t    \n");
      out.write("\t    pane: {\n");
      out.write("\t    \tsize: '80%'\n");
      out.write("\t    },\n");
      out.write("\t    credits:{\n");
      out.write("        \tenabled:false\n");
      out.write("        },\n");
      out.write("\t    xAxis: {\n");
      out.write("\t        categories: ['视力残疾', '听力残疾', '言语残疾', '肢体残疾', '智力残疾', '精神残疾', '多重残疾'],\n");
      out.write("\t        tickmarkPlacement: 'on',\n");
      out.write("\t        lineWidth: 0\n");
      out.write("\t    },\n");
      out.write("\t        \n");
      out.write("\t    yAxis: {\n");
      out.write("\t        gridLineInterpolation: 'polygon',\n");
      out.write("\t        lineWidth: 0,\n");
      out.write("\t        min: 0\n");
      out.write("\t    },\n");
      out.write("\t    \n");
      out.write("\t    tooltip: {\n");
      out.write("\t    \tshared: true\n");
      out.write("\t    },\n");
      out.write("\t    series: [{\n");
      out.write("\t        name: '男',\n");
      out.write("\t        data: [400, 350, 400, 350, 400, 350],\n");
      out.write("\t        pointPlacement: 'on'\n");
      out.write("\t    }, {\n");
      out.write("\t        name: '女',\n");
      out.write("\t        data: [600, 650, 600, 650, 600, 650],\n");
      out.write("\t        pointPlacement: 'on'\n");
      out.write("\t    }, {\n");
      out.write("\t        name: '农业',\n");
      out.write("\t        data: [300, 350, 300, 350, 300, 350],\n");
      out.write("\t        pointPlacement: 'on'\n");
      out.write("\t    }, {\n");
      out.write("\t        name: '非农业',\n");
      out.write("\t        data: [700, 650, 700, 650, 700, 650],\n");
      out.write("\t        pointPlacement: 'on'\n");
      out.write("\t    }]\n");
      out.write("\t\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write(".tabl th{\n");
      out.write("\tvertical-align: middle;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbackground-color: rgb(249, 249, 249);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<div id=\"breadcrumbs\">\n");
      out.write("\t<ul class=\"breadcrumb\">\n");
      out.write("\t<li><i class=\"icon-home\"></i> <a href=\"#\">首页</a><span class=\"divider\"></span></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("<div id=\"page-content\" class=\"clearfix\" style=\"padding-left: 5px; text-align: center;\">\n");
      out.write("\t<div class=\"row-fluid\">\n");
      out.write("\t\t<div class=\"span6\">\n");
      out.write("\t\t\t<div id=\"container3\" style=\"height: 300px; margin: 0 auto\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"span6\">\n");
      out.write("\t\t\t<div id=\"container4\" style=\"height: 300px; margin: 0 auto\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row-fluid\">\n");
      out.write("\t\t<div class=\"span4\">\n");
      out.write("\t\t\t<div id=\"container\" style=\"height: 300px; margin: 0 auto\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"span4\">\n");
      out.write("\t\t\t<div id=\"container1\" style=\"height: 300px; margin: 0 auto\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"span4\">\n");
      out.write("\t\t\t<div id=\"container2\" style=\"height: 300px; margin: 0 auto\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
}
