package com.cg.rest.restservice.service;

import java.util.List;

import com.cg.rest.restservice.entity.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
