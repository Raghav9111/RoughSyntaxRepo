package com.syntaxSavants.models;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalAuthorityModel {

	private String name;
	private String email;
	private String password;
	private String address;
	private String phone;
    private String certificate;
}
