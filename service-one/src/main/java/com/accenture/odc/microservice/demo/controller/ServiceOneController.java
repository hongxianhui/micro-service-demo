package com.accenture.odc.microservice.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

	@RequestMapping("/getTime")
	public String getTime() {
		return "Service One Time: " + System.currentTimeMillis();
	}

}
