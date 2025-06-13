package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.connector;
import com.entity.Student;

public class Studentdao {
	public static int register(Student std) throws ClassNotFoundException, SQLException {
		
		Connection con=connector.createConnection();
		String query="insert into studenttbl values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, std.getId());
		ps.setString(2, std.getName());
		ps.setString(3, std.getUsername());
		ps.setString(4, std.getPassword());
		ps.setString(5, std.getCity());
		ps.setString(6, std.getContact());
		
		return ps.executeUpdate();
	}

}
