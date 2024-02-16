package com.syntaxSavants.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.apache.catalina.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.MedicalAuthorityModel;
import com.syntaxSavants.models.PatientModel;
import com.syntaxSavants.services.HospitalAuthorityService;
import com.syntaxSavants.services.PatientService;
import com.syntaxSavants.services.UserService;
@Controller
@RequestMapping("/web")
public class WebController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private HospitalAuthorityService hospitalService;
	
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
	
	@RequestMapping(value="/medicalAuthority_reg")
	public String signUp(@RequestParam("file")MultipartFile multipartFile,MedicalAuthorityModel model, ModelMap map) {
		final String baseDir = "E:\\SyntaxSavants";
		byte data[];
		try {
			data = multipartFile.getBytes();
			String filePath = "";
			
			String fileName = multipartFile.getOriginalFilename();
			String fileType = multipartFile.getContentType();
			
			String extension = fileName.substring(fileName.lastIndexOf("."));
			String uploadFile = UUID.randomUUID().toString()+extension;
			
			File dir = new File(baseDir,"files");
			if(!dir.exists()) // Check Folder Existence; 
			{
				dir.mkdir();
			}
			
			File file = new File(dir, uploadFile);
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(data);
			fos.flush();
			fos.close();
			
			filePath =  file.getAbsolutePath();
			
			model.setCertificate(filePath);
			
			String res = null;
			res = hospitalService.saveMedical(model);
			if(res.equals("Save Successful")) {
				map.addAttribute("msg", "Hospital Authority Register Successful");
				return "login";
			}else {
				map.addAttribute("errorMsg", "Hospital Authority not Register Successful");
				return "login";
			}
			
		} catch (IOException e) {
			return "redirect:/web/accessDenied";
		}
		
	}
	@RequestMapping("/verify/{email}")
	public String verifyAccount(@PathVariable(name="email") String email) {
		User user = (User)userService.loadUserByUsername(email);
		user.setActiveStatus(true);
		userService.saveUser(user);
		return "login";
	}
	
}
