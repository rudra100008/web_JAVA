<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String name=(String)request.getAttribute("name");
String email=(String)request.getAttribute("email");
%>

<label>Name:</label>
<p><%=name %></p>
<label>Email:</label>
<p><%=email %></p>


</body>
</html>