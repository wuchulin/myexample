<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="description" content="Static & Dynamic Tables" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<jsp:include page="../header.jsp" />

<link rel="stylesheet" type="text/css" href="/theme/lib/uploadify/uploadify.css">
<script src="/theme/lib/uploadify/jquery.uploadify.min.js" type="text/javascript"></script>

<script type="text/javascript">
$(function () {
    $("#uploadify").uploadify({
        //指定swf文件
        'swf': '/theme/lib/uploadify/uploadify.swf',
        //后台处理的页面
        'uploader': '/annex/upload',
        //按钮显示的文字
        'buttonText': '选择文件',
        //按钮的高度和宽度，默认 height 30；width 120
        //'height': 15,
        //'width': 80,
        //上传文件的类型  默认为所有文件    'All Files'  ;  '*.*'
        'fileTypeDesc': 'All Files',//'Image Files',
        //允许上传的文件后缀 '*.gif; *.jpg; *.png',
        'fileTypeExts': '*.*',
        //发送给后台的其他参数通过formData指定， 动态传参
        //'formData': { 'emergencyId': 1 },
        //上传文件页面中，你想要用来作为文件队列的元素的id, 默认为false  自动生成,  不带#
        //'queueID': 'fileQueue',
        //选择文件后自动上传
        'auto': true,
        //设置为true将允许多文件上传
        'multi': true,
        'onUploadSuccess': function(file, data, response) {  
            alert( file.name + ' 上传成功！ ');  
        },
        'onError': function(event, queueID, file)   
        {    
       		alert(file.name + " 上传失败");    
        },
        //onUploadStart 动态传参的关键
        //'onUploadStart': function(){
        //	$("#file_upload").uploadify("settings", "formData", {'emergencyId': $("#id").val()});
        //},
        //检测FLASH失败调用  
        'onFallback' : function() {
            alert("您未安装FLASH控件，无法上传图片！请安装FLASH控件后再试。");  
        }, 
    }); 
});
</script>
</head>
<body>

<div id="breadcrumbs">
	<ul class="breadcrumb">
	<li><i class="icon-home"></i> <a href="#">系统管理</a><span class="divider"><i class="icon-angle-right"></i></span></li>
		<li class="active">附件上传</li>
	</ul>
</div>
<div id="page-content" class="clearfix">
	<div class="row-fluid">
		<div class="row-fluid">
			<div class="control-group span1">
	    		<div class="controls">
					<input type="file" name="uploadify" id="uploadify" class="uploadify-button" />
	    		</div>
	  		</div>
	  		<form class="form-query" method="post" name="form1">
				<div class="search">
					<input type="hidden" id="pageNum" name="pageNum" value="${pageInfo.pageNum}" />
					<input type="hidden" id="numPerPage" name="numPerPage" value="${pageInfo.pageSize}" />
					<input type="hidden" name="orderField" value="${param.orderField}" />
					<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
				</div>
			</form>
			<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th class="center input-minis"><label><input type="checkbox" /><span class="lbl"></span></label></th>
						<th>序号</th>
						<th>附件显示名</th>
						<th>附件名</th>
						<th>附件地址</th>
						<th>创建时间</th>
						<th>操作</th>
					</tr>
				</thead>
				<c:forEach items="${pageInfo.list}" var="entity" varStatus="s">
					<tr>
						<td class='center'>
							<label>
								<input type='checkbox' value="${entity.id}" name="checkId" class="ckTd"/>
								<span class="lbl"></span>
							</label>
						</td>
						<td>${ s.index + 1 }</td>
						<td>${entity.displayname}</td>
						<td>${entity.filename}</td>
						<td>${entity.filepath}</td>
						<td><fmt:formatDate value="${ entity.createtime }" pattern="yyyy-MM-dd" /></td>
						<td>
							<a class="btn btn-delete btn-mini btn-danger">
								<i class="icon-trash"></i> 
								删除
							</a>
						</td>
					</tr>
				</c:forEach>
				<tr style="background:#F8F8F8;">
					<td colspan="7" style="border-bottom:none;">
						<jsp:include page="../pagination.jsp" />
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
</body>
</html>