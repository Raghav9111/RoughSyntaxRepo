package com.syntaxSavants.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient_approvals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer approvalId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "healthcare_id")
    private MedicalAuthority medicalAuthority;
    
    @Column(nullable = false)
    private boolean viewStatus;
    
    @Column(nullable = false)
    private boolean uploadStatus;
}
