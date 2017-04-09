<%@page import="com.unionpay.nx.entity.User"%>
<%@page import="com.unionpay.nx.services.MyService"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ page import="com.unionpay.nx.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
hr {
	border-color: FF7F00;
}

div {
	float: left;
	margin: 10px;
}

div dd {
	margin: 0px;
	font-size: 10pt;
}

div dd.dd_name {
	color: blue;
}

div dd.dd_city {
	color: #000;
}
</style>
</head>

<body>
	<h1>交易详情展示</h1>
	<hr>

	<center>
		<table width="750" height="60" cellpadding="0" cellspacing="0"
			border="0">
			<tr>
				<td>
					<!-- 商品循环开始 --> 

				</td>
			</tr>
		</table>
	</center>
	

<div class="header">
    <div class='logo'>原创文字</div>
    <ul>
        <li class='first'><a href="index.jsp">首页</a></li>
        <li class='item'><a href="/v1/showInfo">原创故事</a></li>
        <li  class='item'><a href="javascript:void(0)">热门专题</li>
        <li  class='item'><a href="javascript:void(0)">欣赏美文</li>
        <li  class='item'><a href="javascript:void(0)">赞助</a></li>
    </ul>
    
    <div class='login'>
        <span><a href="login.jsp">登陆</a></span>  
        <span>|</span> 
        <span><a href="javascript:void(0)">注册</a></span>
    </div>
</div>
	
</body>
</html>
