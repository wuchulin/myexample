<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta name="description" content="overview & stats" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- basic styles -->
<link href="/theme/css/bootstrap.min.css" rel="stylesheet" />
<link href="/theme/css/bootstrap-responsive.min.css" rel="stylesheet" />
<link rel="stylesheet" href="/theme/css/font-awesome.min.css" />
<!--[if IE 7]>
  <link rel="stylesheet" href="css/font-awesome-ie7.min.css" />
<![endif]-->
<!-- page specific plugin styles -->

<!-- ace styles -->
<link rel="stylesheet" href="/theme/css/ace.min.css" />
<link rel="stylesheet" href="/theme/css/ace-responsive.min.css" />
<link rel="stylesheet" href="/theme/css/ace-skins.min.css" />
<!--[if lt IE 9]>
  <link rel="stylesheet" href="css/ace-ie.min.css" />
<![endif]-->
<!-- <script src="/theme/1.9.1/jquery.min.js"></script> -->
<script src="/theme/js/jquery-1.9.1.min.js"></script>
<script src="/theme/lib/highcharts/js/highcharts.js"></script>
<script src="/theme/lib/highcharts/js/highcharts-more.js"></script>
</head>
<script type="text/javascript">
$(function () {
    $('#container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '按残疾类型统计(浙江省)'
        },
        xAxis: {
            categories: ['视力残疾', '听力残疾', '言语残疾', '肢体残疾', '智力残疾', '精神残疾', '多重残疾']
        },
        yAxis: {
            min: 0,
            title: {
                text: '人数'
            }
        },
        credits:{
        	enabled:false
        },
        tooltip: {
            pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}</b> ({point.percentage:.0f}%)<br/>',
            shared: true
        },
        plotOptions: {
            column: {
                stacking: 'normal'
            }
        },
            series: [{
            name: '一级',
            data: [5, 3, 4, 7, 2,4,5]
        }, {
            name: '二级',
            data: [2, 2, 3, 2, 1,4,5]
        }, {
            name: '三级',
            data: [3, 4, 4, 2, 5,4,5]
        },{
            name: '四级',
            data: [3, 4, 4, 2, 5,4,5]
        }]
    });
    
    $('#container3').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '非常规数据统计'
        },
        xAxis: {
            categories: ['杭州市', '温州市', '宁波市', '丽水市', '嘉兴市', '绍兴市', '湖州市']
        },
        yAxis: {
            min: 0,
            title: {
                text: '数量'
            }
        },
        credits:{
        	enabled:false
        },
        tooltip: {
            pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}<br/>',
            shared: true
        },
        series: [{
            name: '身份证不足18位',
            data: [5, 3, 4, 7, 2,4,5]
        }, {
            name: '姓名有乱码',
            data: [2, 2, 3, 2, 1,4,5]
        }, {
            name: '残疾证类型不对应',
            data: [3, 4, 4, 2, 5,4,5]
        }]
    });
    
    $('#container4').highcharts({
        chart: {
            type: 'line'
        },
        title: {
            text: '公安部出生数据对接'
        },
        xAxis: {
            categories: ['2015-07-21', '2015-07-25', '2015-07-27', '2015-07-31', '2015-08-01', '2015-08-03', '2015-08-05']
        },
        yAxis: {
            min: 0,
            title: {
                text: '数量'
            }
        },
        credits:{
        	enabled:false
        },
        tooltip: {
            pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}<br/>',
            shared: true
        },
        series: [{
            name: '人数',
            data: [5, 3, 4, 7, 2,4,5]
        }]
    });
    
    $('#container1').highcharts({
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false
        },
        title: {
            text: '按年龄统计(浙江省)'
        },
        tooltip: {
    	    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        credits:{
        	enabled:false
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: false
                },
                showInLegend: true
            }
        },
        series: [{
            type: 'pie',
            name: '百分比',
            data: [
                ['0-7岁',   15.0],
                ['8-16岁',       26.8],
                ['17-22岁',    8.5],
                ['23-50岁',     6.2],
                ['51-55岁',   17],
                ['55-60岁',   13],
                ['61-75岁',   11],
                {
                    name: '76岁以上',
                    y: 12.8,
                    sliced: false,
                    selected: false
                }
            ]
        }]
    });
    
    $('#container2').highcharts({
        
	    chart: {
	        polar: true,
	        type: 'line'
	    },
	    
	    title: {
	        text: '按性别和户口统计(浙江省)'
	    },
	    
	    pane: {
	    	size: '80%'
	    },
	    credits:{
        	enabled:false
        },
	    xAxis: {
	        categories: ['视力残疾', '听力残疾', '言语残疾', '肢体残疾', '智力残疾', '精神残疾', '多重残疾'],
	        tickmarkPlacement: 'on',
	        lineWidth: 0
	    },
	        
	    yAxis: {
	        gridLineInterpolation: 'polygon',
	        lineWidth: 0,
	        min: 0
	    },
	    
	    tooltip: {
	    	shared: true
	    },
	    series: [{
	        name: '男',
	        data: [400, 350, 400, 350, 400, 350],
	        pointPlacement: 'on'
	    }, {
	        name: '女',
	        data: [600, 650, 600, 650, 600, 650],
	        pointPlacement: 'on'
	    }, {
	        name: '农业',
	        data: [300, 350, 300, 350, 300, 350],
	        pointPlacement: 'on'
	    }, {
	        name: '非农业',
	        data: [700, 650, 700, 650, 700, 650],
	        pointPlacement: 'on'
	    }]
	
	});
});
</script>
<style>
.tabl th{
	vertical-align: middle;
	text-align: center;
	background-color: rgb(249, 249, 249);
}
</style>
<body>
<div id="breadcrumbs">
	<ul class="breadcrumb">
	<li><i class="icon-home"></i> <a href="#">首页</a><span class="divider"></span></li>
	</ul>
</div>
<div id="page-content" class="clearfix" style="padding-left: 5px; text-align: center;">
	<div class="row-fluid">
		<div class="span6">
			<div id="container3" style="height: 300px; margin: 0 auto"></div>
		</div>
		<div class="span6">
			<div id="container4" style="height: 300px; margin: 0 auto"></div>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span4">
			<div id="container" style="height: 300px; margin: 0 auto"></div>
		</div>
		<div class="span4">
			<div id="container1" style="height: 300px; margin: 0 auto"></div>
		</div>
		<div class="span4">
			<div id="container2" style="height: 300px; margin: 0 auto"></div>
		</div>
	</div>
</div>
</body>
</html>
