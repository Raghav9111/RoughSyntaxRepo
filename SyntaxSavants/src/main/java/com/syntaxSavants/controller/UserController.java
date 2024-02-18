package com.syntaxSavants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syntaxSavants.entities.Folder;
import com.syntaxSavants.entities.Report;
import com.syntaxSavants.services.FolderService;
import com.syntaxSavants.services.ReportService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired 
	private ReportService reportService;
	
	@Autowired
	private FolderService folderService;
	@RequestMapping("/logout")
	public String logout() {
		return "redirect:/web/login";
	}
	
	@RequestMapping("/report/{folderId}")
	public String report(@PathVariable(name="folderId")Integer folderId, ModelMap map)
	{
		List<Report> rlist = reportService.getReports(folderId);
		Folder folder = folderService.getFolderById(folderId);
		map.addAttribute("folder", folder);
		map.addAttribute("rlist",rlist);
		return "Medical/Report";
	}
	
}
