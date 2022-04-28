package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long>{
	

}
