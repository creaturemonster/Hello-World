package com.apress.isf.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan
public class Application {

	@Bean
	MessageService HelloWorldMessageService() {
		return new HelloWorldMessage();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Application.class);
		MessageService service=context.getBean(MessageService.class);
		System.out.println(service.getMessage());
	}

}
