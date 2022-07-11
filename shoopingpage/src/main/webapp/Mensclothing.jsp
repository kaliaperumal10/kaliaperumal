<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>Mens Clothing</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="nextshop" value="Books">
<input type="radio" name="T-Shirt" value="450">T-Shirt
<input type="radio" name="Shorts" value="400">Shorts
<input type="radio" name="JeansPant" value="500">JeansPant
<input type="submit" value="Nextshop">
</form>
</center>
</body>
</html>