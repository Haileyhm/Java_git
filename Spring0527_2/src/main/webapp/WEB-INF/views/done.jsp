<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>학생 정보 입력 화면</title>
  <style>
    form {
      width: 100%;
      padding: 10px;
      border: 1px solid #eee;
      margin: 10px auto;
      width: 95%;
    }
    form label {
      display: inline-block;
      width: 100%;
      padding: 8px 0px 0px 10px;
      background: #eee;
      border-radius: 5px 0px;
    }
    form input {
      width: 100%;
      display: inline-block;
      margin: 0px 0px 20px 0px;
      padding: 5px 0px;
    }
    form input[type="submit"] {
      width: 50%;
      display: block;
      margin: 10px auto;
      background: #aa9999;
      color: #fff;
      border: 0px;
      padding: 10px;
    }
    a {
      padding: 10px 30px;
      display: inline-block;
      margin: 5px;
      background: #99aaaa;
      color: #fff;
      border-radius: 5px;
      text-decoration: none;
      font-weight: bold;
    }
  </style>
</head>

<body>
  <a href="/spring0527_2/">목록으로</a>
  <form action="input_data" method="get">
  <p>입력 완료되었습니다. </p>   <p>입력 완료되었습니다. </p>
  </form>
</body>
</html>