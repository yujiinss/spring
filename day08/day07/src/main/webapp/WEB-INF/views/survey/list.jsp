<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="../header.jsp" %>


<style>
	table{
		border-collapse: collapse;
		width: 800px;
		margin : 20px auto;
	}
	td,th{
	padding: 10px;
	}
	thead > tr{
	background-color: silver;
	}
	tbody > tr{
	border-bottom : 1px solid grey;
	}
	tbody > tr:hover{
	background-color: #eee;
	}
	thead > tr> th:nth-child(1) {width: 10%;}
	thead > tr> th:nth-child(2) {width: 50%; }
	thead > tr> th:nth-child(3) {width: 10%;}
	thead > tr> th:nth-child(4) {width: 15%;}
	tbody > tr> td{
	text-align: center;
	}
	tbody > tr> td:nth-child(2){
	text-align: left;
	}


</style>


<h3>게시판</h3>

<table>
<thead>
  <tr>
    <td>번호</td>
    <td>제목</td>
    <td>작성자</td>
  </tr>
</thead>
<tbody>
<c:forEach var="dto" items="${list }">

	<tr>
	<td>${dto.idx }</td>
	<td>
    	<a href="${cpath }/survey/view/${dto.idx }">${dto.title }</a>
    </td>
    <td>${dto.writer }</td>
  
  	</tr>
</c:forEach>
</tbody>  
</table>

<div style="display: flex; width: 800px; margin: 20px auto; justify-content: space-between;">
	<div></div>
	<div>
		<a href="${cpath }/survey/write"><button>새 글 작성</button></a>
	</div>
</div>


</body>
</html>