package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("insert into student values(?,?,?)");
			psmt.setInt(1, 102);
			psmt.setString(2, "Samuel");
			psmt.setString(3, "@gmail.com");
			int i = psmt.executeUpdate();
			System.out.println(i+" Record is inserted");
			psmt.close(); con.close();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
