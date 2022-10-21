package com.cogent.spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cogent.spring.core.service.ConstructorInjectedService;
import com.cogent.spring.core.service.FieldInjectedService;
import com.cogent.spring.core.service.SetterInjectedService;

@Component
public class DiController {
	
	@Autowired
	FieldInjectedService fieldInjectedService;
	
	SetterInjectedService setterInjectedService;
	@Autowired
	public void setSetterInjectedService(SetterInjectedService setterInjectedService) {
		this.setterInjectedService = setterInjectedService;
	}


	ConstructorInjectedService constructorInjectedService;
	public DiController(ConstructorInjectedService constructorInjectedService) {
		super();
		this.constructorInjectedService = constructorInjectedService;
	}


	public void  greet() {
		System.out.println(fieldInjectedService.sayHello());
		System.out.println(constructorInjectedService.sayHello());
		System.out.println(setterInjectedService.sayHello());
	}
	
}
