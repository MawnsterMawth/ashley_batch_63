package com.cogent.client;

import java.util.Scanner;

import com.cogent.bean.EmployeeBean;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;

public class EmployeeCatalogue {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Add Employee");
		System.out.println("2. View All Employees");
		System.out.println("3. Search Employee by Id");
		System.out.println("4. Remove Employee by ID");
		System.out.println("5. Find Youngest Employee");
		System.out.println("6. View Employees from India");
		System.out.println("7. View Employees from Bangalore");
		System.out.println("8. Exit");
		int choice = scanner.nextInt();
		while(choice < 8) {
			switch(choice) {
			case 1 : {
				EmployeeBean employeeBean = new EmployeeBean();
				System.out.println("Enter ID");
				employeeBean.setEmployeeId(scanner.nextLong());
				System.out.println("Enter First Name");
				employeeBean.setemployeeFname(scanner.next());
				System.out.println("Enter Last Name");
				employeeBean.setEmployeeLname(scanner.next());
				System.out.println("Enter Email");
				employeeBean.setEmployeeEmail(scanner.next());
				System.out.println("Enter Age");
				employeeBean.setEmployeeAge(scanner.nextInt());
				System.out.println("Enter Marriage Status");
				employeeBean.setMarryStatus(scanner.nextBoolean());
				System.out.println("Enter City");
				employeeBean.setEmployeeCity(scanner.next());
				System.out.println("Enter Country");
				employeeBean.setEmployeeCountry(scanner.next());
				employeeService.addEmployee(employeeBean);
				break;
			}
			case 2 : {
				employeeService.viewAllEmployee();
				break;
			}
			case 3: {
				System.out.println("Enter ID");
				EmployeeBean employee = employeeService.findById(scanner.nextLong());
				if(employee != null) {
					System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeFname()+" "+employee.getEmployeeLname()+" "+employee.getEmployeeEmail()+" "+employee.getEmployeeAge()+" "+employee.getMarryStatus()+" "+employee.getEmployeeCity()+", "+employee.getEmployeeCountry());
				}
				else {
					System.out.println("Not Found");
				}
				break;
			}
			case 4: {
				System.out.println("Enter ID");
				long id = scanner.nextLong();
				if(employeeService.findById(id) != null) {
					employeeService.deleteById(id);
				}
				else {
					System.out.println("Nothing to delete");
				}
				break;
			}
			case 5: {
				EmployeeBean youngest = employeeService.findYoungestEmployee();
				System.out.println(youngest.getEmployeeId()+" "+youngest.getEmployeeFname()+" "+youngest.getEmployeeLname()+" "+youngest.getEmployeeEmail()+" "+youngest.getEmployeeAge()+" "+youngest.getMarryStatus()+" "+youngest.getEmployeeCity()+", "+youngest.getEmployeeCountry());
				break;
			}
			case 6: {
				employeeService.viewFromIndia();
				break;
			}
			case 7: {
				employeeService.viewFromBangalore();
				break;
			}
			default:{
				break;
			}
			}
			choice = scanner.nextInt();
		}
	}
}
