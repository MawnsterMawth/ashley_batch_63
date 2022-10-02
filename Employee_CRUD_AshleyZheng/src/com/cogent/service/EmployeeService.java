package com.cogent.service;

import java.util.List;
import com.cogent.bean.EmployeeBean;

public interface EmployeeService {
	public void addEmployee(EmployeeBean employeeBean);
	public void viewAllEmployee();
	public EmployeeBean findById(long employeeId);
	public void deleteById(long employeeId);
	public EmployeeBean findYoungestEmployee();
	public void viewFromIndia();
	public void viewFromBangalore();
}
