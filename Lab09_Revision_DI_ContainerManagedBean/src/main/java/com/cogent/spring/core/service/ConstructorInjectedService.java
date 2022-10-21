package com.cogent.spring.core.service;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedService {
	public String sayHello() {
		return "Injected using Constructor Injection";
	}
}
