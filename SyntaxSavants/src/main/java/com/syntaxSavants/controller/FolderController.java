package com.syntaxSavants.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syntaxSavants.models.FolderModel;

@Controller
@RequestMapping
public class FolderController {
	
	@RequestMapping("/create_repo")
	public String createRepo(FolderModel model) {
		
		return null;
	}
}
