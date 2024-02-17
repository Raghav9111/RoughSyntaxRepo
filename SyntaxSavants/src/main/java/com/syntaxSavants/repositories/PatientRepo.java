package com.syntaxSavants.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syntaxSavants.entities.Patient;
import com.syntaxSavants.entities.User;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer>
{

	Optional<Patient> findByUser(User user);

}
