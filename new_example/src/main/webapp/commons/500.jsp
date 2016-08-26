<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@   page isErrorPage="true"%>
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
	<div class="row-fluid">
		<div class="row-fluid">
			<div class="row">
				<div class="col-xs-12">
					<div class="error-container">
						<div class="well">
							<h1 class="grey lighter smaller">
								<span class="blue bigger-125">
									<i class="icon-sitemap"></i>
									500
								</span>
							</h1>
		
							<hr>
							<%=exception.toString()%>
		
							<hr>
							<div class="space"></div>
						</div>
					</div><!-- PAGE CONTENT ENDS -->
				</div><!-- /.col -->
			</div><!-- /.row -->
		</div>
	</div>
</body>
</html>
