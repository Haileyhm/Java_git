package com.hailey.spring0610;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class InsertData {
	
	
public void insertStudent(Student student) {
	try {
		Class.forName("org.sqlite.JDBC");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	SQLiteConfig config = new SQLiteConfig();
	
	try {
		Connection connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat_JavaLec\\student190527.sqlite", config.toProperties());
		String query = "INSERT INTO student190527(name, address, birthday) VALUES ('"
						+ student.name + "','" + student.address + "','" + student.birthday + "')"; //따옴표에 유의해야 함. 
		
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate(query);
		statement.close();
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
}
