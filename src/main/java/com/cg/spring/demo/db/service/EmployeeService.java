package com.cg.spring.demo.db.service;

import java.util.List;

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

	// select all employees
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	// insert a record
	public Employee insertEmployee(Employee employee) {
		return repository.save(employee);
	}

	// update a record
	public Employee updateEmployee(Employee employee) {
		return repository.save(employee);
	}

	// delete a record
	public void deleteEmployee(int eid) {
		repository.deleteById(eid);
	}

}