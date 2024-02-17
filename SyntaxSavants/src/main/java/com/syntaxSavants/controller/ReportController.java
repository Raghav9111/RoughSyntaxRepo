package com.syntaxSavants.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.syntaxSavants.services.ReportService;

@Controller
@RequestMapping("/report")
public class ReportController {

	@Autowired
	private ReportService reportService;
		
	@RequestMapping("/add_report/{folderId}")
	public String addReport(@PathVariable(name="folderId") Integer fid,@RequestParam("file")MultipartFile multipartFile, ModelMap map) {
		final String baseDir = "E:\\SyntaxSavants";
		byte data[];
		try {
			System.out.println(multipartFile.getOriginalFilename());
			data = multipartFile.getBytes();
			String filePath = "";
			String fileName = multipartFile.getOriginalFilename();
			String fileType = multipartFile.getContentType();
			
			String extension = fileName.substring(fileName.lastIndexOf("."));
			int dot = fileName.indexOf(".");
			String uploadFile = fileName.substring(0,dot)+extension;
			
			File dir = new File(baseDir,"Reports");
			if(!dir.exists()) // Check Folder Existence; 
			{
				dir.mkdir();
			}
			
			File file = new File(dir, uploadFile);
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(data);
			fos.flush();
			fos.close();
			
			filePath =  file.getAbsolutePath();
			
			
			String res = null;
			res = reportService.saveReport(filePath,fid,multipartFile.getOriginalFilename());
			if(res.equals("file save")) {
				map.addAttribute("msg", "File Upload Successful");
				return "redirect:/patient/report/"+fid;
			}else {
				map.addAttribute("errorMsg", "Report not upload successful");
				return "accessDenied";
			}
			
		} catch (IOException e) {
			return "redirect:/web/accessDenied";
		}
	}
	@RequestMapping(value = "/getPdf",method = RequestMethod.GET)
	public ResponseEntity<InputStreamResource> load(@RequestParam(name = "file")String path) 
	{					
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Disposition", "attachment; filename=stock.pdf");
		
		
			String pic;
			try {
				File file = new File(path);

	         	FileInputStream fis = new FileInputStream(file);            
	            int size = fis.available();
	            byte arr[] = new byte[size];
	            
	            fis.read(arr);
	            fis.close();
	            
	            return ResponseEntity
                .ok()
                .headers(headers)
                .body(new InputStreamResource(new ByteArrayInputStream(arr)));
	            
			} catch (IOException e) 
			{
				System.out.println(e.getMessage());
				return null;
			}
	}
	
}
