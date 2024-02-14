package com.syntaxSavants.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WebController {
	@RequestMapping(value="/")
	public String home() 
	{
		return "login";
	}
	@RequestMapping(value="/medical")
	public String medical()
	{
		return "hospital_sign_up";
	}
}
