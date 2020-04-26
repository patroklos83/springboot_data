package com.patroclos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patroclos.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	public List<Employee> findByFirstName(String firstName);

}
