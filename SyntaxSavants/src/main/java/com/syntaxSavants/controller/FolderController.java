package com.syntaxSavants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syntaxSavants.models.FolderModel;
import com.syntaxSavants.services.FolderService;

@Controller
@RequestMapping("/folder")
public class FolderController {
	
	@Autowired
	private FolderService folderService;
	
	@RequestMapping("/create_repo")
	public String createRepo(FolderModel model) {
		String res = null;
		System.out.println(model);
		res = folderService.saveFolder(model);
		if(res != null) {
			return "redirect:/patient/repo";
		}
		else {
			return "accessDenied";
		}
	}
}
