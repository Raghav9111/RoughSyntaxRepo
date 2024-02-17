package com.syntaxSavants.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.syntaxSavants.entities.Folder;
import com.syntaxSavants.entities.Patient;

@Repository
public interface FolderRepo extends JpaRepository<Folder, Integer>{
	@Query("select u from Folder u where patient=?1")
	Optional<List<Folder>> findByPatient(Patient patient);
}
