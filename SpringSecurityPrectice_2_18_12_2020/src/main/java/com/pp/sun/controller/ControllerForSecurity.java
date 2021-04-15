package com.pp.sun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForSecurity {

	@RequestMapping("/welcome")
	private String showAll() {

		return "WelcomePage";
	}

	@RequestMapping("/std")
	private String showstd() {

		return "StudentPage";
	}

	@RequestMapping("/adm")
	private String showAdm() {

		return "AdminPage";
	}

	@RequestMapping("/common")
	private String showCommon() {

		return "CommonPage";
	}

	@RequestMapping("/denied")
	private String showDenied() {

		return "DeniedPage";
	}

}
