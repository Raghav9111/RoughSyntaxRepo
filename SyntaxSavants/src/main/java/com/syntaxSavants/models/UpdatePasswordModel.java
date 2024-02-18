package com.syntaxSavants.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePasswordModel
{
	private String oldPassword;
	private String newPassword;
	private String ConfirmPassword;
}
