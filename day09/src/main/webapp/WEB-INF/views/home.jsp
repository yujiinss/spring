<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day09</title>
</head>
<body>

<h1>home.jsp</h1>
<hr>
<h3> 오늘은 
<fmt:formatDate value="${today }" pattern="yyyy년 MM월 dd일"/></h3>

<ul>
	<li><a href="ex01">ex01 - 예외 처리 함수 만들기</a></li>
	<li><a href="ex02">ex02 - 예외 처리 스프링 빈 만들기</a></li>
</ul>

</body>
</html>