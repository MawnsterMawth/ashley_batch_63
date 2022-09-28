package com.cogent.controller;
import java.util.Scanner;
import com.cogent.bean.*;
import com.cogent.repo.*;

public class CustomerManager {
	public static void main(String arg[]){
		CustomerRepo cr = new CustomerRepo();
		Scanner in = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("MANAGEMENT SYSTEM");
		System.out.println("************************************");
		System.out.println("1. Add Customer");
		System.out.println("2. View All Customer");
		System.out.println("3. Search Customer by Id");
		System.out.println("4. Exit");
		int choice = in.nextInt();
		while(choice < 4) {
			switch(choice) {
			case 1 : {
				System.out.println("User selected 1");
				String cont = "Y";
				while(cont == "Y" || cr.getIndex() < 8) {
				System.out.println("Please enter customer Id");
				Scanner cust = new Scanner(System.in);
				long id = in.nextInt();
				System.out.println("Please enter customer name");
				String name = cust.nextLine();
				CustomerBean cb = new CustomerBean(id, name);
				
				cr.addCustomer(cb);
				System.out.println("Do you want to add more Customer? Press Y or N");
				cont = in.next();
				}
				break;
			}
			case 2 : {
				System.out.println("User selected 2");
				cr.viewAllCustomer();
				break;
			}
			case 3 : {
				System.out.println("User selected 3");
				String cont = "Y";
				while(cont == "Y" || cr.getIndex() < 8) {
				System.out.println("Please enter customer Id");
				long search = in.nextInt();
				CustomerBean found = cr.searchCustomerById(search);
				if(found == null) {
					System.out.println("Not found");
				}
				else {
					System.out.println("Customer Id Customer Name");
					System.out.println("    "+found.getCustomerId()+"      "+found.getCustomerName());
				}
				System.out.println("Press Y to Search More and Press N to go to main menu");
				cont = in.next();
				}
				break;
			}
			default : {
				break;
			}
			}
		}
	}
}
