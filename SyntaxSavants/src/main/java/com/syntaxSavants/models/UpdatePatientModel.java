package com.syntaxSavants.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePatientModel 
{
	private Integer patientID;
	private String name;
	private String phone;
	private String address;
}
