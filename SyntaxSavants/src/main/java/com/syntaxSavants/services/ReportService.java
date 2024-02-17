package com.syntaxSavants.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntaxSavants.entities.Folder;
import com.syntaxSavants.entities.Report;
import com.syntaxSavants.repositories.FolderRepo;
import com.syntaxSavants.repositories.ReportRepository;

@Service
public class ReportService {

	@Autowired
	private FolderRepo folderRepo;
	
	@Autowired
	private ReportRepository reportRepo;
	
	public String saveReport(String filePath, Integer fid) {
		try
		{
			Folder folder = folderRepo.findById(fid).get();
			Date date = new Date();
			Report report = new Report(date, null, filePath, "Self", folder, folder.getPatient());
			reportRepo.save(report);
			return "file save";
		}
		catch (Exception e) {
			System.out.println("Exception Report Upload"+e.getMessage());
			return null;
		}
		
	}
	
}
