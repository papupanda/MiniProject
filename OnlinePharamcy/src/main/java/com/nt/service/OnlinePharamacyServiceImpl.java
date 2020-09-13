package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Adminloginentity;
import com.nt.model.AdminLogin;
import com.nt.repo.AdminRepo;

@Service
public class OnlinePharamacyServiceImpl implements OnlinePharamcyService {
    @Autowired
	private AdminRepo ar;
	
	@Override
	public String Login(AdminLogin al) {
		Adminloginentity ale=new Adminloginentity();
		BeanUtils.copyProperties(al, ale);
		String name=ale.getName();
		String findname = ar.findByname(name);
		if(findname!=null) {
			return "Login Sucess";
		}
		else {
			return "Login Failed";
		}
		
	}

	@Override
	public String Adminregistration(AdminLogin al) {
		Adminloginentity ale=new Adminloginentity();
		BeanUtils.copyProperties(al, ale);
		Adminloginentity save = ar.save(ale);
		if(save!=null) {
			return "Registration Sucess";
		}
		else {
			return "Registartion Failed";
		}
	}
	

	
}
