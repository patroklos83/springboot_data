package com.patroclos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patroclos.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {
	
	@Autowired
	private com.patroclos.repository.EmployeeRepository EmployeeRepository;
	
	@PostMapping({"/create"})
	public Employee createEmployee(@RequestBody Employee employee) {
		return EmployeeRepository.save(employee);	
	}
	
	@PutMapping({"/update"})
	public Employee updateEmployee(@RequestBody Employee employee) {
		return EmployeeRepository.save(employee);	
	}
	
	@GetMapping({"/findbyfirstname/{firstname}"})
	public List<Employee> getEmployeesByFirstName(@RequestParam String firstName) {
		return EmployeeRepository.findByFirstName(firstName);	
	}
	
	@GetMapping({"/findall/"})
	public List<Employee> getEmployees() {
		return EmployeeRepository.findAll();	
	}

}
