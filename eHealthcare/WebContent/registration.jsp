<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/register.css">
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<img src="images/mother.jpeg" alt="homeimage"/>
<form action="register.do" method="post">
<div class="register">
 <h2><strong>Register</strong></h2>
<label>First Name : </label>
<input type="text" name="fname" placeholder="Enter Your first name"><br><br/>
<label>Last Name : </label>
<input type="text" name="lname" placeholder="Enter Your last name"><br><br/>
<label>Email : </label>
<input type="email" name="email" placeholder="Enter Your email"><br><br/>
<label>State  : </label>
<input type="text" name="state" placeholder="Enter Your state"><br><br/>
<label>City : </label>
<input type="text" name="city" placeholder="Enter Your city"><br><br/>
<label>Gender :</label>
&nbsp;&nbsp;&nbsp;
<input type="radio" name="gender" id="male">
<span id="male">Male</span>
&nbsp;&nbsp;&nbsp;
<input type="radio" name="gender" id="female">
<span id="female">Female</span><br><br/>
<label>Password : </label>
<input type="password" name="pwd1" placeholder="Enter Password"><br><br/>
<label>Confirm Password : </label>
<input type="password" name="pwd2" placeholder="Confirm Password"><br><br/>
<a href="register"><button type="submit" class="btn btn-info">Submit</button></a>
</div>
</form>
</body>
</html>