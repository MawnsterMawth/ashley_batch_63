package com.app;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PropertiesEx {
	public static void main(String[] args) {
		try (InputStream input = new FileInputStream("test.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			Class.forName(prop.getProperty("driver"));
			String url = prop.getProperty("url");
			Connection con = DriverManager.getConnection(url, prop.getProperty("uname"), prop.getProperty("pswd"));
			System.out.println("Get Connected");
			
		} catch (IOException io) {
            io.printStackTrace();
        } catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
