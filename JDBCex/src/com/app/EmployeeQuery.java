package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeQuery {
	public void deleteEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("select * from employees where name=?");
			
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public String findEmployeeByID() {
		String empInfo = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("select * from employees where id=?");
			empInfo = psmt.getResultSet() + " ";
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return empInfo;
	}
	public void findEmployeeByName() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("select * from employees where name=?");
			
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void findEmployeeByEmail() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("select * from employees where name=?");
			
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}
}
