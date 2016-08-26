<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="description" content="Static & Dynamic Tables" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<jsp:include page="../header.jsp" />
<SCRIPT type="text/javascript">
	$(document).ready(function(){
		var mos=${ entity.icon };
		$("input[type='radio']").each(function(){
			if($(this).val()==mos)
				$(this).prop("checked","checked");
		});
	});
</SCRIPT>
</head>
<body>
<div id="breadcrumbs">
	<ul class="breadcrumb">
	<li><i class="icon-home"></i> <a href="#">系统管理</a><span class="divider"><i class="icon-angle-right"></i></span></li>
		<li class="active">系统编辑</li>
	</ul>
</div>
<div id="page-content" class="clearfix">
	<div class="row-fluid">
		<div class="row-fluid">
			<div class="widget-body">
				<form class="form-horizontal" method="post" name="form1">
					<input type="hidden" name="id" id="id" value="${ entity.id }"/>
					<div class="row-fluid">
						<div class="control-group offset1 span11">
				    		<label class="control-label" for="name">系统名</label>
				    		<div class="controls">
				    			<input type="text" name="name" id="name" class="required" value="${ entity.name }"/>
				    		</div>
				  		</div>
				  	</div>
				  	<div class="row-fluid">
						<div class="control-group offset1 span11">
				    		<label class="control-label" for="sequence">排序</label>
				    		<div class="controls">
				    			<input type="text" name="sequence" id="sequence" value="${ entity.sequence }"/>
				    		</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group offset1 span11">
				    		<label class="control-label" for="jobName">所属职位</label>
				    		<div class="controls">
				    			<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-text-width"/><span class="lbl"> <i class="icon-text-width"></i></span>
				    			</label>
					    		<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-desktop"/><span class="lbl"> <i class="icon-desktop"></i></span>
					    		</label>
					    		<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-list"/><span class="lbl"> <i class="icon-list"></i></span>
					    		</label>
					    		<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-edit"/><span class="lbl"> <i class="icon-edit"></i></span>
					    		</label>
					    		<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-list-alt"/><span class="lbl"> <i class="icon-list-alt"></i></span>
					    		</label>
					    		<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-calendar"/><span class="lbl"> <i class="icon-calendar"></i></span>
					    		</label>
					    		<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-picture"/><span class="lbl"> <i class="icon-picture"></i></span>
					    		</label>
					    		<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-th"/><span class="lbl"> <i class="icon-th"></i></span>
					    		</label>
					    		<label class="radio inline font-size">
				    				<input name="icon" type="radio" value="icon-file"/><span class="lbl"> <i class="icon-file"></i></span>
				    			</label>
				    		</div>
				  		</div>
					</div>	
					<div class="row-fluid">
						<div class="control-group offset1 span11">
				    		<label class="control-label" for="description">描述</label>
				    		<div class="controls">
				    			<input type="text" name="description" id="description" style="height:60px;" value="${ entity.description }"/>
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