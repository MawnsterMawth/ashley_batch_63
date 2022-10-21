package com.cogent.spring.core.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cogent.spring.core.config.SpringConfig;
import com.cogent.spring.core.controller.DiController;

public class Manager {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
		DiController diController= context.getBean(DiController.class);
		diController.greet();
	}
}
