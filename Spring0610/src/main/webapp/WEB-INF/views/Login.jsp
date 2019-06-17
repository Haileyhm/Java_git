<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="${pageContext.request.contextPath}/resources/input.css"
	rel="stylesheet" />
</head>

<body>
	<form action="/spring0610/login" method="get">
		<%-- <input type="hidden" name="idx" value="${idx}" /> --%>
		로그인 페이지
		<label>ID</label> <input type="text"  name="id" value="${id}" />
		<br>
		<label>PASSWORD</label> <input type="password" name="password" value="${password}" />
		<br>
		<input type="submit" value="입력 완료" />
		<!-- <span location.href = "/spring0610/" >회원가입</span> -->
	</form>
</body>

</html>
		