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


<title>银联宁夏-数据服务</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<meta name="viewport" content="width=600">
<link rel="stylesheet" href="<%=basePath%>css/style.css" />
<link rel="stylesheet" href="<%=basePath%>css/code.css" />
<link href='http://fonts.googleapis.com/css?family=Bree+Serif'
	rel='stylesheet' type='text/css'>
<link rel="icon" type="image/png" href="<%=basePath%>images/logo.png" />

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<body>
	<div id="logo">
		<a> <img src="<%=basePath%>images/logo.png"> <span>中国银联宁夏分公司-数据服务系统</span>
		</a>
	</div>

		<style>
#toc {
	line-height: 2.5em;
	padding-left: 0;
}

#toc ul {
	padding: 0;
	width: 90%;
	margin: auto;
}

#toc li {
	list-style-type: none;
	margin-bottom: .5em;
}

#toc li a {
	display: block;
	font-size: 1.5em;
	text-align: center;
	padding: .5em;
	color: #fff;
	background-color: #DAA520;
	border: solid #B03060 1px;
	border-bottom: solid #B03060 4px;
	text-shadow: 0px 2px 0 #B03060;
	border-radius: .3em;
	position: relative;
	-webkit-transition: all 0.1s ease-out; /* Safari 3.2+, Chrome */
	-moz-transition: all 0.1s ease-out; /* Firefox 4-15 */
	-o-transition: all 0.1s ease-out; /* Opera 10.5–12.00 */
	transition: all 0.1s ease-out; /* Firefox 16+, Opera 12.50+ */
}

#toc li a:hover {
	text-decoration: none;
	background-color: #c63b6f;
}

#toc li a:active {
	border-bottom: solid #b03060 1px;
	top: 4px;
	-webkit-transition: all 0 ease-out; /* Safari 3.2+, Chrome */
	-moz-transition: all 0 ease-out; /* Firefox 4-15 */
	-o-transition: all 0 ease-out; /* Opera 10.5–12.00 */
	transition: all 0 ease-out; /* Firefox 16+, Opera 12.50+ */
}

@media screen and (min-width:601px) {
	#toc {
		-moz-column-count: 2;
		-moz-column-gap: 1em;
		-webkit-column-count: 2;
		-webkit-column-gap: 1em;
		column-count: 2;
		column-gap: 1em;
		line-height: 1.2em;
	}
}

#Footer {
	height: 90%;
	background: #F8F8FF;
	margin-top: 5px;
}
</style>
		<script
			src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.9.1.min.js"></script>
		<div id="div1">
			<ul id="toc">
					<li><a href="index1">年度指标</a></li>
					<li><a href="erweima">二维码交易</a></li>
					<li><a href="showInfo">手机NFC交易</a></li>
					<li><a href="showInfo">钱包商户</a></li>
					<li><a href="uploadfile1">数据上传</a></li>
					<li><a href="message">重要通知</a></li>
			</ul>
		</div>
	
	<div id="Footer" align="center">
		<!-- Table goes in the document BODY -->
			<marquee onmouseout=this.start() onmouseover=this.stop()
				behavior="scroll" direction="up" width="80%" height="80%"
				SCROLLDELAY="320" align="center">
				
					&nbsp;&nbsp;&nbsp;&nbsp;中国银联是经国务院同意，中国人民银行批准设立的中国银行卡联合组织，成立于2002年3月，总部设于上海。作为中国的银行卡联合组织，中国银联处于我国银行卡产业的核心和枢纽地位，对我国银行卡产业发展发挥着基础性作用，各银行通过银联跨行交易清算系统，实现了系统间的互联互通，进而使银行卡得以跨银行、跨地区和跨境使用。在建设和运营银联跨行交易清算系统、实现银行卡联网通用的基础上，中国银联积极联合商业银行等产业各方推广统一的银联卡标准规范，创建银行卡自主品牌；推动银行卡的发展和应用；维护银行卡受理市场秩序，防范银行卡风险。
					<br> <br>&nbsp;&nbsp;&nbsp;&nbsp;2009年2月16日，中国银联宁夏分公司在银川正式成立。宁夏分公司将秉承中国银联“服务、创新、责任、共赢”的理念，联合宁夏银行卡产业各方，普及银行卡应用，引导宁夏地区银行卡继续联网通用的可持续发展；加强银行卡受理市场监督，引导市场有序竞争，建立并形成行业自律机制，共同改善和维护宁夏地区银行卡受理市场环境；联合商业银行通过差异化产品和服务，推广银联品牌，扩大银联标准卡发行，满足广大群众对非现金支付工具——银行卡的使用需求；融合利益相关方的智慧和力量，合作创新，促进宁夏经济又好又快发展。&nbsp;&nbsp;&nbsp;
				
				</marquee>
			
	</div>
	<script>
		$('#div1 a').click(function() {
			$('#Footer').load(this.href);
			return false
		});
	</script>




</body>
</html>
