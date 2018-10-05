package com.budgetbuddy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Hit");
		
		return "index";
	}
	
	@RequestMapping("/account")
	public String account() {
		return "account";
	}
}
