package com.syntaxSavants.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntaxSavants.entities.MedicalAuthority;
import com.syntaxSavants.entities.Patient;
import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.MedicalAuthorityModel;
import com.syntaxSavants.models.PatientModel;
import com.syntaxSavants.repositories.MedicalAuthorityRepo;
import com.syntaxSavants.repositories.UserRepository;

@Service
public class HospitalAuthorityService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MedicalAuthorityRepo medicalRepo;
	
	public String saveMedical(MedicalAuthorityModel model) {
		try {
			User user = new User(model.getEmail(), model.getPassword(), "ROLE_MEDICAL", true);
			user = userRepo.save(user);
			if(user!=null) {
				
				MedicalAuthority medical = new MedicalAuthority(model.getName(),model.getAddress(), model.getPhone(), model.getCertificate(), user);
				medicalRepo.save(medical);
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
}
