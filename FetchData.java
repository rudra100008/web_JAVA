package com.company.Servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
	     		ServletContext conx=getServletContext();
	     		Connection connection =(Connection)conx.getAttribute("connection");
	     		String sql="select * from admin";
	     		PreparedStatement preparedStatement=connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	     		ResultSet resultSet=preparedStatement.executeQuery();
	     		while(resultSet.next()) {
	     			out.print("<h1>"+resultSet.getString(1)+" Password: "+resultSet.getString(2)  +"</h1>");
	     		}
	     		preparedStatement.close();
	     		connection.close();
		}catch (Exception e) {
			System.err.println("ERROR:"+e.getMessage());
		}
	}

}
