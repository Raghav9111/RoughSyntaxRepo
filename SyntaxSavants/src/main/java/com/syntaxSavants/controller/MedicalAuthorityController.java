package com.syntaxSavants.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/medical")
public class MedicalAuthorityController {
	@RequestMapping("/home")
	public String home() {
		return "Medical/MedicalPatients";
	}
	
	@RequestMapping("/profile")
	public String profile()
	{
		return "Medical/MedicalProfile";
	}
	
	@RequestMapping("/viewPatient")
	public String viewPatient() {
		return "Medical/PatientRecord";
	}
	
}
