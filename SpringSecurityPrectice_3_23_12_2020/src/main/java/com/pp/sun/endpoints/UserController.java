package com.pp.sun.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pp.sun.models.User;
import com.pp.sun.services.Services;

@Controller
public class UserController {

	@Autowired
	private Services services;

	@GetMapping("/registration")
	public String showReg() {

		return "RegistrationPage";
	}

	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user, Model model) {

		model.addAttribute("massage", services.saveUser(user));
		return "CommonPage";

	}

	@GetMapping("/welcome")
	public String showWelcome() {

		return "WelcomePage";
	}

	@GetMapping("/admin")
	public String showAdmin() {

		return "AdminPage";
	}

	@GetMapping("/emp")
	public String showEmp() {

		return "EmpPage";
	}

	@GetMapping("/common")
	public String showCommon() {

		return "CommonPage";
	}

	@GetMapping("/denied")
	public String showDeniedPage() {

		return "DeniedPage";
	}
	
	
	/*Method : 3
	 * this methos used to disply login form for coustem login form 
	 */	
	@GetMapping("/login")
	public String showLogin() {

		return "UserLogin";
	}

}
