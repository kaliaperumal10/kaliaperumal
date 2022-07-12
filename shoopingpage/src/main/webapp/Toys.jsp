<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lite blue"><center>
<hr>
<h1>Toys Shop</h1></center>
<hr>

<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="nextshop" value="Toys4">

<input type="radio" name="TalkingTom" value="600">TalkingTom<br>
<input type="radio" name="Train" value="700">Train<br>
<input type="radio" name="Doll" value="500">Doll<br>


<hr>
<input type="submit" value="submit">
</form>

</body>
</html>