<%@page import="com.myexample.system.model.BaseUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<% 
	BaseUser user = (BaseUser) session.getAttribute("user"); 
%> 
<!DOCTYPE html>
<html lang="en">
<head>
<title>管理系统</title>
<meta name="description" content="overview & stats" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- basic styles -->
<link href="/theme/css/bootstrap.min.css" rel="stylesheet" />
<link href="/theme/css/bootstrap-responsive.min.css" rel="stylesheet" />
<link rel="stylesheet" href="/theme/css/font-awesome.min.css" />

<!-- ace styles -->
<link rel="stylesheet" href="/theme/css/ace.min.css" />
<link rel="stylesheet" href="/theme/css/ace-responsive.min.css" />
<link rel="stylesheet" href="/theme/css/ace-skins.min.css" />

<style type="text/css">
.footer {
    padding-top: 75px;
    height: 0;
    width: 0;
}

.footer .footer-inner {
    text-align: center;
    position: absolute;
    z-index: auto;
    left: 0;
    right: 0;
    bottom: 0;
}

.footer .footer-inner .footer-content {
    position: absolute;
    left: 200px;
    right: 12px;
    bottom: 4px;
    padding: 8px;
    line-height: 36px;
    border-top: 3px double #E5E5E5;
}

.bigger-120 {
    font-size: 120% !important;
    font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
}

.blue {
    color: #478fca !important;
}

.bolder {
    font-weight: bolder;
}
</style>
</head>

<body class="skin-3">
<div class="navbar navbar-inverse">
  <div class="navbar-inner">
   <div class="container-fluid">
	  <!-- <small><img src="" style="height: 45px"></small> -->
	  <ul class="nav ace-nav pull-right">
		<li class="purple">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">
				<i class="icon-bell-alt icon-animated-bell icon-only"></i>
				<span class="badge badge-important">4</span>
			</a>
			<ul class="pull-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-closer">
				<li class="nav-header">
					<i class="icon-warning-sign"></i>6 件待办理
				</li>
				<li>
					<a href="#" onClick="center('/loginCenter')">
						<div class="clearfix">
							<span class="pull-left"><i class="icon-flag btn btn-mini btn-success"></i> 待评定</span>
							<span class="pull-right badge badge-success">10</span>
						</div>
					</a>
				</li>
				<li>
					<a href="#" onClick="center('/loginCenter')">
						<div class="clearfix">
							<span class="pull-left"><i class="icon-key btn btn-mini btn-pink"></i> 待审核</span>
							<span class="pull-right badge badge-pink">5</span>
						</div>
					</a>
				</li>
				
				<li>
					<a href="#" onClick="center('/loginCenter')">
						<div class="clearfix">
							<span class="pull-left"><i class="icon-credit-card btn btn-mini btn-waming"></i> 待打印</span>
							<span class="pull-right badge badge-waming">8</span>
						</div>
					</a>
				</li>
				
			</ul>
		</li>
		<li class="green">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">
				<i class="icon-envelope-alt icon-animated-vertical icon-only"></i>
				<span class="badge badge-success">10</span>
			</a>
			<ul class="pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-closer">
				<li class="nav-header">
					<i class="icon-envelope"></i> 10 条公告
				</li>
				<li>
					<a href="#">
						更多
						<i class="icon-arrow-right"></i>
					</a>
				</li>									
			</ul>
		</li>
		<li class="grey">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">
				<i class="icon-tasks"></i>
				<span class="badge">4</span>
			</a>
			<ul class="pull-right dropdown-navbar dropdown-menu dropdown-caret dropdown-closer">
				<li class="nav-header">
					<i class="icon-ok"></i> 4种主题
				</li>
				<li>
					<a href="#">
						<div class="clearfix">
							<div style="background-color: #438EB9;width: 220px;height: 20px;" onclick="oj('default')"></div>
						</div>
					</a>
				</li>
				<li>
					<a href="#">
						<div class="clearfix">
							<div style="background-color: #222A2D;width: 220px;height: 20px;" onclick="oj('skin-1')"></div>
						</div>
					</a>
				</li>
				<li>
					<a href="#">
						<div class="clearfix">
							<div style="background-color: #C6487E;width: 220px;height: 20px;" onclick="oj('skin-2')"></div>
						</div>
					</a>
				</li>
				<li>
					<a href="#">
						<div class="clearfix">
							<div style="background-color: #D0D0D0;width: 220px;height: 20px;" onclick="oj('skin-3')"></div>
						</div>
					</a>
				</li>
			</ul>
		</li>
		<li class="light-blue user-profile">
			<a class="user-menu dropdown-toggle" href="#" data-toggle="dropdown">
				<span id="user_info">
					<small>Welcome</small>
					<%=user.getName() %> 
				</span>
				<i class="icon-caret-down"></i>
			</a>
			<ul id="user_menu" class="pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-closer">
				<li><a href="#myModals" data-toggle="modal"><i class="icon-cog"></i> 个人信息</a></li>
				<li><a href="#myModal" data-toggle="modal"><i class="icon-user"></i> 修改密码</a></li>
				<li class="divider"></li>
				<li><a href="#myModalout" data-toggle="modal"><i class="icon-off"></i> 退出</a></li>
			</ul>
		</li>
	  </ul><!--/.ace-nav-->
   </div><!--/.container-fluid-->
  </div><!--/.navbar-inner-->
</div><!--/.navbar-->

<div class="container-fluid" id="main-container">
	<!-- 菜单 -->
	<div id="sidebar">
		<ul class="nav nav-list">
			<li class="active">
			  <a href="#" class="one" onClick="center('/loginCenter')">
				<i class="icon-dashboard"></i>
				<span>首页</span>
			  </a>
			</li>
			<c:forEach items="${ menuList }" var="item">
				<li>
				  <a href="#" class="dropdown-toggle" >
				  	<c:choose>
				  		<c:when test="${ item.icon == '' }">
				  			<i class="icon-desktop"></i>
				  		</c:when>
				  		<c:otherwise>
				  			<i class="${ item.icon }"></i>
				  		</c:otherwise>
				  	</c:choose>
					<span>${ item.name }</span>
					<b class="arrow icon-angle-down"></b>
				  </a>
				  <ul class="submenu">
				  	<c:forEach items="${ menuMap.get(item.id) }" var="items" varStatus="status">
						<li><a href="#" onClick="center('${ items.value }')"><i class="icon-double-angle-right"></i>${ items.name }</a></li>
				  	</c:forEach>
				  </ul>
				</li>
			</c:forEach>
		</ul>
		<div id="sidebar-collapse"><i class="icon-double-angle-left"></i></div>
	</div>
	<div id="main-content" class="clearfix">
		<iframe id="centerFrame" name="centerFrame" src="loginCenter.action" width="100%;" height="700px" frameborder="0" ></iframe>
	</div>
	<div class="footer">
		<div class="footer-inner">
			<div class="footer-content">
				<span class="bigger-120">
					<span class="blue bolder">Ace</span>
					Application &copy; 2013-2014
				</span>
				<span class="action-buttons">
					<a href="#">
						<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
					</a>
					<a href="#">
						<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
					</a>
					<a href="#">
						<i class="ace-icon fa fa-rss-square orange bigger-150"></i>
					</a>
				</span>
			</div>
		</div>
	</div>
	<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
		<i class="icon-double-angle-up icon-only bigger-110"></i>
	</a>
</div>

<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">修改密码</h3>
  </div>
  <div class="modal-body" style="text-align: center;">
  	<table style="width: 100%;">
  		<tr>
  			<td style="text-align: right;width: 30%;">原密码：</td>
  			<td style="text-align: left;"><input type="text" name="ymm" id="ymm" class="input-larger" /></td>
  		</tr>
  		<tr>
  			<td style="text-align: right;width: 30%;">新密码：</td>
  			<td style="text-align: left;"><input type="text" name="xmm" id="xmm" class="input-larger" /></td>
  		</tr>
  		<tr>
  			<td style="text-align: right;width: 30%;">确认密码：</td>
  			<td style="text-align: left;"><input type="text" name="qrmm" id="qrmm" class="input-larger" /></td>
  		</tr>
  	</table>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
    <button class="btn btn-primary" onclick="sub()">保存</button>
  </div>
</div>

<div id="myModals" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">个人信息</h3>
  </div>
  <div class="modal-body" style="text-align: center;">
  	<table style="width: 100%;">
  		<tr height="30px;">
  			<td style="width: 15%;text-align: right;">姓名：</td>
  			<td style="width: 35%;border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getName() %></td>
  			<td style="width: 15%;text-align: right;">身份证：</td>
  			<td style="width: 35%;border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getIdentitycard() %></td>
  		</tr>
  		<tr height="20px;"></tr>
  		<tr height="30px;">
  			<td style="text-align: right;">性别：</td>
  			<td style="border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getGender() %></td>
  			<td style="text-align: right;">电话：</td>
  			<td style="border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getPhone() %></td>
  		</tr>
  		<tr height="20px;"></tr>
  		<tr height="30px;">
  			<td style="text-align: right;">所属职位：</td>
  			<td style="border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getJobname() %></td>
  			<td style="text-align: right;">邮箱：</td>
  			<td style="border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getEmail() %></td>
  		</tr>
  		<tr height="20px;"></tr>
  		<tr height="30px;">
  			<td style="text-align: right;">QQ：</td>
  			<td style="border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getQq() %></td>
  			<td style="text-align: right;">排序：</td>
  			<td style="border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getSequence() %></td>
  		</tr>
  		<%-- <tr height="20px;"></tr>
  		<tr height="30px;">
  			<td style="text-align: right;">所属地区：</td>
  			<td colspan="3" style="border-bottom: 1px #c5d0dc solid;font-weight: bold;"><%=user.getIdentitycard() %><s:property value="#session.loginUser.region.name"/></td>
  		</tr> --%>
  	</table>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
  </div>
</div>

<div id="myModalout" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-footer">
  	<b style="float: left;font-size: 20px;margin-top: 10px;">是否退出系统</b>
    <button class="btn" data-dismiss="modal" aria-hidden="true">否</button>
    <button class="btn btn-primary" onclick="tc()">是</button>
  </div>
</div>
<!-- <script src="/theme/1.9.1/jquery.min.js"></script> -->
<script src="/theme/js/jquery-1.9.1.min.js"></script>
<script src="/theme/js/bootstrap.min.js"></script>
<script src="/theme/js/ace.min.js"></script>
<script type="text/javascript">
function oj(b){
    var a = $(document.body);
    a.attr("class", a.hasClass("navbar-fixed") ? "navbar-fixed" : "");
    if (b != "default") {
        a.addClass(b);
    }
    if (b == "skin-1") {
        $(".ace-nav > li.grey").addClass("dark");
    } else {
        $(".ace-nav > li.grey").removeClass("dark");
    }
    if (b == "skin-2") {
        $(".ace-nav > li").addClass("no-border margin-1");
        $(".ace-nav > li:not(:last-child)").addClass("white-pink").find('> a > [class*="icon-"]').addClass("pink").end().eq(0).find(".badge").addClass("badge-warning");
    } else {
        $(".ace-nav > li").removeClass("no-border").removeClass("margin-1");
        $(".ace-nav > li:not(:last-child)").removeClass("white-pink").find('> a > [class*="icon-"]').removeClass("pink").end().eq(0).find(".badge").removeClass("badge-warning");
    }
    if (b == "skin-3") {
        $(".ace-nav > li.grey").addClass("red").find(".badge").addClass("badge-yellow");
    } else {
        $(".ace-nav > li.grey").removeClass("red").find(".badge").removeClass("badge-yellow");
    }
}

function tc(){
	location.href='/loginOut';
}
function sub(){
	if($("#ymm").val()==''){
		var str='<div class="alert alert-error">请输入原密码！</div>';
		$('#myModal').append(str);
		window.setTimeout(function(){ 
			$('.alert').slideUp();
		},2000); 
		return;
	}
	if($("#xmm").val()==''){
		var str='<div class="alert alert-error">请输入新密码！</div>';
		$('#myModal').append(str);
		window.setTimeout(function(){ 
			$('.alert').slideUp();
		},2000); 
		return;
	}
	if($("#qrmm").val()==''){
		var str='<div class="alert alert-error">请输入确认密码！</div>';
		$('#myModal').append(str);
		window.setTimeout(function(){ 
			$('.alert').slideUp();
		},2000); 
		return;
	}
	if($("#xmm").val() !=$("#qrmm").val()){
		var str='<div class="alert alert-error">两次输入的密码不一致！</div>';
		$('#myModal').append(str);
		window.setTimeout(function(){ 
			$('.alert').slideUp();
		},2000); 
		return;
	}
	
	$.ajax({
		type: "POST",
		url: "/user/editSave",
		data:{'ymm':$("#ymm").val(),'xmm':$("#xmm").val()},
		async: false,
		success: function(data){
			if(data==1){
				var str='<div class="alert alert-success">密码修改成功！</div>';
				$('#myModal').append(str);
				window.setTimeout(function(){ 
					$('.alert').slideUp();
					$('#myModal').modal('hide')
				},2000); 
			}else{
				var str='<div class="alert alert-error">原密码输入错误！</div>';
				$('#myModal').append(str);
				window.setTimeout(function(){ 
					$('.alert').slideUp();
				},2000); 
			}
		}
	});
}
</script>
</body>
</html>
