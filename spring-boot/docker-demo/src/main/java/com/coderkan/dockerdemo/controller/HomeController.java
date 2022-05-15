package com.coderkan.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping()
	public String home() {
		return "Home Page";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!!";
	}

	@GetMapping("/hi/{name}")
	public String sayName(@PathVariable(name = "name", required = true) String name) {
		return "Hello " + name;
	}

}
