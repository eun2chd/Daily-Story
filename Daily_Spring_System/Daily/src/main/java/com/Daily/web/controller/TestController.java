package com.Daily.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Daily.web.dto.TestDto;

@Controller
public class TestController {
	
	@GetMapping("test1")
	public String testPage() {
		return "auth/test";
	}
	
	@RequestMapping(value = "/test1-submit", method = RequestMethod.POST)
	public String testSubmit(TestDto testDto) {
		System.out.println(testDto);
		return "test";
	}
	

}
