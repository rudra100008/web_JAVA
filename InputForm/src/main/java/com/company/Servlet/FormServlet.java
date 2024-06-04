package com.company.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 protected void processRequest(HttpServletRequest request, 

             HttpServletResponse response) 

throws ServletException, IOException 

{ 
       
	response.setContentType("text/html;charset=UTF-8"); 

    try (PrintWriter out = response.getWriter()) { 
      out.println("<!DOCTYPE html>"); 
      out.println("<html>"); 
      out.println("<head>"); 
      out.println("<title>Servlet StudentServlet</title>"); 
      out.println("</head>"); 
      out.println("<body>"); 
      
      String name=request.getParameter("name");
      String email=request.getParameter("email");
      String password=request.getParameter("password");
      request.setAttribute("password", password);
      request.setAttribute("name", name);
      request.setAttribute("email", email);
      if(password.length()<=8 && password!=null) {
    	  out.println("<p style=color:red; font-weigth:bold;>Password should be greater or equal to 8.</p>");
    	  response.sendRedirect("Input.jsp?error=1");
      }else {
    	  RequestDispatcher rd =request.getRequestDispatcher("Display.jsp");
          rd.forward(request, response); 

      }

      out.println("</body>"); 

      out.println("</html>"); 
      
    }
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response); 
	}
	
	 @Override
	    public String getServletInfo() 
	    { 
	        return "Short description"; 
	    } 

}
