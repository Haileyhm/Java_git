package com.haileyhm.spring0527_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.sqlite.SQLiteConfig;

public class SelectData {

	ArrayList<Student> students = new ArrayList<Student>();
	int seoulCount = 0;
	int gyeonggiCount = 0;
	

	public void selectStudent() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (Exception e) {
			e.printStackTrace();
		}
		SQLiteConfig config = new SQLiteConfig();
		try {
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat_JavaLec\\student190527.sqlite",
					config.toProperties());
			String query = "SELECT * FROM student190527 WHERE ?;";

//			String query = "SELECT * FROM student190527 WHERE address LIKE '%서울%'";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 1);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				this.students.add(new Student(resultSet.getInt("idx"), resultSet.getString("name"),
						resultSet.getString("address"), resultSet.getString("birthday")));
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getHtmlString() {
		String htmlString = "";
		int seoul = 0;
		int gyeonggi = 0;

		for (int i = 0; i < this.students.size(); i++) {
			htmlString = htmlString + "<tr>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + this.students.get(i).idx;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + this.students.get(i).name;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + this.students.get(i).address;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + this.students.get(i).birthday;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "</tr>";

//서울 조회 만드려다 멈춤: if(this.students.get(i).address.contains("서울"){
//				
//			}
		}
		return htmlString;
	}

	public void getSeoul() {

		for (int i = 0; i < students.size(); i++) {
			String address = students.get(i).address;
			if (address.matches(".*서울.*")) {// 정규표현식 사용해서 서울이 있나 알아보는 것
				seoulCount++;
			}

		}
	}
	
	
	public void getGyeonggi() {
		for (int i = 0; i < students.size(); i++) {
			String address = students.get(i).address;
			if (address.matches(".*경기.*")) {// 정규표현식 사용해서 서울이 있나 알아보는 것
				gyeonggiCount++;
			}

		}
	}

}
