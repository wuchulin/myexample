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
<script type="text/javascript" src="<%=request.getContextPath()%>/theme/lib/zTree3/js/jquery.ztree.excheck-3.5.js"></script>

</head>
<SCRIPT type="text/javascript">
	var setting = {	
			check: {
				enable: true
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback:{
                onCheck:onCheck
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
	
	function onCheck(e,treeId,treeNode){
         var treeObj=$.fn.zTree.getZTreeObj("treeDemo"),
         nodes=treeObj.getCheckedNodes(true),
         v="";
         for(var i=0;i<nodes.length;i++){
         	v+=nodes[i].id + ",";
         }
         $('#menuIds').val(v);
	}
	 
	$(document).ready(function(){
		var treeObj=$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		var menuIds=$('#menuIds').val();
		if(menuIds!=''){
			menuIds=menuIds.split(",");
			for(var i=0;i<menuIds.length;i++){
				var node=treeObj.getNodeByParam("id", menuIds[i], null);
				treeObj.checkNode(node,true,false,false);
			}
		}
		var mos=''+${ modules }+'';
		mos=mos.split(',');
		for(var i=0;i<mos.length;i++){
			$("input[name='moduleIds']").each(function(){
				if($(this).val()==mos[i])
					$(this).prop("checked","checked");
			});
		}
	});
</SCRIPT>
</head>
<body>
<div id="breadcrumbs">
	<ul class="breadcrumb">
	<li><i class="icon-home"></i> <a href="#">系统管理</a><span class="divider"><i class="icon-angle-right"></i></span></li>
		<li class="active">角色编辑</li>
	</ul>
</div>
<div id="page-content" class="clearfix">
	<div class="row-fluid">
		<div class="row-fluid">
			<div class="widget-body">
				<form class="form-horizontal" method="post" name="form1">
					<input type="hidden" name="id" id="id" value="${ entity.id }">
					<input type="hidden" name="menuIds" id="menuIds" value="${ menuIds }">
					
					<div class="row-fluid">
						<div class="control-group span4">
				    		<label class="control-label" for="name">角色名</label>
				    		<div class="controls">
				    			<input type="text" name="name" id="name" class="required input-medium" value="${ entity.name }" />
				    		</div>
				  		</div>
				  		<div class="control-group span8">
				  			<label class="control-label" for="moduleIds">系统权限</label>
					    	<div class="controls">
					    		<c:forEach items="${moduleList}" var="module" varStatus="status">
			    					<label class="checkbox inline font-size">
										<input name="moduleIds" type="checkbox" value="${ module.id }"/>&nbsp;<span class="lbl">${ module.name }</span>
									</label>
			    				</c:forEach>
					    	</div>
				  		</div>
				  	</div>
				  	<div class="row-fluid">
				  		<div class="span4">
						  	<div class="row-fluid">
						  		<div class="control-group span4">
							    	<label class="control-label" for="sequence">排序</label>
							    	<div class="controls">
							    		<input type="text" name="sequence" id="sequence" class="required input-medium" value="${ entity.sequence }" />
							    	</div>
						  		</div>
							</div>
							<div class="row-fluid">
						  		<div class="control-group span4">
							    	<label class="control-label" for="description">描述</label>
							    	<div class="controls">
							    		<input type="text" name="description" id="description" value="${ entity.description }" style="height:60px;width:200px;" />
							    	</div>
						  		</div>
							</div>
						</div>
						<div class="span8">
					    	<label class="control-label" for="nature">角色权限</label>
					    	<div class="controls">
					    		<div class="zTreeDemoBackground left">
					    			<ul id="treeDemo" class="ztree"></ul>
					    		</div>
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