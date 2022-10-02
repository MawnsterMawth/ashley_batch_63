package com.cogent.service;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepo employeeRepo = new EmployeeRepoImpl();
	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		employeeRepo.addEmployee(employeeBean);
	}
	
	@Override
	public void viewAllEmployee(){
		employeeRepo.viewAllEmployee();
	}
	
	@Override
	public EmployeeBean findById(long employeeId) {
		return employeeRepo.findById(employeeId);
	}
	
	@Override
	public void deleteById(long employeeId) {
		employeeRepo.deleteById(employeeId);
	}
	
	@Override
	public EmployeeBean findYoungestEmployee() {
		return employeeRepo.findYoungestEmployee();
	}
	
	@Override
	public void viewFromIndia() {
		employeeRepo.viewFromIndia();
	}
	
	@Override
	public void viewFromBangalore() {
		employeeRepo.viewFromBangalore();
	}
}
