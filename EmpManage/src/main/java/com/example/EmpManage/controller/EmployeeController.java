package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Employee;
import com.example.EmpManage.repo.EmployRepository;


@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	
	//http MEthod to creat rest API Endpoints 
	//GET
	//POST
	//PUT
	//DELETE
	
	
	//Get Operation Read  of CRUD.....
	
//	 @PostMapping("/adduser")
//	  User newUser(@RequestBody User newUser) {
//	    return userRepository.save(newUser);
//	  }
	
	
	@Autowired
    EmployRepository employRepository;
	
	
	@PostMapping("/addemployee")
	public Employee newEmployee(@RequestBody Employee employee) {
		return employRepository.save(employee); // insert SQL
	}
	
	  @GetMapping("/getemployee")   //End Point 
	 //@RequestMapping(method=RequestMethod.GET ,value="/users")
	  public List<Employee> getAllEmployee() {
	    return employRepository.findAll();
	  }
	  
	
	  @DeleteMapping("deleteemployee/{id}")
	  public void delete(@PathVariable("id") int id) {
			
		  employRepository.deleteById(id);
	  }
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public String play() {
		return "playing ball";
	}
}
