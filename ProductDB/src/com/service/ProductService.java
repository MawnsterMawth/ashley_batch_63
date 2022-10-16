package com.service;
import java.util.List;

import com.bean.ProductBean;

public interface ProductService {
	public void addProduct(ProductBean productBean);
	public void deleteProductById(int pid);
	public void deleteProductByCat(String pcat);
	public ProductBean findCheapestProductInCat(String pcat);
	public List<ProductBean> findProductByCat(String pcat);
	public ProductBean findProductById(int pid);
	public void updateProduct(int pid, String pname, String pcat, String manufacture_date, double price, String expiry_date);
	public List<ProductBean> findExpiredProducts(String currentDate);
}
