package com.pp.sun.endpoints;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pp.sun.models.User;
import com.pp.sun.services.Services;

@Controller

/*
 * first declear the session veriable which you want to store in session 
 */
@SessionAttributes({"title","DB","dummy"})
public class UserController {

	@Autowired
	private Services services;
	
	/* 
	 * in this method "principal" is used to get current user information
	 * we are using the "model memmory " to add the session data in the model 
	 * form the model  is scope only session live 
	 *
	 * */
	@GetMapping("/common")
	public String showCommon(Model model , Principal principal) {
		model.addAttribute("title", "Prasun Session ");
		model.addAttribute("dummy", principal.getName());
		
		
		return "CommonPage";
	}
	
	
	/*
	 * csrf demo test to see the csrf token code on
	 */
	@GetMapping("/csrflogin")
	public String showCsrf() {

		return "CsrfLogin";
	}


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
