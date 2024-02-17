package com.syntaxSavants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syntaxSavants.entities.User;
import com.syntaxSavants.services.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patService;
	
	@RequestMapping("/home")
	public String home() {
		return "Patient/patientHome";
	}
	
	@RequestMapping("/pendingRequest")
	public String request()
	{
		return "Patient/pendingRequest";
	}
	@RequestMapping("/patientid")
	public String id()
	{
		return "Patient/patientId";
	}

	@RequestMapping("/repo")
	public String repo()
	{
		Object ob = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = (User)ob;
		if(ob!=null)
		{
			patService.get(user);
		}
		return "Patient/Repo";
	}
		@RequestMapping("/report")
	public String report()
	{
		return "Patient/Reports";
	}
	
	@RequestMapping("/update")
	public String update() {
		return "Patient/update_patient";
	}

}

 