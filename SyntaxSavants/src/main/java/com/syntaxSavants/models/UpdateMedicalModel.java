package com.syntaxSavants.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMedicalModel 
{
	private Integer medicalAuthorityID;
	private String name;
	private String phone;
	private String address;

}
