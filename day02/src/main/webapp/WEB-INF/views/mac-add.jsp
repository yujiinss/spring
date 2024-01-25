<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form method="POST">
<p>
<label><input type="radio" name="category" value="버거" required>버거</label>
<label><input type="radio" name="category" value="음료" required>음료</label>

</p>
<p><input type="text" name="name" placeholder="상품이름" required></p>
<p><input type="number" name="price" placeholder="상품가격" required></p>
<p><input type="text" name="imgname" placeholder="그림파일 이름" required></p>
<p><textarea name="memo" placeholder="상세 설명" required></textarea></p>
<p><input type="submit">
</form>

</body>
</html>