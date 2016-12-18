package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/go-home-with-response-body")
	@ResponseBody
	public String goHomeWithResponseBody(){
		return "Welcome Home";
	}
	
	@RequestMapping("/")
	public String welcomeInitial(){
		return "welcome";
	}
	
	@RequestMapping("/home")
	public String goHome(){
		return "home";
	}
}
