package com.cogent.spring.core.service;

import org.springframework.stereotype.Component;

@Component
public class SetterInjectedService {
	public String sayHello() {
		return "Injected using Setter Injection";
	}
}
