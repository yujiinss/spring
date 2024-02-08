<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="header.jsp" %>

<h3>대문페이지</h3>
<details>


</details>

	<summary>작업순서</summary>
	<ol>
		<li>웹 프로그램은 [주소]-[함수]-[화면] 순서로 동작한다</li>
		<li>데이터의 형태를 결정하고, 데이터를 활용하여 CRUD기반 기능을 작성한다</li>
		<li>스프링에서는 컨트롤러 -> 서비스 -> DAO 형태의 연결이 거의 고정이므로, 미리 작성해둔다</li>
		<li>파일 업로드등, 필요한 스프링 빈이 있으면 추가로 등록한다</li>
		<li>단, 로그인 인터셉터는 기능 구현이 모두 끝난 후 마지막에 추가하여 테스트한다</li>
		<li>대문페이지에서 기능에 대한 링크(주소)가 만들어지면, 그에 대한 함수를 작성한다</li>
		<li>함수 작성이 끝나면, 그에 대한 웹페이지를 작성한다. 단, 대문페이지 및 공통페이지는 미리 작성한다</li>	
	</ol>

</body>
</html>
