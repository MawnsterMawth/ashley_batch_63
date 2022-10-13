package com.app;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentObjectWriter {
	List<Student> students = new ArrayList();
	public void writeList() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from students");
			FileOutputStream fos = new FileOutputStream(f);
		    
			while(rs.next()) {
				students.add(new Student(rs.getInt(0),rs.getString(1),rs.getString(2)));
			}
			for(int i = 0; i < students.size(); i++) {
				output.writeObject(students.get(i));
			}
			rs.close();st.close();con.close();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
