package com.syntaxSavants.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/admin")
public class AdminController 
{
	
	
	@RequestMapping(value = "/home")	
	public String home() 
	{
		return "home";
	}
	
	@RequestMapping(value = "/healthcare_request")	
	public String request() 
	{
		return "admin/healthcare_request";
	}
}