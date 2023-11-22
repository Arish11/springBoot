package com.example.springDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/home")
	public String helloWorld() {
		return "Hello this is me";
	}
}
