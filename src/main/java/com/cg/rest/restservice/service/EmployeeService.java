package com.cg.rest.restservice.service;

import java.util.List;
import java.util.Optional;

import com.cg.rest.restservice.entity.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Optional<Employee> getEmployeeById(int empId);

	void updateEmployee(Employee employee);

	void delete(int empId);

}
