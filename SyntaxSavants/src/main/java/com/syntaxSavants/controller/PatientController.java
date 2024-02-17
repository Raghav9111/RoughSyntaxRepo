package com.syntaxSavants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syntaxSavants.entities.Folder;
import com.syntaxSavants.entities.Patient;
import com.syntaxSavants.entities.User;
import com.syntaxSavants.services.FolderService;
import com.syntaxSavants.services.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patService;
	
	@Autowired
	private FolderService folderService;
	
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
	public String repo(ModelMap map)
	{
		Object ob = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = (User)ob;
		if(ob!=null)
		{
			Patient patient = patService.get(user);
			List<Folder>flist = folderService.getFolders(patient);
			System.out.println(flist);
			map.addAttribute("patient", patient);
			map.addAttribute("flist", flist);
			return "Patient/Repo";
		}
		else {
			return null;
		}
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

 