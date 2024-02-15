package com.syntaxSavants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.PatientModel;
import com.syntaxSavants.services.PatientService;
import com.syntaxSavants.services.UserService;
@Controller
@RequestMapping("/web")
public class WebController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PatientService patientService;
	
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
		System.out.println(user);
		if(user.getRole().equals("ROLE_ADMIN"))
			return "redirect:/admin/home";
		else if(user.getRole().equals("ROLE_MEDICAL"))
			return "redirect:/medical/home";
		else
			return "redirect:/patient/home";
	}
	
	@RequestMapping(value="/patient_reg")
	public String signUp(PatientModel model, ModelMap map) {
		
		String res = null;
		res = patientService.savePatient(model);
		if(res.equals("Save Successful")) {
			map.addAttribute("msg", "Patient Register Successful");
			return "login";
		}else {
			map.addAttribute("errorMsg", "Patient not Register Successful");
			return "login";
		}
		
	}
	
	@RequestMapping(value = "/accessDenied")
	public String accessDenied() {
		return "accessDenied";
	}
	@RequestMapping(value="/medical")
	public String medical()
	{
		return "hospital_sign_up";
	}
}
