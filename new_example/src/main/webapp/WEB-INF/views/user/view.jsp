<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="description" content="Static & Dynamic Tables" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<jsp:include page="../header.jsp" />

</head>
<body>
<div id="breadcrumbs">
	<ul class="breadcrumb">
	<li><i class="icon-home"></i> <a href="#">系统管理</a><span class="divider"><i class="icon-angle-right"></i></span></li>
		<li class="active">用户详情</li>
	</ul>
</div>
<div id="page-content" class="clearfix">
	<div class="row-fluid">
		<div class="row-fluid">
			<div class="widget-body">
				<form class="form-horizontal" method="post" name="form1">
					<input name="id" id="id" type="hidden" value="${ entity.id }"/>
					
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="name">姓名：</label>
				    		<div class="controls conts">
				    			${entity.name}
				    		</div>
				  		</div>
				  		<div class="control-group span6">
				    		<label class="control-label" for="identityCard">身份证：</label>
					    	<div class="controls conts">
					    		${entity.identitycard}
					    	</div>
				  		</div>
				  	</div>
				  	<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="gender">性别：</label>
				    		<div class="controls conts">
				    			${entity.gender}
				    		</div>
				  		</div>
						<div class="control-group span6">
				    		<label class="control-label" for="phone">电话：</label>
					    	<div class="controls conts">
					    		${entity.phone}
					    	</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="jobName">所属职位：</label>
				    		<div class="controls conts">
				    			${entity.jobname}
				    		</div>
				  		</div>
						<div class="control-group span6">
				    		<label class="control-label" for="email">邮箱：</label>
					    	<div class="controls conts">
					    		${entity.email}
					    	</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="qq">QQ：</label>
				    		<div class="controls conts">
				    			${entity.qq}
				    		</div>
				  		</div>
						<div class="control-group span6">
				    		<label class="control-label" for="sequence">排序：</label>
					    	<div class="controls conts">
					    		${entity.sequence}
					    	</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="loginId">登录名：</label>
					    	<div class="controls conts">
					    		${entity.loginid}
					    	</div>
				  		</div>
						<div class="control-group span6">
				    		<label class="control-label" for="password">密码：</label>
				    		<div class="controls conts">
				    			${entity.password}
				    		</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label">所属角色：</label>
				    		<div class="controls conts">
				    			${roleNames}
				    		</div>
				  		</div>
					</div>	
					<hr />
					<div style="text-align: center;">
						<button class="btn" type="reset" onclick="history.go(-1)"><i class="icon-undo"></i> 返回</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>