<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<h3>게시글 조회</h3>

<table>

  <tr> 
   <td>작성자 : ${dto.writer }</td>
  </tr>
  
  <tr>
  	<td>
  		<pre>${dto.content1 }</pre>
  	</td>
  	<td>
  		<p>${dto.image1 }</p>
  	</td>
  </tr>
  
  <tr>
  	<td>
  		<pre>${dto.content2 }</pre>
  	</td>
  	<td>
  		<p>${dto.image2 }</p>
  	</td>
  </tr>
  
</table>

<div style="display: flex; width: 800px; margin: 20px auto; justify-content: space-between;">
	<div></div>
	<div>
		<a href="${cpath }/survey/delete/${dto.idx}"><button>삭제</button></a>
	</div>
</div>


</body>
</html>