package com.dnyanesh.springprofiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Value("${welcome.message}")
	private String message;

	@GetMapping
	private String getMessage() {
		return message;
	}

}
