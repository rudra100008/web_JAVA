import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter out =response.getWriter();
	   
	   String name=request.getParameter("name");
	   String age =request.getParameter("age");
	   String password =request.getParameter("password");
	   String email =request.getParameter("email");
	   String gender=request.getParameter("gender");
	   String course=request.getParameter("course");
	   
	   
		String  url="jdbc:mysql://localhost:3306/form";
		String username ="name";
		String userpassword="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection(url,username,userpassword);
			String sql ="INSERT INTO Records(name,age,email,password,gender,course) VALUES(?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
            statement.setString(2, age);
            statement.setString(3, password);
            statement.setString(4, email);
            statement.setString(5, gender);
            statement.setString(6, course);
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                out.println("<h1>Registration Successful!</h1>");
            } else {
                out.println("<h1>Registration Failed!</h1>");
            }
			
		}catch (Exception e) {
			out.println("<h1> "+e.getMessage()+"</h1>");
			System.out.println(e.getMessage());
		}
	   
	  
	   if (email == null || !isValidEmail(email)) {
	        out.println("<script>alert('Error: Please enter a valid email address.');window.location.href='Form.jsp';</script>");
	    }else if(name==null || name.isEmpty() || password==null || password.isEmpty() ) {
		   out.println("<script>alert('Error:Please fill in all Field.');window.location.href='Form.jsp';</script>");
		  
	   }else {
		   out.println("<h1>Welcome to Register Servlet");
		   out.println("<h3>Name:   "+name+"<h3>");
		   out.println("<h3>Name:   "+age+"<h3>");
		   out.println("<h3>Email:  "+email+"<h3>");
		   out.println("<h3>Gender: "+gender+"<h3>");
		   out.println("<h3>Course: "+course+"<h3>");
	   }
	   }
	   
	   private boolean isValidEmail(String email) {
		    // Regular expression for basic email format validation
		    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		    return email.matches(emailRegex);
		
	   }

}
