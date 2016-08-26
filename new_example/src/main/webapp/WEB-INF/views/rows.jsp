<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<c:set var="_rows" value="${ page.pageitems.size() }" />
<c:set var="_cols">${param.cols}</c:set>
<c:forEach begin="${ _rows }" end="${ page.pagesize-1 }">
	<tr>
		<s:iterator begin="1" end="${ _cols }">
			<td>&#160;</td>
		</s:iterator>
	</tr>
</c:forEach>