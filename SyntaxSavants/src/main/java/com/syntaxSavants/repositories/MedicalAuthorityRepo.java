package com.syntaxSavants.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syntaxSavants.entities.MedicalAuthority;
import com.syntaxSavants.entities.User;


public interface MedicalAuthorityRepo extends JpaRepository< MedicalAuthority , Integer> {

	Optional<MedicalAuthority> findByUser(User user);

}
