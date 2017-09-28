package com.vikas.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.vikas.poc.service.EmployService;

@Service
public class MainClass {
	
	@Autowired
	private EmployService employService;
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Employee bean = context.getBean(Employee.class);
//		bean.setName("Vikas");
		MainClass mainClass = context.getBean(MainClass.class);
		mainClass.employService.changeName("Vikas");
		mainClass.employService.printName();
		
		
	}
	
}
