package com.syntaxSavants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping(value = "/admin")
public class AdminController 
{
	
	
	@RequestMapping(value = "/home")	
	public String home() 
	{
		return "home";
	}
}