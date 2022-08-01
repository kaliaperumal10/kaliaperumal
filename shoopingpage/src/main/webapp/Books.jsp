<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lite red"><center>
<hr>
<h1>Book Shop</h1></center>
<hr>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="nextshop" value="Toys3">
<b>
<input type="radio" name="The Elephant Tree" value="450">The Elephant Tree<br>
<input type="radio" name="The Name Jar" value="400">The Name Jar<br>
<input type="radio" name="Warriors and Trees" value="500">Warriors and Trees<br>
</b>
<hr>
<input type="submit" value="Nextshop">
</form>

</body>
</html>