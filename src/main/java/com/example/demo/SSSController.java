package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSSController {
	
	@RequestMapping("/Hello") 
	public String sayHello() {
return "Welcome to Spring Boot";
}
}