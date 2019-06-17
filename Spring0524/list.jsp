<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 조회창</title>
<style>
table {width: 100%;}
td, th {border: 1px solid #eee; text-align: center; padding: 5px 10px; }
th {background: #333; color: #fff}
a{padding: 5px; background: #ddd; color: #fff;}
</style>

</head>
<body>

	<table>
	<tr>
	<th>idx</th>
	<th>이름</th>
	<th>중간고사</th>
	<th>기말고사</th>
	</tr>
	${list_results} <!-- selectData()에서 받은 결과를 list_result변수에 넣어주는 거야 -->
	</table>
	
	<a href = "/spring0524/"> 입력화면으로 가기</a>

</body>
</html>