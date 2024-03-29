package com.syntaxSavants.services;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.syntaxSavants.entities.Patient;
import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.PatientModel;
import com.syntaxSavants.models.UpdatePasswordModel;
import com.syntaxSavants.models.UpdatePatientModel;
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
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date dob = sdf.parse(model.getDob());
				Patient patient = new Patient(model.getName(), model.getPhone(), model.getAddress(), model.getGender(),dob, user);
				patientRepo.save(patient);
				return "Save Successful";
			}
		catch (Exception e) {
			return e.getMessage();
		}
	}

	public Patient get(User user) 
	{
		Optional<Patient> op= patientRepo.findByUser(user);
		Patient patient;
		if(op.isPresent())
		{
			patient = op.get();
			return patient;
		}
		else
		{
			System.out.println("Optional is null");
			return null;
		}
	}

	public Patient getById(Integer patientID) {
		return patientRepo.findById(patientID).get();
	}
	
	public Patient findByID(Integer patientId) {
		return patientRepo.findById(patientId).get();
	}

	public String updateModel(UpdatePatientModel model, Integer id) 
	{
		Patient pat = patientRepo.findById(id).get();
		System.out.println(pat);
		pat.setPhone(model.getPhone());
		pat.setAddress(model.getAddress());
		
		patientRepo.save(pat);
		return "Patient Saved";
	}



	public String updateModel(UpdatePasswordModel model, User user) 
	{
		if(model.getOldPassword().equals(user.getPassword()))
		{
			if(model.getNewPassword().equals(model.getConfirmPassword()))
			{
				user.setPassword(model.getNewPassword());
				userRepo.save(user);
				return "Password Changed";
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}
	}
