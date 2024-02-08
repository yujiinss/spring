<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<form method="POST" enctype="multipart/form-data">
	<p><input type="text" name="response_id" value="${dto.writer }" readonly></p> 
	<p><input type="text" name="reply_idx" value="${dto.idx }" readonly></p> 
   <div class="left-section">
   		<p>${dto.title }</p>
       <p><img src="${cpath }/upload/${dto.image1}" height="100"></p>
        <h2>설명 :</h2>
        <p>${dto.content1 }</p>
         <label>
            <input type="radio" name="choice" value="1"> Choice 1
        </label>
         <button type="submit">제출</button>
    </div>

    <div class="right-section">
       <p><img src="${cpath }/upload/${dto.image2}" height="100"></p>
        <h2>설명 :</h2>
        <p>${dto.content2 }</p>
         <label>
            <input type="radio" name="choice" value="2"> Choice 2
        </label>
        <button type="submit">제출</button>
    </div>
    </form>
     
     
     <p> 결과 : ${dto1.count1 } : ${dto1.count2 }</p>
     <p> 비율 : ${dto2.choice1_rate } : ${dto2.choice2_rate }</p>
     
</body>
</html>