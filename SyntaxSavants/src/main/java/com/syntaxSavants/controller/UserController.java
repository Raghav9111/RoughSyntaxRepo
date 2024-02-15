package com.syntaxSavants.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/logout")
	public String logout() {
		return "login";
	}
}
