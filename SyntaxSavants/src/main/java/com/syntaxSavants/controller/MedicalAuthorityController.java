package com.syntaxSavants.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medical")
public class MedicalAuthorityController {
	@RequestMapping("/home")
	public String home() {
		return "medicalhome";
	}
}
