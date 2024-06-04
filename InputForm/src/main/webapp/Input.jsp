<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel=stylesheet href="Style.css">
</head>
<body>
<header>
<h3 class="title">Input Form</h3>
</header>
<div class="signup">
<form action="FormServlet" class=form-sectionn>

     <label>Name: </label>
     <input type=text name=name class=ele placeholder="Enter your name here" >
     <label>Email:</label>
     <input type=text name=email class=ele placeholder="Enter your email here">
     <label>Password:</label>
     <input type=password name=password class=ele >
     <button class=btn>Submit</button>
    
    
     <% 
 String error =request.getParameter("error");
 if(error !=null && error.equals("1")){
 %>
 <p style="color:red;">Password should be equal to greater than 8 letter</p>
 <%} %>
</form>
 </div>
</body>
</html>