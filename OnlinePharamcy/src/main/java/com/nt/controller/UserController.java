package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.UserLogin;

@Controller
public class UserController {
	
	@GetMapping("/User")
	public String userPage(Model model) {
		UserLogin ul=new UserLogin();
		model.addAttribute("user", ul);
		return "UserLogin";
	}

}
