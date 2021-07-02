package com.cg.spring.demo.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.demo.db.model.Employee;
import com.cg.spring.demo.db.repository.EmployeeRepository;

@Component
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	// select one employee
	public Employee getEmployeebyId(int eid) {

		return repository.findById(eid).get();

	}

	// write methods to select many, insert, update, delete
}
