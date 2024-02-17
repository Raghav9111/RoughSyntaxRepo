package com.syntaxSavants.entities;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "report")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date date;
    @Column
    private String description;
    @Column(nullable = false)
    private String file; // You will need to handle file uploading separately
    @Column(nullable = false)
    private String uploadBy;

    @ManyToOne
    @JoinColumn(name = "folder_id")
    private Folder folder;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

	public Report(Date date, String description, String file, String uploadBy, Folder folder, Patient patient) {
		super();
		this.date = date;
		this.description = description;
		this.file = file;
		this.uploadBy = uploadBy;
		this.folder = folder;
		this.patient = patient;
	}
    
    

    
}