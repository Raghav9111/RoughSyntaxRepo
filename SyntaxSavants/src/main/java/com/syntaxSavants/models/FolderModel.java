package com.syntaxSavants.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FolderModel {
	private String title;
	private String description;
	private Integer patientID;
}
