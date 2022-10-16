package com.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.bean.ProductBean;
import com.dao.ProductDao;
import com.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	ProductDao productDao = new ProductDaoImpl();
	public void addProduct(ProductBean productBean) {
		productDao.addProduct(productBean);
	}
	public void deleteProductById(int pid) {
		productDao.deleteProductById(pid);
	}
	public void deleteProductByCat(String pcat) {
		productDao.deleteProductByCat(pcat);
	}
	public ProductBean findCheapestProductInCat(String pcat) {
		return productDao.findCheapestProductInCat(pcat);
	}
	public List<ProductBean> findProductByCat(String pcat){
		return productDao.findProductByCat(pcat);
	}
	public ProductBean findProductById(int pid) {
		return productDao.findProductById(pid);
	}
	public void updateProduct(int pid, String pname, String pcat, String manufacture_date, double price, String expiry_date) {
		productDao.updateProduct(pid, pname, pcat, manufacture_date, price, expiry_date);
	}
	public List<ProductBean> findExpiredProducts(String currentDate){
		return productDao.findExpiredProducts(currentDate);
	}
	
	public static void main(String[] args) {
		ProductService productservice = new ProductServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Add Product");
		System.out.println("2. Delete Product by ID");
		System.out.println("3. Delete Product by Category");
		System.out.println("4. Find Cheapest Product by Category");
		System.out.println("5. Find Product by Category");
		System.out.println("6. Find Product by ID");
		System.out.println("7. Update Product");
		System.out.println("8. Find Expired Products");
		int choice = scanner.nextInt();
		while(choice < 9) {
			switch(choice) {
			case 1: {
				ProductBean productbean = new ProductBean();
				productservice.addProduct(productbean);
				System.out.println("Enter PID:");
				productbean.setPid(scanner.nextInt());
				System.out.println("Enter Product Name:");
				productbean.setPname(scanner.nextLine());
				System.out.println("Enter Category:");
				productbean.setPcat(scanner.nextLine());
				System.out.println("Enter Manufacturing Date:");
				productbean.setManufactureDate(scanner.nextLine());
				System.out.println("Enter Price:");
				productbean.setPrice(scanner.nextDouble());
				System.out.println("Enter Expiry Date:");
				productbean.setExpiryDate(scanner.nextLine());
				break;
			}
			case 2: {
				System.out.println("Enter PID");
				int id = scanner.nextInt();
				productservice.deleteProductById(id);
				break;
			}
			case 3: {
				System.out.println("Enter Category");
				String cat = scanner.nextLine();
				productservice.deleteProductByCat(cat);
				break;
			}
			default:{
				break;
			}
			}
		}
	}
}
