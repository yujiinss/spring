<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<h3>게시글 작성</h3>
<form method="POST" enctype="multipart/form-data">
	<table>
		<tr>
			<td><input type="text" name="title" placeholder="제목"></td>
		</tr>

		<tr>
			<td><input type="text" name="writer" value="${login.userid }"
				readonly></td>
		</tr>

		<tr>
			<td><input type="file" name="upload1"></td>
		</tr>
		<tr>
			<td><textarea name="content1" placeholder="내용을 작성하세요"
					style="resize: none; width: 600px; height: 200px;"></textarea></td>
		</tr>

		<tr>
			<td><input type="file" name="upload2"></td>
		</tr>
		<tr>
			<td><textarea name="content2" placeholder="내용을 작성하세요"
					style="resize: none; width: 600px; height: 200px;"></textarea></td>
		</tr>
	</table>

	<input type="submit" value="작성완료">


</form>
</body>
</html>