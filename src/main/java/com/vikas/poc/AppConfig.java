package com.vikas.poc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.vikas.poc.pojo.Employee;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value= {"com.vikas.poc.*"})
public class AppConfig {

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean Intercept getIntercept() {
		return new Intercept();
	}
	
	@Bean MainClass geMainClass() {
		return new MainClass();
	}
}
