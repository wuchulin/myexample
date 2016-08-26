<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!-- basic styles -->
<link href="/theme/css/bootstrap.min.css" rel="stylesheet" />
<link href="/theme/css/bootstrap-responsive.min.css" rel="stylesheet" />
<link rel="stylesheet" href="/theme/css/font-awesome.min.css" />
<link rel="stylesheet" href="/theme/css/bootstrap-datetimepicker.min.css" />
<!--[if IE 7]>
  <link rel="stylesheet" href="css/font-awesome-ie7.min.css" />
<![endif]-->
<link rel="stylesheet" href="/theme/css/ace.min.css" />
<link rel="stylesheet" href="/theme/css/ace-responsive.min.css" />
<link rel="stylesheet" href="/theme/css/ace-skins.min.css" />
<!--[if lt IE 9]>
  <link rel="stylesheet" href="css/ace-ie.min.css" />
<![endif]-->
<script src="/theme/js/jquery-1.9.1.min.js"></script>
<script src="/theme/js/bootstrap.min.js"></script>
<!-- page specific plugin scripts -->
<script type="text/javascript" src="/theme/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="/theme/js/jquery.dataTables.bootstrap.js"></script>
<!-- ace scripts -->
<script src="/theme/js/ace-elements.min.js"></script>
<script src="/theme/js/ace.min.js"></script>
<script src="/theme/js/bootstrap-datetimepicker.js"></script>
<script src="/theme/js/bootstrap-datetimepicker.zh-CN.js"></script>

<script src="/theme/lib/jquery.validate.min.js" type="text/javascript"></script>

<script src="/theme/lib/jBox/jBox.min.js"></script>
<link href="/theme/lib/jBox/jBox.css" rel="stylesheet">

<style type="text/css">
.search{
	margin-bottom: 10px;
}

input[type='text']{
	margin-bottom: 0px;
}

select{
	margin-bottom: 0px;
}

.conts{
	padding-top: 4px;
	text-align: center;
		font-weight: bold;
	font-size: 14px;
	border-bottom: 1px #c5d0dc solid;
}

.table th{
	text-align: center;
}

.table td{
	text-align: center;
}

em{
	color: red;
	margin-left: 5px;
}

.error{
	border-color: red;
	color: red;
}
</style>
		
<script type="text/javascript">
$(function() {
	
	jQuery.extend(jQuery.validator.messages, { 
		required: "必填字段", 
		remote: "请修正该字段", 
		email: "请输入正确格式的电子邮件", 
		url: "请输入合法的网址", 
		date: "请输入合法的日期", 
		dateISO: "请输入合法的日期 (ISO).", 
		number: "请输入合法的数字", 
		digits: "只能输入整数", 
		creditcard: "请输入合法的信用卡号", 
		equalTo: "请再次输入相同的值", 
		accept: "请输入拥有合法后缀名的字符串", 
		maxlength: jQuery.validator.format("请输入一个长度最多是 {0} 的字符串"), 
		minlength: jQuery.validator.format("请输入一个长度最少是 {0} 的字符串"), 
		rangelength: jQuery.validator.format("请输入一个长度介于 {0} 和 {1} 之间的字符串"), 
		range: jQuery.validator.format("请输入一个介于 {0} 和 {1} 之间的值"), 
		max: jQuery.validator.format("请输入一个最大为 {0} 的值"), 
		min: jQuery.validator.format("请输入一个最小为 {0} 的值") 
	});
	
	$('.datetimepicker').datetimepicker({
        //language:  'fr',
        weekStart: 1,
        minView: "month",
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		language: 'zh-CN', //汉化
		forceParse: 0,
		format: "yyyy-mm-dd",
        showMeridian: 1
    }); 
	
	$.parsePath = function(){
		var path = location.pathname;
		path = "/" + path.split("/")[1];
		return path;
	};
    
	$('.btn-query').click(function(){
    	$('.form-query').attr("action", $.parsePath() + "/index");
    	$('.form-query').submit();
    });
    
    $('.btn-view').click(function(){
    	var chId=$(this).parent().parent().find('.ckTd').val();
    	location.href=$.parsePath()+"/view?id="+chId;
    });
    
    $('.btn-add').click(function(){
    	location.href=$.parsePath()+"/add";
    });
    
    $('.btn-edit').click(function(){
    	var chId=$(this).parent().parent().find('.ckTd').val();
    	location.href=$.parsePath()+"/add?id="+chId;
    });
    
    $('.btn-delete').click(function(){
    	if(confirm("确认删除记录吗?")){
    		var chId=$(this).parent().parent().find('.ckTd').val(); 
    		location.href=$.parsePath()+"/delete?id="+chId;
    	}
    });
    
    $('.btn-deleteAll').click(function(){
    	var boo=true;
    	$('.ckTd').each(function(){
			if($(this).is(":checked")==true){
				boo=false;
			}
		});
		if(boo){
			alert("请选择要删除的记录！");
			return false;
		}    		
    	if(confirm("确认删除选中记录吗?")){
   			var ids='';
    		$('.ckTd').each(function(){
    			if($(this).is(":checked")==true){
    				ids+=$(this).val()+",";
    			}
    		});
    		location.href=$.parsePath()+"/deleteAll?ids="+ids;
    	}
    });
    
    $('table th input:checkbox').on('click' , function(){
		var that = this;
		$(this).closest('table').find('tr > td:first-child input:checkbox')
		.each(function(){
			this.checked = that.checked;
			$(this).closest('tr').toggleClass('selected');
		});
			
	});
    
    $('.btn-save').click(function(){
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
    	
    	if (!forms.validate().form()) return false;
    	
		var path=$.parsePath().replace("add","");
		form1.action=path+"/save";
		form1.submit();
		
		/* $.ajax({  
	        async:false,  
	        cache:false,  
	        type:'POST', 
	        dataType:"json",  
	        data:forms.serialize(),
	        url: path,//请求的action路径  
	        error: function () {//请求失败处理函数  
	            new jBox('Notice', {
					color: 'red',
			        content: '请求失败',
			        position: {
			        	x: 'center', 
			        	y: 'top'
			        }, 
			        autoClose: 2000
			    });
	        },  
	        success:function(data){ //请求成功后处理函数。  
	        	if(data.success){
	        		new jBox('Notice', {
						color: 'green',
				        content: data.message,
				        position: {
				        	x: 'center', 
				        	y: 'top'
				        }, 
				        autoClose: 1900
				    });
	        		setTimeout('location.href=$.parsePath().replace("add","") + "/index"', 2000);
	        	}else{
	        		new jBox('Notice', {
						color: 'red',
				        content: data.message,
				        position: {
				        	x: 'center', 
				        	y: 'center'
				        }, 
				        autoClose: 1900
				    });
	        	}
	        }  
	    }); */
    });

    $('.btn-empty').click(function(){
    	$('.form-query').find("input[type='text']").val("");
    	$('.form-query').find("select").val("");
    });
    
    $('.btn-download').click(function(){
    	$('.form-query').attr("action",$.parsePath()+"/download");
    	$('.form-query').submit();
    });
    
    $('.btn-upload').click(function(){
    	window.showModelessDialog("annexAnnex.action?ran="+Math.random(),window,"dialogWidth:400px;dialogHeight:300px;center:yes;status:no;scroll:no;help:no;");
    });
    
    if($('.controls-upload').length>0){
    	$('.controls-upload').find("input:hidden").each(function(){
    		var obj=$(this).parent().find('.btn-upload');
			if($(this).val()!=''){
				var strs=$(this).val().split(",");
				$.each(strs,function(i,value) {
	    			$.ajax({  
	    		        async : false,  
	    		        cache:false,  
	    		        type: 'POST', 
	    		        data:{'id':value},
	    		        dataType : "json",  
	    		        url: "annexOne.action",//请求的action路径  
	    		        error: function () {//请求失败处理函数  
	    		            alert('请求失败');  
	    		        },  
	    		        success:function(data){ //请求成功后处理函数。    
	    		        	data = eval(data);
	    		        	var ss='<span id="fj_'+data.id+'" style="vertical-align: bottom;;margin-left: 10px;">●<a href="upload'+data.filePath+'" target="_blank" style="margin-right: 5px;margin-left: 5px;">'+data.fileName+'</a>[<a style="font-size: 12px;" onclick="fjdel('+data.id+')">删除</a>]</span>';
	    		        	obj.before(ss);
	    		        }  
	    		    }); 
	            });
			}
		});
    }
});  

function fjdel(id){
	if(confirm("确认删除附件吗?")){
		$('#fj_'+id).remove();
		$('.controls-upload').find("input:hidden").each(function(){
			if($(this).val()!=''){
				var strs=$(this).val().split(",");
				var fjids='';
				$.each(strs,function(i,value) {
	    			if(value!=id)
	    				fjids=fjids+value+',';
	            });
				fjids=fjids.substring(0,fjids.length-1);
				$(this).val(fjids);
			}
		});
	}
}

function gopage(num){
	$('#pageNum').val(num);
	$('#numPerPage').val($('#perPage').val());
	$('.form-query').submit();
}
</script>