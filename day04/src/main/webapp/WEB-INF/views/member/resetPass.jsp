<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h3>비밀번호 재설정</h3>
	<form method="POST">
		<p><input type="text" name="userid" placeholder="ID" required autofocus></p>
		<p><input type="email" name="email" placeholder="Email" required></p>
		<p><input type="submit" value="확인"></p>
	</form>
</section>

</body>
</html>