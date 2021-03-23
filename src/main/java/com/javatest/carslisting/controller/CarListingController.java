package com.javatest.carslisting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarListingController {

	
	@GetMapping("home")
	public String home() {
		return "index";
	}
	
	@GetMapping("car-list")
	public String cars() {
		return "cars";
	}
	
	
}
