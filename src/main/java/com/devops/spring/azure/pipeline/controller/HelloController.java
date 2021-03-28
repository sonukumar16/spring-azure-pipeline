package com.devops.spring.azure.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String greeting() {
		return "Greeting from spring boots!";
	}
}
