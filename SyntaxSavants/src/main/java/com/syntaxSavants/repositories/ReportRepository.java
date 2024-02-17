package com.syntaxSavants.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.syntaxSavants.entities.Folder;
import com.syntaxSavants.entities.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{
	@Query("select u from Report u where folder=?1")
	Optional<List<Report>> findByFolder(Folder folder);
}
