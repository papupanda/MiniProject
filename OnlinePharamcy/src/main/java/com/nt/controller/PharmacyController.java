package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PharmacyController {
	
	@GetMapping("/first")
	public String First() {
		return "First";
	}
	

}
