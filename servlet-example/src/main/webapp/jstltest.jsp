<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<c:out value="${\"hello world..hello..hello world...\"}"></c:out>
	<c:set var="num" scope="session" value="10000"/>
	<c:set var="str" scope="request" value="hello world..."/>
	
	 <%
		request.setAttribute("myname", "anound technologies...");
	
		//String str="hello world";
	%>
	
	<h1>
		<c:out value="The value is...${myname}"/>
	</h1>
	
	<h1>
		<c:out value="The value is...${num}"/>
	</h1>
	
	<h1>
		<c:out value="The value is...${str}"/>
	</h1>
	<a href="test2.jsp">Click here...</a>
	<c:url value="/test2.jsp"/>  
	
	<c:import url="http://www.google.com">
	<c:param name="title" value="Google"/>
	
</c:import>
	<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  
  
<c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>  
</c:if>


<%--	<jsp:forward page="test2.jsp"/>--%>