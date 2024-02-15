package com.syntaxSavants.entities;

import java.time.LocalDate;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientID;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String phone;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private LocalDate dob;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Patient(String name, String phone, String address, String gender, LocalDate dob, User user) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.user = user;
	}
	
	
}
