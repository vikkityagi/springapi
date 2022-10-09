<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show One</title>
</head>
<body>
<form method="post" action="/showone">
<input type="text" name="email" placeholder="Enter name">
<br>
<button type="submit">Check</button>
</form>
<br>
${data.eid}
${data.email}
${data.name}
</body>
</html>