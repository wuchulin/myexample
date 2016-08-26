<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- 让360浏览器默认极速模式 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="renderer" content="webkit" />
<style>
.page{width:100%;height:100%;line-height:41px;}
.pagema{border:1px solid #CCC;width: 60px;}
.currntPage{display:inline-block;line-height:21px;padding:0 10px;margin:0 3px;font-size:12px;font-family:"瀹嬩綋";color:#14A7EC;border:1px solid #CCC;}
.pageBtn{position:relative;}
</style>
</head>
<body>
<div class="page">
	共${ pageInfo.lastPage }页，每页显示数据
	<select class="pagema" name="perPage" id="perPage" onchange="gopage(1)">
		<option value="15" <c:if test="${pageInfo.pageSize==15}">selected="selected"</c:if>>15</option>
		<option value="30" <c:if test="${pageInfo.pageSize==30}">selected="selected"</c:if>>30</option>
		<option value="50" <c:if test="${pageInfo.pageSize==50}">selected="selected"</c:if>>50</option>
		<option value="100" <c:if test="${pageInfo.pageSize==100}">selected="selected"</c:if>>100</option>
		<option value="200" <c:if test="${pageInfo.pageSize==200}">selected="selected"</c:if>>200</option>
	</select>
	<img class="pageBtn" src="/theme/images/firstBtn.jpg" onclick="gopage(1)"/>
	<c:if test="${ pageInfo.prePage !=0}">
		<img class="pageBtn" src="/theme/images/prevBtn.jpg" onclick="gopage(${ pageInfo.pageNum-1 })"/>
	</c:if>
	<c:if test="${ pageInfo.prePage ==0}">
		<img class="pageBtn" src="/theme/images/prevBtn.jpg" />
	</c:if>
	当前第<span class="currntPage">${ pageInfo.pageNum }</span>页，共${pageInfo.total}条信息
	<c:if test="${ pageInfo.nextPage !=0}">
		<img class="pageBtn" src="/theme/images/nextBtn.jpg" onclick="gopage(${ pageInfo.nextPage })"/>	
	</c:if>
	<c:if test="${ pageInfo.nextPage ==0}">
		<img class="pageBtn" src="/theme/images/nextBtn.jpg" />	
	</c:if>
	<img class="pageBtn" src="/theme/images/lastBtn.jpg" onclick="gopage(${ pageInfo.lastPage })"/>
</div>
</body>
</html>
 