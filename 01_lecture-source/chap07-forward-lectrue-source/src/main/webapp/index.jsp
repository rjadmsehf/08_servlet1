<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1 style="text-align: center; color: #000000">Forwoard</h1>
<form action="forward" method="post">
  <label>아이디 : </label>
  <input type="text" name="userId">
  <br>
  <label>비밀번호 : </label>
  <input type="password" name="password">
  <br>
  <button type="submit">로그인</button>
</form>
</body>
</html>