
<!DOCTYPE html>
<%@page import="java.util.Enumeration"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invoice</title>
<style type="text/css">
body {
	text-align: center;
}
a{
text-decoration: none;
}
table {
color:red;
background-color:white;
	text-align: center;
	align-content: center;
	 margin-top:45px ;
    margin-left:100px ;
}
 td {
 
    max-width: 200%;
    white-space: nowrap;
  }
</style>
</head>
<body background="https://images.pexels.com/photos/6289029/pexels-photo-6289029.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1">
<h1>Invoice</h1>
<table  border="1" ><thead><tr><th>Name</th><th>Value</th></tr></thead>
<% int c=0;
Enumeration<String> em=session.getAttributeNames();
while(em.hasMoreElements()){
	String a=em.nextElement().toString();
	String b=session.getAttribute(a).toString();
	if(a.equals("shop")){}
	else{
		c=c+Integer.parseInt(b);
%>
<tbody>
<tr><td><%=a %></td><td><%=b %></td></tr>
</tbody>
<%
	}
}
%>
<tfoot><tr><td>Total</td><td><%=c %></td></tr></tfoot>
</table>
<a href="../index.html">HomePage</a>
</body>
</html>