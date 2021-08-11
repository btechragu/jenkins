package com.example.jenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path = "/test")
	public String Test() {
		return "Test Message";
	}
}
