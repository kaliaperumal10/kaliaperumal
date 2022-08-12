<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
background-image:url(https://www.sagatraining.ca/wp-content/uploads/2018/10/background-images-for-login-form-8.jpg);
filter: brightness(120%);

color: red;
}
.sub{
 background-color: green;
}
</style>
</head>
<center>
<h1>Welcome to Login</h1><form action="/con/forms1" method="POST">
UserName:<input type="text" name="name" required="required"/><br><br>
PassWord:<input type="text" name="pass" required="required"/><br><br>
<input class="sub" type="submit" value="Login">
<input class="sub" type="submit" value="Logout"></form>
</center>

</html>


