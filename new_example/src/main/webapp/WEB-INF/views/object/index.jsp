<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

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
	<li><i class="icon-home"></i> <a href="#">订单管理</a><span class="divider"><i class="icon-angle-right"></i></span></li>
		<li class="active">订单管理</li>
	</ul>
</div>
<div id="page-content" class="clearfix">
	<div class="row-fluid">
		<div class="row-fluid">
			<form class="form-query" method="post" name="form1">
				<div class="search">
					<input type="hidden" id="pageNum" name="pageNum" value="${pageInfo.pageNum}" />
					<input type="hidden" id="numPerPage" name="numPerPage" value="${pageInfo.pageSize}" />
					<input type="hidden" name="orderField" value="${param.orderField}" />
					<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
					
					 名称：<input type="text" class="input-medium" name="name" value="${ queryParam.name }" />
					<a class="btn btn-small btn-inverse btn-query"><i class="icon-search icon-white"></i> 查询</a>
					<a class="btn btn-small btn-inverse btn-empty"><i class="icon-repeat icon-white"></i> 清空</a>
					<a class="btn btn-small btn-inverse btn-deleteAll"><i class="icon-trash icon-white"></i> 删除</a>
					<a class="btn btn-small btn-info pull-right btn-add"><i class="icon-plus icon-white"></i> 新建</a>
				</div>
			</form>
			<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th class="center input-minis"><label><input type="checkbox" /><span class="lbl"></span></label></th>
						<th>序号</th>
						<th>名称</th>
						<th>法人</th>
						<th>联系人</th>
						<th>联系电话</th>
						<th class="input-large">操 作</th>
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
						<td>${entity.name}</td>
						<td>${entity.legalperson}</td>
						<td>${entity.contacts}</td>
						<td>${entity.contactphone}</td>
						<td>
							<a class="btn btn-view btn-mini btn-success">
								<i class="icon-zoom-in"></i>  
								查看                                            
							</a>
							<a class="btn btn-edit btn-mini btn-info">
								<i class="icon-edit"></i>  
								修改                                            
							</a>
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