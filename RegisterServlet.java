

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter out =response.getWriter();
	   
	   String name=request.getParameter("name");
	   String password =request.getParameter("password");
	   String gender=request.getParameter("gender");
	   String course=request.getParameter("course");
	   
	   
	   if(name==null || name.isEmpty() || password==null || password.isEmpty()) {
		   out.println("<script>alert('Error:Please fill in all Field.');</script>");
		  
	   }else {
		   out.println("<h1>Welcome to Register Servlet");
		   out.println("<h3>Name: "+name+"<h3>");
		   out.println("<h3>Gender: "+gender+"<h3>");
		   out.println("<h3>Course: "+course+"<h3>");
	   }
	   }

}
