package com.example.springDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/")
	public String helloWorld() {
		return "Hello this is to test new addition ";
	}
}
