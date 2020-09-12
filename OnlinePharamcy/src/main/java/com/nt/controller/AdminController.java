package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.AdminLogin;

@Controller
public class AdminController {
	
	@GetMapping("/Admin")
	public String AdminPage(Model model) {
		AdminLogin ad=new AdminLogin();
		model.addAttribute("admin", ad);
		return "AdminLogin";
	}

}
