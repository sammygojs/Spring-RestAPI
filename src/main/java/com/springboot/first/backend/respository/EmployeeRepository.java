package com.springboot.first.backend.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.first.backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
