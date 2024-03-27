<html>
<head>
  <title>Welcome Page</title>
</head>
<body>
<h2>Hello World!</h2>
  <p>Today's date is: <% out.print(new java.util.Date()); %></p>
   <h1>Registration Form</h1>
     <form action="process.jsp" method="POST">
       <label for="name">Name:</label>
       <input type="text" name="name" id="name" required><br>
       <label for="email">Email:</label>
       <input type="email" name="email" id="email" required><br>
       <input type="submit" value="Submit">
     </form>
</body>
</html>
