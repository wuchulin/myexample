<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="description" content="Static & Dynamic Tables" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<jsp:include page="../header.jsp" />

<link rel="stylesheet" href="<%=request.getContextPath()%>/theme/lib/zTree3/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/theme/lib/zTree3/js/jquery.ztree.core-3.5.js"></script>

<SCRIPT type="text/javascript">
var treeObj;

$(function(){
	var setting = {	
		callback: {
			onClick: onClick,
			onExpand:zTreeOnExpand,
			onCollapse: zTreeOnCollapse
		}
	};
	
	var zNodes ={name: "地区节点", id:1};
	
	$.fn.zTree.init($("#treeDemo"), setting, zNodes);
	
	treeObj = $.fn.zTree.getZTreeObj("treeDemo");
	var newNode = "";
	var nodes = treeObj.getNodes();
	
	$.ajax({  
        async : false,  
        cache:false,  
        data:{'id':1},
        type: 'POST',  
        dataType : "json",  
        url: "/region/doGetTreeRegion",//请求的action路径  
        error: function () {//请求失败处理函数  
            alert('请求失败');  
        },  
        success:function(data){ //请求成功后处理函数。    
        	newNode = data;   //把后台封装好的简单Json格式赋给treeNodes  
        }  
    });
	treeObj.addNodes(nodes[0], newNode);
});

	function zTreeOnExpand(event, treeId, treeNode) {
		var newNode1 = "";
	    $.ajax({  
	        async : false,  
	        cache:false,  
	        data:{'id':treeNode.id},
	        type: 'POST',  
	        dataType : "json",  
	        url: "/region/doGetTreeRegion",//请求的action路径  
	        error: function () {//请求失败处理函数  
	            alert('请求失败');  
	        },  
	        success:function(data){ //请求成功后处理函数。    
	        	newNode1 = data;   //把后台封装好的简单Json格式赋给treeNodes  
	        }  
	    });
	    treeObj.removeChildNodes(treeNode);
	    treeObj.addNodes(treeNode, newNode1);
	};
	 
	function zTreeOnCollapse(event, treeId, treeNode) {
		treeObj.removeChildNodes(treeNode);
	};
	
	function onClick(event, treeId, treeNode, clickFlag) {
		 $.ajax({  
		        async : false,  
		        cache:false,  
		        type: 'POST', 
		        data:{'id':treeNode.id},
		        dataType : "json",  
		        url: "/region/doGetOneRegion",//请求的action路径  
		        error: function () {//请求失败处理函数  
		            alert('请求失败');  
		        },  
		        success:function(data){ //请求成功后处理函数。    
		        	data = eval(data);
		        	$('#id').val(data.id);
		        	$('#name').val(data.name);
		        	$('#code').val(data.code);
		        	$('#sequence').val(data.sequence);
		        	$('#description').val(data.description);
		        }  
		    });  
	}
	 
	function add(){
		if($('#id').val()==''){
			alert('请先选择节点！');
			return false;
		}
		var forms = $('.form-horizontal');
		if (!forms.validate().form()) return false;
		
		form1.action="/region/add";
		form1.submit();
	}
	
	function edit(){
		if($('#id').val()==''){
			alert('请先选择节点！');
			return false;
		}
		var forms = $('.form-horizontal');
		if (!forms.validate().form()) return false;
		
		form1.action="/region/edit";
		form1.submit();
	}
	
	function remove(){
		if($('#id').val()==1){
			alert("根节点不允许删除！");
			return false;
		}
		if($('#id').val()==''){
			alert('请先选择节点！');
			return false;
		}
		form1.action="/region/delete";
		form1.submit();
	}
</SCRIPT>
</head>
<body>
<div id="breadcrumbs">
	<ul class="breadcrumb">
	<li><i class="icon-home"></i> <a href="#">系统管理</a><span class="divider"><i class="icon-angle-right"></i></span></li>
		<li class="active">地区管理</li>
	</ul>
</div>
<div id="page-content" class="clearfix">
	<div class="row-fluid">
		<div class="row-fluid">
			<div class="widget-body">
				<form class="form-horizontal" method="post" name="form1">
					<input name="id" id="id" type="hidden" value="${ entity.id }"/>
					
					<div class="row-fluid">
						<div class="span3">
							<div style="height: 500px;overflow-y: auto; OVERFLOW-X:hidden;">
								<ul id="treeDemo" class="ztree"></ul>
							</div>
						</div>
						<div class="span9">
							<div class="row-fluid">
								<div class="control-group span12">
						    		<label class="control-label" for="name">地区名称</label>
						    		<div class="controls">
						    			<input type="text" name="name" id="name" class="required" />
						    		</div>
						  		</div>
						  	</div>	
						  	<div class="row-fluid">
								<div class="control-group span12">
						    		<label class="control-label" for="code">地区编码</label>
						    		<div class="controls">
						    			<input type="text" name="code" id="code" class="required" />
						    		</div>
						  		</div>
						  	</div>	
							<div class="row-fluid">
								<div class="control-group span6">
							    	<label class="control-label" for="sequence">排序</label>
							    	<div class="controls">
							    		<input type="text" name="sequence" id="sequence" />
							    	</div>
						  		</div>
							</div>	
							<div class="row-fluid">
								<div class="control-group span6">
							    	<label class="control-label" for="description">描述</label>
							    	<div class="controls">
							    		<input type="text" name="description" id="description" style="height:60px;" />
							    	</div>
						  		</div>
						  	</div>
							<div style="text-align: left;padding-left: 90px;">
								<button class="btn btn-info" type="button" onclick="add()"><i class="icon-arrow-down"></i> 保存到下级</button>
					      		<button class="btn btn-info" type="button" onclick="edit()"><i class="icon-ok"></i> 修改本级</button>
					      		<button class="btn btn-info" type="button" onclick="remove()"><i class="icon-remove"></i> 删除本级</button>
							</div>	
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>