<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>  
h3{
  font-family: TimesNewRoman; 
  font-size: 25pt;         
  font-style: normal; 
  font-weight: bold; 
  color:SlateBlue;
  text-align: center; 
  text-decoration: underline
}
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
</style> 
</head>
<body>
<h3>Register Form</h3>
<form:form action="/cli/page" method="POST" modelAttribute="user">
	UserName:<form:input type="text" path="name"/><br>
	<form:errors path="name"></form:errors><br>
	PassWord:<input type="password" name="pass1"/><br>
	Confirm PassWord:<input type="password" name="pass2"/><br>
	Age:<form:input type="number" path="age"/><br>
	Phone:<form:input path="mno"/><br>
	Address:<form:input type="text" path="address"/><br>
	City:<form:input type="text" path="city"/><br>
	image:<form:input type="file" path="img"/><br>
	<input type="submit" value="login">
</form:form>

</body>
</html>