package com.vikas.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.poc.pojo.Employee;

@Service
public class EmployServiceImpl implements EmployService {
	
	@Autowired
	Employee employee;

	public void changeName(String nm) {
		employee.setName(nm);
	}

	public void printName() {
		System.out.println("Find Emp Name " + employee.getName());
	}
	
	

}
