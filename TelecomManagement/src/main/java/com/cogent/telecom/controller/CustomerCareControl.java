package com.cogent.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.telecom.entity.CustomerCare;
import com.cogent.telecom.repo.CustomerCareRepo;

@RestController
public class CustomerCareControl {
	@Autowired
	CustomerCareRepo customerCareRepo;
	
	@PostMapping("/addcare")
	CustomerCare newTelecom(@RequestBody CustomerCare customerCare) {
		return customerCareRepo.save(customerCare); // insert SQL
	}
	
	@GetMapping("/getcare") // End Point
	// @RequestMapping(method=RequestMethod.GET ,value="/users")
	List<CustomerCare> getAllEmployee() {
		return customerCareRepo.findAll();
	}
	
	@DeleteMapping("deletecare/{id}")
	public void delete(@PathVariable("id") int id) {
		customerCareRepo.deleteById(id);
	}
}
