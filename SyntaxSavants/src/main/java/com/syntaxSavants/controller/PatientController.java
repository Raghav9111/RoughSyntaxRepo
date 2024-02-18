package com.syntaxSavants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.syntaxSavants.entities.Folder;
import com.syntaxSavants.entities.Patient;
import com.syntaxSavants.entities.Report;
import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.UpdatePatientModel;
import com.syntaxSavants.services.FolderService;
import com.syntaxSavants.services.PatientService;
import com.syntaxSavants.services.ReportService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patService;
	
	@Autowired
	private FolderService folderService;
	
	@Autowired
	private ReportService reportService;
	
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
	public String id(ModelMap map){
	{
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = (User)principal;
		System.out.println(user);
		Patient pat = patService.get(user);
		map.addAttribute("patient",pat);

		return "Patient/patientId";
	}
	}

	@RequestMapping("/repo")
	public String repo(ModelMap map)
	{
		Object ob = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = (User)ob;
		System.out.println(user);
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
	@RequestMapping("/report/{folderId}")
	public String report(@PathVariable(name="folderId")Integer folderId, ModelMap map)
	{
		List<Report> rlist = reportService.getReports(folderId);
		Folder folder = folderService.getFolderById(folderId);
		map.addAttribute("folder", folder);
		map.addAttribute("rlist",rlist);
		return "Patient/Reports";
	}
	
	@RequestMapping("/updatepath" )
	public String updatePath(ModelMap map)
	
	{

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = (User)principal;
		System.out.println(user);
		Patient pat = patService.get(user);
		System.out.println(pat);
		map.addAttribute("patient",pat);

		return "Patient/update_patient";
	}
	
	@RequestMapping("/update")
	public String update(UpdatePatientModel model,ModelMap map) 
	{
	
		String res = null;
		res= patService.updateModel(model,model.getPatientID());
				if(res!= null)
		{
			return "redirect:/patient/patientid";
		}
	else
		return null;
	}
	
	@RequestMapping("/updatePassword")
	public String updatepass()
	{	
		return "Patient/updatePassword"; 
	}

}

 