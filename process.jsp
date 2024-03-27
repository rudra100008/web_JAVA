<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Form Processing</title>
</head>
<body>
  <h1>Form Submitted Successfully!</h1>
  <p>Here's the information you provided:</p>
  <ul>
    <li>Name: <%= request.getParameter("name") %></li>
    <li>Email: <%= request.getParameter("email") %></li>
  </ul>
  </body>
</html>
