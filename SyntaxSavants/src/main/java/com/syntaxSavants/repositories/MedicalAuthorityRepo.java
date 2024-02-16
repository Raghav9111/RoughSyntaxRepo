package com.syntaxSavants.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syntaxSavants.entities.MedicalAuthority;


public interface MedicalAuthorityRepo extends JpaRepository< MedicalAuthority , Integer> {

}
