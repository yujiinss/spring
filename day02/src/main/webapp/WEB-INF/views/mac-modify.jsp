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
<h3>항목 수정</h3>

<form method="POST">

<input type="hidden" name="idx" value="${dto.idx }">
<p>
<label><input type="radio" name="category"  ${dto.category == '버거' ? 'checked' :''} value="버거" required>버거</label>
<label><input type="radio" name="category"  ${dto.category == '음료' ? 'checked' :''} value="음료" required>음료</label>

</p>
<p><input type="text" name="name" placeholder="상품이름" value="${dto.name }" required></p>
<p><input type="number" name="price" placeholder="상품가격" value="${dto.price }" required></p>
<p><input type="text" name="imgname" placeholder="그림파일 이름"  value="${dto.imgname }" required></p>
<p><textarea name="memo" placeholder="상세 설명" required>${dto.memo }</textarea></p>
<p><input type="submit">
</form>
</section>

</body>
</html>