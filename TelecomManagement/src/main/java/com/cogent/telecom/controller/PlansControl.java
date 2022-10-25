package com.cogent.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.telecom.entity.Plans;
import com.cogent.telecom.repo.PlansRepo;

@RestController
public class PlansControl {
	@Autowired
	PlansRepo plansRepo;
	
	@PostMapping("/addplans")
	Plans newTelecom(@RequestBody Plans plans) {
		return plansRepo.save(plans); // insert SQL
	}
	
	@GetMapping("/getplans") // End Point
	// @RequestMapping(method=RequestMethod.GET ,value="/users")
	List<Plans> getAllEmployee() {
		return plansRepo.findAll();
	}
	
	@DeleteMapping("deleteplans/{id}")
	public void delete(@PathVariable("id") int id) {
		plansRepo.deleteById(id);
	}
}
