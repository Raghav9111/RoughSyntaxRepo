package com.syntaxSavants.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="medical_authority")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalAuthority {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medicalAuthorityID;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String phone;
	
	@Column(nullable = true)
    private String certificate; // You will need to handle file uploading separately
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public MedicalAuthority(String name, String address, String phone, String certificate , User user) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.certificate = certificate;
		this.user = user;
	}
}
