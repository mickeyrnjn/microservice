package com.example.training.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsModule {
	public GreetingsModule() {
		System.out.println("Greetings Module is initialized....");
	}
	
	@GetMapping(path="/greetings/{userName}")
	public String greetUser(@PathVariable("userName") String username){
		return "Greetings " + username + "! Welcome to Spring Boot Microservices";
	}
	
}
