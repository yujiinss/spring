<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>home.jsp</h1>
<hr>
<h3>${msg }</h3>

<ul>
	<li><a href="${cpath }/ex01">ex01</a></li>
	<li><a href="${cpath }/ex02">ex02</a></li>
	<li><a href="${cpath }/ex03">ex03-게시판</a></li>
</ul>

</body>
</html>