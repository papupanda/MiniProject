package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.AdminLogin;
import com.nt.service.OnlinePharamcyService;

@Controller
public class AdminController {
	@Autowired
	private OnlinePharamcyService opservice;
	
	@GetMapping("/Admin")
	public String AdminfirstPage(Model model) {
		AdminLogin ad=new AdminLogin();
		model.addAttribute("admin", ad);
		return "AdminLogin";
	}
	@PostMapping("/login")
	public String LoginPage(@ModelAttribute ("admin")AdminLogin al,Model model){
      String login = opservice.Login(al);
      model.addAttribute("sucess", login);
		return "AdminPage";
	}
	@GetMapping("/FirstRegistration")
	public String FirstRegistrationPage(Model model) {
		AdminLogin al=new AdminLogin();
		model.addAttribute("registration", al);
		return "AdminRegistration";
	}
	@PostMapping("/save")
	public String SubmitRegistrationdata(@ModelAttribute("registration") AdminLogin al,Model model){
		String ar = opservice.Adminregistration(al);
		model.addAttribute("sucess", ar);
		return "AdminRegistration";
	}

}
