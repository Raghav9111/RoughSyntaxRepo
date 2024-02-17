package com.syntaxSavants.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syntaxSavants.entities.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{

}
