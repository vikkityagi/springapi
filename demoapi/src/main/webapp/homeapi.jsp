<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<form method = "post" action = "/add">
<div class="form-group">
<input type="number" name="eid" placeholder="Enter Id" required class="form-control">
</div>
<div class="form-group">
<input type="email" name="email" placeholder="Enter Email" required class="form-control">
</div>
<div class="form-group">
<input type="text" name="name" placeholder="Enter Name" required class="form-control">
</div>
<br>
<button type="submit">Done</button>
</form>
</div>
</body>
</html>