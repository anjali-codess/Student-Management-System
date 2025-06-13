<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h2 style="color:red">Welcome to the student login portal</h2>
<form action="LoginServlet" action="Post">
<table style ="width:"50">
<tr>
<td>Username</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="password"></td>
</tr>



</table>
<input type="submit" value="submit"><input type ="reset"
value="cancel"><br><br>
<a href="register.jsp">Register page</a>

</form>

</body>
</html>