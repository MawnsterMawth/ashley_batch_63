package com.cogent.spring.core.service;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectedService {
	public String sayHello() {
		return "Injected using Field Injection";
	}
}
