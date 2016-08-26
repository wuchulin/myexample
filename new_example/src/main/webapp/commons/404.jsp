<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	String pagepath = request.getContextPath();
%>
<html>
<head>
<title>出错信息提示</title>
<!-- basic styles -->
<link href="/theme/css/bootstrap.min.css" rel="stylesheet" />
<link href="/theme/css/bootstrap-responsive.min.css" rel="stylesheet" />
<link rel="stylesheet" href="/theme/css/font-awesome.min.css" />
<link rel="stylesheet" href="/theme/css/bootstrap-datetimepicker.min.css" />
<link rel="stylesheet" href="/theme/css/ace.min.css" />
<link rel="stylesheet" href="/theme/css/ace-responsive.min.css" />
<link rel="stylesheet" href="/theme/css/ace-skins.min.css" />
</head>
<body>
<div id="breadcrumbs">
	<ul class="breadcrumb">
	<li>
		<i class="icon-home"></i> 
		<a href="#">系统管理</a>
		<span class="divider">
		<i class="icon-angle-right"></i></span>
		</li>
		<li class="active">404错误</li>
	</ul>
</div>

<div id="page-content" class="clearfix">
	<div class="row-fluid">
		<div class="row-fluid">
			<div class="row">
				<div class="col-xs-12">
					<div class="error-container">
						<div class="well">
							<h1 class="grey lighter smaller">
								<span class="blue bigger-125">
									<i class="icon-sitemap"></i>
									404
								</span>
								找不到访问页面！
							</h1>
		
							<hr>
							<h3 class="lighter smaller">请联系系统管理员！</h3>
		
							<hr>
							<div class="space"></div>
						</div>
					</div><!-- PAGE CONTENT ENDS -->
				</div><!-- /.col -->
			</div><!-- /.row -->
		</div>
	</div>
</div>
</body>
</html>