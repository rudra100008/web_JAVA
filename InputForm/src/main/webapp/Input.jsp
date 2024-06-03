<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
<h3 class="title">Input Form</h3>
</header>

<form action="FormServlet" class=form-sectionn>
<div class="signup">
     <label>Name: </label>
     <input type=text name=name class=ele placeholder="Enter your name here" >
     <label>Email:</label>
     <input type=text name=email class=ele placeholder="Enter your email here">
     <label>Password:</label>
     <input type=password name=password class=ele >
     <button class=btn>Submit</button>
     </div>
</form>
</body>
</html>