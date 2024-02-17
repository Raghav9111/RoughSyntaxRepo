package com.syntaxSavants.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntaxSavants.entities.MedicalAuthority;
import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.MedicalAuthorityModel;
import com.syntaxSavants.models.UpdateMedicalModel;
import com.syntaxSavants.repositories.MedicalAuthorityRepo;
import com.syntaxSavants.repositories.UserRepository;
import com.syntaxSavants.security.MailService;

@Service
public class HospitalAuthorityService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MedicalAuthorityRepo medicalRepo;
	
	@Autowired
	private MailService mailService;
	
	public String saveMedical(MedicalAuthorityModel model) {
		try {
			User user = new User(model.getEmail(), model.getPassword(), "ROLE_MEDICAL", false);
			user = userRepo.save(user);
			if(user!=null) {
				
				MedicalAuthority medical = new MedicalAuthority(model.getName(),model.getAddress(), model.getPhone(), model.getCertificate(), user);
				medicalRepo.save(medical);
				mailService.verificationMail(model.getEmail(), model.getName());
				return "Save Successful";
			}
			else {
				return "User is null";
			}
		}
		catch (Exception e) {
			return e.getMessage();
		}
	}

	public MedicalAuthority get(User user) {
		return medicalRepo.findByUser(user).get();
	}

	public String updateMedical(UpdateMedicalModel authority, Integer id)
	{
		MedicalAuthority medical = medicalRepo.findById(id).get();
		medical.setPhone(authority.getPhone());
		medical.setAddress(authority.getAddress());
		medicalRepo.save(medical);
		return "Medical saved!";
	}
}
