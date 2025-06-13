<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
      <h2>Register Page</h2>
      <div align ="center">
      <h1 style ="color:Red">Student Management System</h1>
      <form action="registerservlet" method="post">
      <table style="width: 50"></table>
      <tr>
      <td>Student id</td>
      <td><input type="text" name="id"></td>
      </tr><br>
      
      <tr>
      <td>Student Name</td>
      <td><input type="text" name="name"></td>
      </tr><br>
      
       <tr>
      <td>Username</td>
      <td><input type="text" name="uname"></td>
      </tr><br>
   
      
      <tr>
      <td>Password</td>
      <td><input type="text" name="password"></td>
      </tr><br>
      
      <tr>
      <td>City</td>
      <td><input type="text" name="city"></td>
      </tr><br>
      
      <tr>
      <td>Contact</td>
      <td><input type="text" name="contact"></td>
      </tr>
      <br>
      
      
      <input type=submit value=submit action="registerservlet.java">
       <input type=reset value=reset>
       <br>
       <br>
       
       
       </form>
      
      
      
      </div>
</body>
</html>