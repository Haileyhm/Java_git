<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적입력창 만들기</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<style>
/*css는 클래스만 잡아. id 는 데이터변형시킬 때 사용하는 거니깐 */
	form {margin: 0 auto; padding: 10px; background: #eee; }

	label {display: inline-block; width: 200px; text-align: center; }

	input {display: inline-block; width: 300px;}
	
	form span {display: block; padding: 10px;}
	
	input[type = "submit"]{display: inline-block; margin: 5px 0px 0px 140px;}
</style>


<!-- <link rel = "stylesheet" type = "text/css" href="/input.css"> -->
</head>
<body>



	<form action="done222" method="get"> <!--action 한테 저거 실행해달라고 요청 // 아약스네 얘가  --> 
		<span><label> 이름 </label> <input type="text" name = "name" /></span> <!--selfclosing input 은 태그 안에서 / 로 닫았으 -->
		<span><label> 중간고사 점수</label> <input type="number" name = "middle_score"/></span>
		<span><label> 기말고사 점수 </label> <input type="number"  name = "final_score"/></span>
		<input type = "submit" value = "데이터전송"/> <!--submit 은 form 안에 작성된 정보를 action 에 연결된 서버에 전송시킴 -->
	
	</form>

</body>
</html>