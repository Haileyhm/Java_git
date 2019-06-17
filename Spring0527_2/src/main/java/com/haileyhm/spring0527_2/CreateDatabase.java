package com.haileyhm.spring0527_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class CreateDatabase {
	public void createTable() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		SQLiteConfig config = new SQLiteConfig();
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat_JavaLec\\student.sqlite", config.toProperties());
			String query = "CREATE TABLE student0527(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, address TEXT, birthday TEXT);";
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
