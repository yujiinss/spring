<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<section class="frame">
		<div class="detail">
			<div class="img">		
		<img src="${cpath }/resources/image/${dto.imgname}" height="120">
			</div>
			<div class="name">${dto.name }</div>
			<div class="price">${dto.price }</div>
		</div>
</section>

<div class="sb">

	<div>
		<a href="${cpath }/mac-list"><button>목록</button></a>
	</div>
	<div>
		<a href="${cpath }/mac-modify/${dto.idx}"><button>수정</button></a>
		<a href="${cpath }/mac-delete/${dto.idx}"><button>삭제</button></a>
	</div>
</div>
</body>
</html>