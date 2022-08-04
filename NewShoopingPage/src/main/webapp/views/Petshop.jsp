<!DOCTYPE html>
<%@page import="com.example.demo.Dbtablecon"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet Shop</title>
<style type="text/css">
body{
text-align: center;
color: black;
}
h1,span{
color: black;
}
.sub{
 background-color: gold;
 color: white;
}
</style>
</head>
<body background="https://th.bing.com/th/id/OIP.qouhc2lz2bLmajQMiK7m5wHaEK?pid=ImgDet&rs=1" >
<h1>Pet Shop</h1>
<%! ResultSet rs ;
    Dbtablecon db ;
    public void jspInit() {
        db = new Dbtablecon();
    }
%>
<form action="/con/shop" method="post">
<span><input type="hidden" name="shop" value="Invoice">
<% rs=db.checkTable("Petshop"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/con/shopimg?shopname=Petshop&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next">
</form>
</body>
</html>