package com.cogent.repo;

import com.cogent.bean.CustomerBean;

public class CustomerRepo {
	private CustomerBean[] list;
	private int i;
	public CustomerRepo() {
		list = new CustomerBean[8];
		i = 0;
	}
	
	public void addCustomer(CustomerBean customerBean){
		//customerBean = new CustomerBean();
		list[i] = customerBean;
		i++;
	}
	
	public CustomerBean[] getList() {
		return list;
	}
	
	public int getIndex() {
		return i;
	}
	
	public void viewAllCustomer() {
		System.out.println("Customer Id Customer Name");
		for(int i = 0; i < list.length; i++) {
			System.out.println("    "+list[i].getCustomerId()+"      "+list[i].getCustomerName());
		}
	}
	
	public CustomerBean searchCustomerById(long id) {
		for(int i = 0; i < list.length; i++) {
			if(id == list[i].getCustomerId()) {
				return list[i];
			}
		}
		return null;
	}
}
