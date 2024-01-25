<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<html>
<head>
	<title>Mcdonald</title>
</head>
<body>
<h1>
	Hello Mcdonald!  
</h1>

<section class="frame">
	<div class="box">
		<c:forEach var="dto" items="${list }">
		<div class="item">
			<div class="img">
			<a href="${cpath }/mac-view/${dto.idx}">
		<img src="${cpath }/resources/image/${dto.imgname}" height="120"></a>
			</div>
			<div class="name">${dto.name }</div>
			<div class="price">${dto.price }</div>
		</div>
		</c:forEach>
	</div>
</section>

</body>
</html>
