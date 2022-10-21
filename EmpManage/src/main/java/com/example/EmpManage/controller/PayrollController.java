package com.example.EmpManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Payroll;
import com.example.EmpManage.repo.PayrollRepo;

@RestController
@RequestMapping("api/payroll")
public class PayrollController {
	@Autowired
    PayrollRepo payrollRepo;
	
	@PostMapping("/addpayroll")
	Payroll newPayroll(@RequestBody Payroll payroll) {
		return payrollRepo.save(payroll); // insert SQL
	}
	
	
	@DeleteMapping("deletepayroll/{id}")
	public void delete(@PathVariable("id") int id) {
		
		payrollRepo.deleteById(id);
	}
}
