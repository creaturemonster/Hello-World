package com.apress.isf.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
	@RequestMapping("/")
	@ResponseBody
	String getMessage() {
		return "<h1>Hello World!</h1>";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloWorldController.class, args);
	}

}
