<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day07-member</title>

<style>
	header,section{
		width: 900px;
		margin: auto;
	}
</style>
</head>
<body>

<header style="width: 900px; margin:auto;">
	<h1><a href="${cpath }">day07</a></h1>
	<div id="login" style="height: 40px;">
		<c:if test="${not empty login }">
			<p>
			${login.username }님 로그인 중
			</p>
		</c:if>
	</div>
	
	<nav>
		<ul style="display:flex; padding: 0; list-style: none; justify-content: space-around;">
			<li><a href="${cpath }/member/login">로그인</a></li>
			<li><a href="${cpath }/survey/write">설문등록</a></li>	
			<li><a href="${cpath }/survey/list">설문조사</a></li>	
		</ul>
	</nav>
</header>

</body>
</html>