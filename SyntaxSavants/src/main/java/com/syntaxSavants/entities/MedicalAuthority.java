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
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
}
