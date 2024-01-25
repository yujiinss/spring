<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

a {
		text-decoration: none;
		color: inherit;
	}
	a:hover {
		text-decoration: none;
	}
	.frame {
		width: 900px;
		margin: 0 auto;
		border: 1px dashed red;
	}
	header {
		display: flex;
		justify-content: space-between;
		align-items: center;
	}
	nav > ul {
		display: flex;
		width: 300px;
		list-style: none;
		padding: 0;
	}
	nav > ul > li {
		flex: 1;
	}
	
	div.box {
		display: flex;
		flex-flow: wrap;
		margin: auto;
	}
	div.item {
		box-sizing: border-box;
		width: 200px;
		margin: 10px;
		padding: 10px;
		text-align: center;
	}
	
	div.detail{
	display: flex;
	flex-flow:column;
	justify-content: center;
	align-items: center;
	text-align: center;
	}
	div.sb{
	display: flex;
	justify-content: space-between;
	align-items: center;
	}
	.table{
	border: solid 1px black;
	border-collapse: collapse;
	}
	.td,th{
	border: solid 1px black;
	}

</style>
</head>
<body>

<header class="frame">
	<h1><a href="${cpath }">맥도날드</a></h1>
	<nav>
		<ul>
			<li><a href="${cpath }/">전체</a></li>
			<li><a href="${cpath }/mac-add">추가</a></li>
			<li><a href="${cpath }/mac-delete">삭제</a></li>
		</ul>
	</nav>
</header>
