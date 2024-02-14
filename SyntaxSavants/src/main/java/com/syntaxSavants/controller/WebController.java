package com.syntaxSavants.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syntaxSavants.entities.User;
@Controller
@RequestMapping("/web")
public class WebController {
	
	@RequestMapping(value = "/login")	
	public String login(ModelMap model, String error, String logout) 
	{
		if (error != null)
		{
			model.addAttribute("errorMsg", "Your username and password are invalid.");
		}
		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";
	}
	

	
	@RequestMapping(value = "/home")	
	public String home() 
	{
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = (User)principal;
		if(user.getRole().equals("ROLE_ADMIN"))
			return "redirect:/admin/home";
		else
			return "redirect:/student/home";
	}
	
	@RequestMapping(value = "/accessDenied")
	public String accessDenied() {
		return "accessDenied";
	}
}
