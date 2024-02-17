package com.syntaxSavants.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntaxSavants.entities.Folder;
import com.syntaxSavants.entities.Patient;
import com.syntaxSavants.models.FolderModel;
import com.syntaxSavants.repositories.FolderRepo;

@Service
public class FolderService {

	@Autowired
	private FolderRepo folderRepo;
	
	@Autowired
	private PatientService patService;
	
	public String saveFolder(FolderModel model) {
		try {
			Patient patient = patService.getById(model.getPatientID());
			Date date = new Date();
			Folder folder = new Folder(model.getTitle(), date, model.getDescription(), patient);
			folderRepo.save(folder);
			return "Folder create successful";
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}

	public List<Folder> getFolders(Patient patient) {
		 List<Folder> flist = folderRepo.findByPatient(patient).get();
		 return flist;
	}

	public Folder getFolderById(Integer folderId) {
		return folderRepo.findById(folderId).get();
	}

}
