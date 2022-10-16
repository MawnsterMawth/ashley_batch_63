package com.bean;

public class ProductBean {
	private int pid;
	private String pname;
	private String pcat;
	private String manufacture_date;
	private double price;
	private String expiry_date;
	
	public ProductBean() {
		super();
	}
	public ProductBean(int pid, String pname, String pcat, String manufacture_date, double price, String expiry_date) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcat = pcat;
		this.manufacture_date = manufacture_date;
		this.price = price;
		this.expiry_date = expiry_date;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcat() {
		return pcat;
	}
	public void setPcat(String pcat) {
		this.pcat = pcat;
	}
	public String getManufactureDate() {
		return manufacture_date;
	}
	public void setManufactureDate(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExpiryDate() {
		return expiry_date;
	}
	public void setExpiryDate(String expiry_date) {
		this.expiry_date = expiry_date;
	}
}
