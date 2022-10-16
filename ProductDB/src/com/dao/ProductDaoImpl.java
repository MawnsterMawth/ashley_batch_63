package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.ProductBean;

public class ProductDaoImpl implements ProductDao {
	public void addProduct(ProductBean productBean) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("insert into product values(?,?,?,?,?,?)");
			psmt.setInt(1, productBean.getPid());
			psmt.setString(2,productBean.getPname());
			psmt.setString(3,productBean.getPcat());
			psmt.setString(4,productBean.getManufactureDate());
			psmt.setDouble(5, productBean.getPrice());
			psmt.setString(6,productBean.getExpiryDate());
			int i = psmt.executeUpdate();
			System.out.println(i+" Product is added");
			psmt.close(); con.close();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void deleteProductById(int pid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("delete from product where pid=?");
			psmt.setInt(1, pid);
			int i = psmt.executeUpdate();
			System.out.println(i+" Product is deleted");
			psmt.close(); con.close();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteProductByCat(String pcat) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("delete from product where pcat=?");
			psmt.setString(1, pcat);
			int i = psmt.executeUpdate();
			System.out.println(i+" Category is deleted");
			psmt.close(); con.close();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public ProductBean findCheapestProductInCat(String pcat) {
		ProductBean productBean = new ProductBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from products where price = (select min(price) from product where pcat="+pcat+")");
			
			while(rs.next()) {
				productBean.setPid(rs.getInt(1));
				productBean.setPname(rs.getString(2));
				productBean.setPcat(rs.getString(3));
				productBean.setManufactureDate(rs.getString(4));
				productBean.setPrice(rs.getDouble(5));
				productBean.setExpiryDate(rs.getString(6));
			}
			
		}  catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return productBean;
	}
	
	public List<ProductBean> findProductByCat(String pcat) {
		List<ProductBean> products = new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from products where pcat="+pcat);
			while(rs.next()) {
				products.add(new ProductBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getString(6)));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
		
	}
	public ProductBean findProductById(int pid) {
		ProductBean productBean = new ProductBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from products where pid="+pid);
			while(rs.next()) {
				productBean.setPid(rs.getInt(1));
				productBean.setPname(rs.getString(2));
				productBean.setPcat(rs.getString(3));
				productBean.setManufactureDate(rs.getString(4));
				productBean.setPrice(rs.getDouble(5));
				productBean.setExpiryDate(rs.getString(6));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productBean;
	}
	public void updateProduct(int pid, String pname, String pcat, String manufacture_date, double price, String expiry_date) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			PreparedStatement psmt = con.prepareStatement("update student set pname=?,pcat=?,manufacture_date=?,price=?,expiry_date=? where pid=?");
			psmt.setString(1, pname);
			psmt.setString(2, pcat);
			psmt.setString(3, manufacture_date);
			psmt.setDouble(4, price);
			psmt.setString(5, expiry_date);
			psmt.setInt(6, pid);
			int i = psmt.executeUpdate();
			System.out.println(i+" Category is deleted");
			psmt.close(); con.close();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public List<ProductBean> findExpiredProducts(String currentDate) {
		List<ProductBean> products = new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "GOOPHoenix66#");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from products where expiry_date<"+currentDate);
			while(rs.next()) {
				products.add(new ProductBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getString(6)));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}
}
