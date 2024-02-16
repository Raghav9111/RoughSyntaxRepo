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
}

 