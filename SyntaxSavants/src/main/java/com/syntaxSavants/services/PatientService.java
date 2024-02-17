package com.syntaxSavants.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.syntaxSavants.entities.Patient;
import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.PatientModel;
import com.syntaxSavants.repositories.PatientRepo;
import com.syntaxSavants.repositories.UserRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepo patientRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public String savePatient(PatientModel model) {
		try {
			User user = new User(model.getEmail(), model.getPassword(), "ROLE_PATIENT", true);
			user = userRepo.save(user);
			if(user!=null) {
				final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
				final LocalDate dob = LocalDate.parse(model.getDob(), dtf);
				Patient patient = new Patient(model.getName(), model.getPhone(), model.getAddress(), model.getGender(),dob, user);
				patientRepo.save(patient);
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

	public void get(User user) 
	{
		Optional<Patient> op= patientRepo.findById(user.getUserId());
		
		if(op.isPresent())
		{
			System.out.println("Object hai");
		}
		else
		{
			System.out.println("nhi hai");
		}
	}

}
