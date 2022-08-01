<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>shop1</title>
</head>
<body>
<center>
<h1>Mens Clothing</h1></center>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="nextshop" value="Books">
<input type="radio" name="T-Shirt" value="450">T-Shirt<br>
<input type="radio" name="Shorts" value="400">Shorts<br>
<input type="radio" name="JeansPant" value="500">JeansPant<br>
<input type="submit" value="Nextshop">
</form>
</body>
</html>

