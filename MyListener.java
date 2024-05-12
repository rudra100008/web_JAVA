package com.company.Servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.DriverManager;


public class MyListener  implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		String url="jdbc:mysql://localhost:3306/employeeinfo";
		String username="root";
		String password="";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,username,password);
		
	   ServletContext servletContext=event.getServletContext();
	   servletContext.setAttribute("connection",connection);
	   
	   
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void contextDestroyed(ServletContextEvent event) {
		
	}
	

}
