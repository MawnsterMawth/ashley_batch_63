package com.cogent.spring.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.cogent.spring.core.controller","com.cogent.spring.core.service"})
public class SpringConfig {

}
