package com.syntaxSavants.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syntaxSavants.entities.Folder;

@Repository
public interface FolderRepo extends JpaRepository<Folder, Integer>{

}
