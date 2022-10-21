package com.cogent.spring.boot.controller;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cogent.spring.boot.entity.EmployeeEntity;
import com.cogent.spring.boot.repo.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class EmployeeController {
	@Autowired  
	EmployeeRepo employeeRepo;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/employee")  
	private List<EmployeeEntity> getAllEmployees()   
	{  
	return employeeRepo.findAll();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/employee/{EmployeeId}")  
	private EmployeeEntity getEmployees(@PathVariable("EmployeeId") int empId)   
	{  
	return EmployeeRepo.getEmployeeById(empId);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/employee/{EmployeeId}")  
	private void deleteEmployee(@PathVariable("EmployeeId") int empId)   
	{  
	employeeRepo.delete(empId);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/employees")  
	private long saveBook(@RequestBody EmployeeEntity employees)   
	{  
	employeeRepo.saveOrUpdate(employees);  
	return employees.getEmployeeId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/books")  
	private EmployeeEntity update(@RequestBody EmployeeEntity employees)   
	{  
	employeeRepo.saveOrUpdate(employees);  
	return employees;  
	}  
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public String play() {
		return "playing ball";
	}
}
