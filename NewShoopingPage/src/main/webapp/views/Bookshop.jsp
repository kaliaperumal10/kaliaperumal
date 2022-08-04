<%@page import="java.sql.ResultSet"%>
<%@page import="com.example.demo.Dbtablecon"%>
<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Shop</title>
<style type="text/css">
body{

text-align: center;
color: black;
}
h1,span{
color: black;
}
.sub{
 background-color: green;
}
</style>
</head>
<body background="https://images.pexels.com/photos/235985/pexels-photo-235985.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1">
<h1>Book Shop</h1>
<%! ResultSet rs ;
    Dbtablecon db ;
    public void jspInit() {
        db = new Dbtablecon();
    }
%>
<form action="/con/shop" method="post">
<input type="hidden" name="shop" value="Petshop">
<% rs=db.checkTable("Bookshop"); 
while(rs.next()){ %>
<span><input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/con/shopimg?shopname=Bookshop&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next">
</form>
</body>
</html>