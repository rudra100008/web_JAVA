<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Page</title>
<style>
.container {
  width: 50%;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  background-color: #f9f9f9;
  font-size:20px;
}

h1 {
  text-align: center;
}

label {
  display: block;
  margin-bottom: 5px;
}

input[type="text"],
input[type="password"],
select {
  width: 100%;
  padding: 8px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

input[type="radio"] {
  margin-right: 5px;
}

input[type="submit"],
input[type="reset"] {
  padding: 10px 20px;
  background-color: #4CAF50;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type="submit"]:hover,
input[type="reset"]:hover {
  background-color: #45a049;
}
</style>
</head>
<body>
 <div class="container">
 <h1>Form</h1>
 <form action="RegisterServlet" method="post">
 <label>Enter your name:</label>
 <input type="text" id="name" name="name" placeholder="Enter here">
 <br>
 <label>Enter your Password:</label>
 <input type="password" id="password" name="password" placeholder="Enter here"><br>
 <label>Enter your Email:</label>
 <input type="text" id="email" name="email" placeholder="Enter email like example@gmail.com">
 <br>
 <label>Select Gender:</label>
 <input type="radio" name="gender" value="male">Male 
 <input type="radio" name="gender" value="female">Female
 <br>
 <label>Enter your Age:</label>

 <input type="text" name=age>
 <br>
 <label>Choose your Course:</label>
 <select name="course"> 
 <option value="BEIT">BEIT</option> 
 <option value="Civil">Civil</option>
 <option value="Computer">Computer</option>
 <option value="Electronic">ELectronic</option>
 </select>
 <br>
 <input type="submit" value="Submit">
 <input type="reset" value="Reset">
 </form>
</div>
</body>
</html>
