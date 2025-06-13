package com.servlet;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.connector.Connector;

import com.connection.connector;
import com.mysql.cj.xdevapi.Result;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

public class LoginServlet extends HttpServlet{
	private static final long serialVersion =1L;
	protected void dopost(HttpServletRequest request,ServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException {
		Connection con=connector.createConnection();
		String query="elect * from studenttbl where username=?, password=?";
		PreparedStatement ps=con.prepareStatement(query);
		String u=request.getParameter("uname");
		String p=request.getParameter("password");
		ps.setString(1, u);
		ps.setString(2, p);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		}

}
