package com.syntaxSavants.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class PatientController {
	
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

 