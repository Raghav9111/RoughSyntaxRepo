package com.syntaxSavants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.syntaxSavants.entities.MedicalAuthority;
import com.syntaxSavants.entities.Patient;
import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.UpdateMedicalModel;
import com.syntaxSavants.repositories.MedicalAuthorityRepo;
import com.syntaxSavants.services.HospitalAuthorityService;
import com.syntaxSavants.services.PatientService;


@Controller
@RequestMapping("/medical")
public class MedicalAuthorityController {

	@Autowired
	private MedicalAuthorityRepo repo;
	
	@Autowired
	private HospitalAuthorityService service;
	
	@Autowired
	private PatientService pservice;
	
	
	@RequestMapping("/home")
	public String home()
	{
		
		return "Medical/MedicalPatients";
	}
	
	@RequestMapping("/profile")
	public String profile(ModelMap model)
	{
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = (User)principal;
		MedicalAuthority ma = service.get(user);
		
		model.addAttribute("medical",ma);
		
		return "Medical/MedicalProfile";
	}
	
	@RequestMapping("/updateMedical")
	public String updateMedical(UpdateMedicalModel authority)
	{
		String res = null;
		res = service.updateMedical(authority, authority.getMedicalAuthorityID());
		
		if(res!=null)
		return "redirect:/medical/profile";
		
		else
		return null;	
	}
	
	@RequestMapping("/searchPatient")
	public String searchPatient(@RequestParam (value="patientid") Integer patientId, ModelMap model)
	{
		System.out.println(patientId);
	    Patient patient = pservice.findByID(patientId);
	    System.out.println(patient);
	    model.addAttribute("plist",patient);
		return "Medical/MedicalPatients";
	}
	
	@RequestMapping("/viewPatient")
	public String viewPatient() {
		return "Medical/PatientRecord";
	}
	
	@RequestMapping("/patient_request")
	public String requestPatient() {
		return "Medical/patient_request";
	}
	
}
