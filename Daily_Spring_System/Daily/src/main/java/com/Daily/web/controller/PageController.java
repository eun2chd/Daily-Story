package com.Daily.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/index")
	public String indexForm() {
		return "index";
	}
	
	// 로그인 페이지 호출
	@GetMapping("/auth/signin")
	public String signinForm() {
		return "auth/signin";
	}
	
	// 약관동의 페이지 호출
	@GetMapping("/auth/signup_term")
	public String signup_termsForm() {
		return "auth/signup_terms";
	}
	
	
	// 회원가입 페이지 호출
	
	@GetMapping("/auth/signup")
	public String signupForm() {
		return "auth/signup";
	}
	


}
