package com.syntaxSavants.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientModel {
	private String name;
	private String email;
	private String password;
	private String phone;
	private String address;
	private String gender;
	private String dob;
}
