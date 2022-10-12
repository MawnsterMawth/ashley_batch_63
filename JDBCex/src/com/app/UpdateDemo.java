package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("update student set stname=? where stno=?");
			
			psmt.setString(1, "Rijo");
			psmt.setInt(2, 102);
			int i = psmt.executeUpdate();
			System.out.println(i+" Record is updated");
			psmt.close(); con.close();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
