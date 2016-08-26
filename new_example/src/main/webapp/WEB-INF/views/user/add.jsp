<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

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
		<li class="active">用户编辑</li>
	</ul>
</div>
<div id="page-content" class="clearfix">
	<div class="row-fluid">
		<div class="row-fluid">
			<div class="widget-body">
				<form class="form-horizontal" method="post" name="form1" id="form1">
					<input name="id" id="id" type="hidden" value="${ entity.id }"/>
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="name">姓名</label>
				    		<div class="controls">
				    			<input type="text" name="name" id="name" class="required input-medium" value="${ entity.name }" />
				    		</div>
				  		</div>
				  		<div class="control-group span6">
				    		<label class="control-label" for="identitycard">身份证</label>
					    	<div class="controls">
					    		<input type="text" name="identitycard" id="identitycard" class="required input-medium" value="${ entity.identitycard }" />
					    	</div>
				  		</div>
				  	</div>
				  	<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="gender">性别</label>
				    		<div class="controls">
				    			<c:choose>
								    <c:when test="${ entity.gender.equals('男') }">
								    	<label class="radio inline font-size">
											<input name="gender" type="radio" value="男" checked="checked"/><span class="lbl"> 男</span>
										</label>
										 <label class="radio inline font-size">
											<input name="gender" type="radio" value="女"/><span class="lbl"> 女</span>
										</label>
								    </c:when>
								    <c:when test="${ entity.gender.equals('女') }">
								    	<label class="radio inline font-size">
											<input name="gender" type="radio" value="男"/><span class="lbl"> 男</span>
										</label>
								    	<label class="radio inline font-size">
											<input name="gender" type="radio" value="女" checked="checked"/><span class="lbl"> 女</span>
										</label>
								    </c:when>
								    <c:otherwise>
								        <label class="radio inline font-size">
											<input name="gender" type="radio" value="男"/><span class="lbl"> 男</span>
										</label>
								        <label class="radio inline font-size">
											<input name="gender" type="radio" value="女"/><span class="lbl"> 女</span>
										</label>
								    </c:otherwise>
								</c:choose>
				    		</div>
				  		</div>
						<div class="control-group span6">
				    		<label class="control-label" for="phone">电话</label>
					    	<div class="controls">
					    		<input type="text" name="phone" id="phone" class="input-medium" value="${ entity.phone }" />
					    	</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="jobName">所属职位</label>
				    		<div class="controls">
				    			<input type="text" name="jobname" id="jobname" class="input-medium" value="${ entity.jobname }" />
				    		</div>
				  		</div>
						<div class="control-group span6">
				    		<label class="control-label" for="email">邮箱</label>
					    	<div class="controls">
					    		<input type="email" name="email" id="email" class="email input-medium" value="${ entity.email }" />
					    	</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="qq">QQ</label>
				    		<div class="controls">
				    			<input type="text" name="qq" id="qq" class="input-medium" value="${ entity.qq }" />
				    		</div>
				  		</div>
						<div class="control-group span6">
				    		<label class="control-label" for="sequence">排序</label>
					    	<div class="controls">
					    		<input type="text" name="sequence" id="sequence" class="input-medium" value="${ entity.sequence }" />
					    	</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="loginId">登录名</label>
					    	<div class="controls">
					    		<input type="text" name="loginid" id="loginid" class="required input-medium" value="${ entity.loginid }" />
					    	</div>
				  		</div>
						<div class="control-group span6">
				    		<label class="control-label" for="password">密码</label>
				    		<div class="controls">
				    			<input type="text" name="password" id="password" class="required input-medium" value="${ entity.password }" />
				    		</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label" for="createtime">创建时间</label>
					    	<div class="controls">
					    		<input type="text" name="createtime" id="createtime" class="input-medium datetimepicker" value="<fmt:formatDate value="${ entity.createtime }" type="date" />" />
					    	</div>
				  		</div>
					</div>
					<div class="row-fluid">
						<div class="control-group span6">
				    		<label class="control-label">所属角色</label>
				    		<div class="controls">
				    			<c:forEach items="${ roleList }" var="role">
				    				<c:choose>
				    					<c:when test="${ roles.contains(role.id.toString()) }">
					    					<label class="checkbox inline font-size">
												<input name="roleIds" type="checkbox" value="${role.id}" checked="checked"><span class="lbl"> ${role.name}</span>
											</label>
				    					</c:when>
				    					<c:otherwise>
					    					<label class="checkbox inline font-size">
												<input name="roleIds" type="checkbox" value="${role.id}"><span class="lbl"> ${role.name}</span>
											</label>
				    					</c:otherwise>
				    				</c:choose>	
				    			</c:forEach>
				    		</div>
				  		</div>
					</div>	
					<hr />
					<div style="text-align: center;">
						<button class="btn btn-info btn-save" type="button"><i class="icon-ok"></i> 提交</button>&nbsp; &nbsp; &nbsp;
						<button class="btn" type="reset" onclick="history.go(-1)"><i class="icon-undo"></i> 返回</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>