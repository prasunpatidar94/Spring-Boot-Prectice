package com.pp.sun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerForInMamoryAthuntication {

	@RequestMapping("/home")
	private String homeMathod() {

		return "open for all  home ";
	}

	@RequestMapping("/welcome")
	private String forLogerMethod() {

		return "open for all logger welcome ";
	}

	@RequestMapping("/admin")
	private String adminMathod() {

		return "open for admin only ";
	}

	@RequestMapping("/emp")
	private String employeeMathod() {

		return "open for Employee only ";
	}

	@RequestMapping("/std")
	private String studentMethod() {

		return "open for student Only ";
	}

	@RequestMapping("/common")
	private String commonForAdminAndEmployeeMathod() {

		return "open for Admin And Employee ";
	}

}
