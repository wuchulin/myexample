<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理系统</title>

<link rel="stylesheet" href="/theme/css/bootstrap.min.css" type="text/css">
<script type="text/javascript" src="/theme/lib/jquery.min.js"></script>
<script type="text/javascript" src="/theme/lib/jquery.cookie.js"></script>

<script src="/theme/lib/jBox/jBox.min.js"></script>
<link href="/theme/lib/jBox/jBox.css" rel="stylesheet">
<link href="/theme/lib/jBox/themes/TooltipDark.css" rel="stylesheet">

<style type="text/css">
 body {
 	background-image: url(/theme/images/banner_slide_03.jpg);
 }

 html,body,table{
 	background-color:#f5f5f5;
 	width:100%;
 	height: 100%;
 	text-align:center;
 }
 
 .logindiv{
	 position:absolute;
	 left: 37%;
	 top: 120px;
 }
 
 .form-signin-heading{
 	font-family:Helvetica, Georgia, Arial, sans-serif, 黑体;
 	font-size:36px;
 	margin-bottom:20px;
 	color:#0663a2;
 }
 
 .form-signin{
 		position:relative;
 		text-align:left;
 		width:300px;
 		padding:25px 29px 29px;
 		margin:0 auto 20px;
 		background-color:#fff;
 		border:1px solid #e5e5e5;
   		-webkit-border-radius:5px;
   		-moz-border-radius:5px;
   		border-radius:5px;
   		-webkit-box-shadow:0 1px 2px rgba(0,0,0,.05);
   		-moz-box-shadow:0 1px 2px rgba(0,0,0,.05);
   		box-shadow:0 1px 2px rgba(0,0,0,.05);
  }
  
 .form-signin .checkbox{
 	margin-bottom:10px;
 	color:#0663a2;
 } 
 
 .form-signin .input-label{
 	font-size:16px;
 	line-height:23px;
 	color:#999;
 }
 
 .form-signin .input-block-level{
 	font-size:16px;
 	height:auto;
 	margin-bottom:15px;
 	padding:7px;
 	*width:283px;
 	*padding-bottom:0;
 	_padding:7px 7px 9px 7px;
 }
 
 .form-signin .btn.btn-large{font-size:16px;} 
 
 .form-signin #themeSwitch{position:absolute;right:15px;bottom:10px;}
 
 .form-signin div.validateCode {padding-bottom:15px;} 
 
 .mid{vertical-align:middle;}
 
 .header{height:80px;padding-top:20px;} 
 
 .alert{position:relative;width:300px;margin:0 auto;*padding-bottom:0px;}
 
 label.error{background:none;width:270px;font-weight:normal;color:inherit;margin:0;}
</style>

<script type="text/javascript">
function verifyForm(){
	if($("#loginId").val()==''){
		new jBox('Tooltip', {
			theme: 'TooltipDark',
			closeOnClick: 'body',
			closeOnEsc: true,
			animation: 'move',
			offset: {
				x: 100,
	            y: 245
			},
			content: '请输入用户名',
		}).open();
		
		return false;
	}
	if($("#password").val()==''){
		new jBox('Tooltip', {
			theme: 'TooltipDark',
			closeOnClick: 'body',
			closeOnEsc: true,
			animation: 'move',
			offset: {
				x: 107,
	            y: 320
			},
			content: '请输入密码',
		}).open();
		
		return false;
	}
	if($('#remember').is(":checked")){
		$.cookie("loginId_",$("#loginId").val(), { path: '/', expires: 10 });
		$.cookie("password_",$("#password").val(), { path: '/', expires: 10 });
	}
	return true;
}

$(function(){
	var errorstr = $('#errorstr').val();
	if(errorstr!=''){
		if(errorstr=='2') {
			new jBox('Notice', {
				color: 'red',
		        content: '用户名密码错误',
		        position: {
		        	x: 'center', 
		        	y: 'top'
		        }, 
		        pointer: 'top:20',
		        autoClose: 2000
		    });
		}
		else if(errorstr=='3') {
			new jBox('Notice', {
				color: 'red',
		        content: '用户没有权限',
		        position: {
		        	x: 'center', 
		        	y: 'top'
		        }, 
		        autoClose: 2000
		    });
		}
	}
	
	$("#loginId").val($.cookie("loginId_"));
	$("#password").val($.cookie("password_"));
});	
</script>
</head>
<body>
<div class="logindiv">
	<h1 class="form-signin-heading" style="color: white;">管理平台</h1>
	<form id="loginForm" class="form-signin" action="<c:url value='/signIn'/>" method="post" onsubmit="return verifyForm()">
		<input type="hidden" name="errorstr" id="errorstr" value="${ errorstr }" />
		<label class="input-label" for="username">用户名</label>
		<input type="text" id="loginId" name="loginId" class="input-block-level required" value="" />
		<label class="input-label" for="password">密码</label>
		<input type="password" id="password" name="password" class="input-block-level required" />
		<input class="btn btn-large btn-primary" type="submit" value="登 录"/>&nbsp;&nbsp;
		<label for="remember" title="下次不需要再登录"><input type="checkbox" id="remember" name="remember" /> 记住我（公共场所慎用）</label>
	</form>
</div>
</body>
</html>
