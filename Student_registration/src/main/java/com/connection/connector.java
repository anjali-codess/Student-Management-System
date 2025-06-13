package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {
	public static Connection createConnection()throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_registration";
		String username="root";
		String password="";
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}

}
