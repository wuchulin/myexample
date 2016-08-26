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
	var setting = {	
		callback: {
			onClick: onClick
		}
	};
	 
	 var zNodes ;
	 $.ajax({  
	        async : false,  
	        cache:false,  
	        type: 'POST',  
	        dataType : "json",  
	        url: "/menu/doGetMenuTree",//请求的action路径  
	        error: function () {//请求失败处理函数  
	            alert('请求失败');  
	        },  
	        success:function(data){ //请求成功后处理函数。    
	        	if(data.success) {
		            zNodes = $.parseJSON(data.message);  //把后台封装好的简单Json格式赋给treeNodes  
	        	}
	        }  
	    });  
	 
	function onClick(event, treeId, treeNode, clickFlag) {
		 $.ajax({  
		        async : false,  
		        cache:false,  
		        type: 'POST', 
		        data:{'id':treeNode.id},
		        dataType : "json",  
		        url: "/menu/doGetMenuOne",//请求的action路径  
		        error: function () {//请求失败处理函数  
		            alert('请求失败');  
		        },  
		        success:function(data) { //请求成功后处理函数。   
		        	if(data.success) {
			        	data = $.parseJSON(data.message);
				        if(data.parentId==1 || data.id==1){
				        	$('#moduleDiv').show();
					        $('#moduleId').val(data.module);
				        }else{
				        	$("#moduleId").val("");
				        	$('#moduleDiv').hide();
				        }
			        	$('#id').val(data.id);
			        	$('#name').val(data.name);
			        	$('#value').val(data.value);
			        	$("input[name='icon']").val([data.icon]);  
			        	$('#sequence').val(data.sequence);
			        	$('#description').val(data.description);
		        	}
		        }  
		    });  
	}
	 
	$(document).ready(function(){
		$.fn.zTree.init($("#treeDemo"), setting, zNodes);
	});

	function add(){
		if($('#id').val()==''){
			alert('请先选择节点！');
			return false;
		}
		var boo=true;
    	var forms = $('.form-horizontal');
    	if($(forms).find('.required').length>0){
    		$(forms).find('.required').each(function(){
    			$(this).parent().parent().removeClass("error");
    			if($(this).val()==''){
    				$(this).parent().parent().addClass("error");
    				boo=false;
    			}
    		});
    	}
    	if(!boo)
    		return false;
		form1.action="/menu/add";
		form1.submit();
	}
	
	function edit(){
		if($('#id').val()==''){
			alert('请先选择节点！');
			return false;
		}
		var boo=true;
    	var forms = $('.form-horizontal');
    	if($(forms).find('.required').length>0){
    		$(forms).find('.required').each(function(){
    			$(this).parent().parent().removeClass("error");
    			if($(this).val()==''){
    				$(this).parent().parent().addClass("error");
    				boo=false;
    			}
    		});
    	}
    	if(!boo)
    		return false;
		form1.action="/menu/edit";
		form1.submit();
	}
	
	function removeMenu(){
		if(confirm("确定删除该节点？")) {
			if($('#id').val()==1){
				alert("根节点不允许删除！");
				return false;
			}
			if($('#id').val()==''){
				alert('请先选择节点！');
				return false;
			}
			form1.action="/menu/delete";
			form1.submit();
		}
	}
</SCRIPT>
</head>
<body>
<div id="breadcrumbs">
	<ul class="breadcrumb">
	<li><i class="icon-home"></i> <a href="#">系统管理</a><span class="divider"><i class="icon-angle-right"></i></span></li>
		<li class="active">菜单管理</li>
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
						    		<label class="control-label" for="name">节点名称</label>
						    		<div class="controls">
						    			<input type="text" name="name" id="name" class="required input-medium" value="${ entity.name }" />
						    		</div>
						  		</div>
						  	</div>	
							<div class="row-fluid" id="moduleDiv">
								<div class="control-group span12">
						    		<label class="control-label" for="moduleId">所属模块</label>
						    		<div class="controls">
						    			<select name="moduleid" id="moduleid" class="input-medium">
						    				<option value="">-请选择-</option>
						    				<c:forEach items="${moduleList}" var="module" varStatus="status">
						    					<option value="${module.id}">${module.name}</option>
						    				</c:forEach>
						    			</select>
						    		</div>
						  		</div>
							</div>	
							<div class="row-fluid">
								<div class="control-group span12">
						    		<label class="control-label" for="value">路径</label>
						    		<div class="controls">
						    			<input type="text" name="value" id="value" class="input-medium" value="${ entity.value }" />
						    		</div>
						  		</div>
						  	</div>	
							<div class="row-fluid">
								<div class="control-group span12">
							    	<label class="control-label">图片</label>
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
						    			<br/>
							    		<label class="radio inline font-size">
						    				<input name="icon" type="radio" value="caiqie_16.png"/><span class="lbl"> <img src="../theme/images/caiqie_16.png"/></span>
						    			</label>
							    		<label class="radio inline font-size">
						    				<input name="icon" type="radio" value="caiqie_18.png"/><span class="lbl"> <img src="../theme/images/caiqie_18.png"/></span>
						    			</label>
							    		<label class="radio inline font-size">
						    				<input name="icon" type="radio" value="caiqie_20.png"/><span class="lbl"> <img src="../theme/images/caiqie_20.png"/></span>
						    			</label>
							    		<label class="radio inline font-size">
						    				<input name="icon" type="radio" value="caiqie_22.png"/><span class="lbl"> <img src="../theme/images/caiqie_22.png"/></span>
						    			</label>
							    		<label class="radio inline font-size">
						    				<input name="icon" type="radio" value="caiqie_24.png"/><span class="lbl"> <img src="../theme/images/caiqie_24.png"/></span>
						    			</label>
							    		<label class="radio inline font-size">
						    				<input name="icon" type="radio" value="caiqie_26.png"/><span class="lbl"> <img src="../theme/images/caiqie_26.png"/></span>
						    			</label>
							    		<label class="radio inline font-size">
						    				<input name="icon" type="radio" value="caiqie_28.png"/><span class="lbl"> <img src="../theme/images/caiqie_28.png"/></span>
						    			</label>
							    	</div>
						  		</div>
							</div>	
							<div class="row-fluid">
								<div class="control-group span12">
							    	<label class="control-label" for="nature">排序</label>
							    	<div class="controls">
							    		<input type="text" name="sequence" id="sequence" class="input-medium" value="${ entity.sequence }" />
							    	</div>
						  		</div>
						  	</div>	
							<div class="row-fluid">
								<div class="control-group span12">
							    	<label class="control-label" for="nature">描述</label>
							    	<div class="controls">
							    		<input type="text" name="description" id="description" class="input-medium" value="${ entity.description }" style="height: 60px;" />
							    	</div>
						  		</div>
							</div>	
							<div style="text-align: left;padding-left: 90px;">
								<button class="btn btn-info" type="button" onclick="add()"><i class="icon-arrow-down"></i> 保存到下级</button>
					      		<button class="btn btn-info" type="button" onclick="edit()"><i class="icon-ok"></i> 修改本级</button>
					      		<button class="btn btn-info" type="button" onclick="removeMenu()"><i class="icon-remove"></i> 删除本级</button>
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