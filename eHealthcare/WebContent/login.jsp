<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/login.css">
<title>Insert title here</title>
</head>
<body>
<img src="images/mother.jpeg" alt="homeimage"/>
<div class="loginBox">
<h1>Login</h1>
<form action="login.do" method="post">
<p>Email</p>
<input type="text" name="email" placeholder="Enter Email">
<p>Password</p>
<input type="password" name="pwd" placeholder="Enter Password">
<button type="submit" class="btn btn-primary">Submit</button>
<br/>
<a href="forget.do">Forget Password</a><br/>
</form>
<p><strong> New user?</strong></p>
<a href="registers.do"><button type="submit" class="btn btn-info">Register</button></a>

</div>
</body>
</html>