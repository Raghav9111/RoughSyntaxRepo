package com.syntaxSavants.entities;

import java.time.LocalDate;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="folder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Folder {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column(nullable = false)
    private String title;
	@Column(nullable = false)
    private LocalDate date;
	@Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
