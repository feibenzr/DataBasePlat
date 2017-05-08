<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userInfo</title>
</head>
<body>
	<table class="hovertable" width="70%" height="20%" align="center"  style="font-size:25px;" >
 	
		<tr>
			<th>序号</th>
			<th>拓展机构</th>
			<th>商户名称</th>
			<th>笔数</th>
			<th>时间</th>
		</tr>
		<c:forEach items="${list}" var="p">
			<tr onmouseover="this.style.backgroundColor='#ffff66';"
				onmouseout="this.style.backgroundColor='#d4e3e5';">
				<td>${p.id}</td>
				<td>${p.partner}</td>
				<td>${p.merchant}</td>
				<td>${p.sum}</td>
				<td>${p.nowTime}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>