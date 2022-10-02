package com.cogent.repo;
import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.EmployeeBean;

public class EmployeeRepoImpl implements EmployeeRepo {
	List<EmployeeBean> employees = new ArrayList();
	{
		employees.add(new EmployeeBean(1, "Ashley", "Zheng", "catdog@gmail.com", 21, false, "Flavortown", "Hog Country"));
		employees.add(new EmployeeBean(2, "Ben", "Dover", "embarrass@yahoo.com", 21, false, "Bangalore", "India"));
	}
	
	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		employees.add(employeeBean);
	}
	
	@Override
	public void viewAllEmployee() {
		for(int i = 0; i < employees.size(); i++) {
			EmployeeBean employee = employees.get(i);
			System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeFname()+" "+employee.getEmployeeLname()+" "+employee.getEmployeeEmail()+" "+employee.getEmployeeAge()+" "+employee.getMarryStatus()+" "+employee.getEmployeeCity()+", "+employee.getEmployeeCountry());
		}
	}
	
	@Override
	public EmployeeBean findById(long employeeId) {
		for(int i = 0; i < employees.size(); i++) {
			EmployeeBean employee = employees.get(i);
			if(employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}
	
	@Override
	public void deleteById(long employeeId) {
		for(int i = 0; i < employees.size(); i++) {
			EmployeeBean employee = employees.get(i);
			if(employee.getEmployeeId() == employeeId) {
				employees.remove(i);
			}
		}
	}
	
	@Override
	public EmployeeBean findYoungestEmployee() {
		int minimum = Integer.MAX_VALUE;
		EmployeeBean youngest = employees.get(0);
		for(int i = 0; i < employees.size(); i++) {
			EmployeeBean employee = employees.get(i);
			if(employee.getEmployeeAge() < minimum) {
				minimum = employee.getEmployeeAge();
				youngest = employee;
			}
		}
		return youngest;
	}
	
	@Override
	public void viewFromIndia() {
		for(int i = 0; i < employees.size(); i++) {
			EmployeeBean employee = employees.get(i);
			if(employee.getEmployeeCountry().equals("India"))
				System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeFname()+" "+employee.getEmployeeLname()+" "+employee.getEmployeeEmail()+" "+employee.getEmployeeAge()+" "+employee.getMarryStatus()+" "+employee.getEmployeeCity()+", "+employee.getEmployeeCountry());
		}
	}
	
	@Override
	public void viewFromBangalore() {
		for(int i = 0; i < employees.size(); i++) {
			EmployeeBean employee = employees.get(i);
			if(employee.getEmployeeCountry().equals("India") && employee.getEmployeeCity().equals("Bangalore"))
				System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeFname()+" "+employee.getEmployeeLname()+" "+employee.getEmployeeEmail()+" "+employee.getEmployeeAge()+" "+employee.getMarryStatus()+" "+employee.getEmployeeCity()+", "+employee.getEmployeeCountry());
		}
	}
}
