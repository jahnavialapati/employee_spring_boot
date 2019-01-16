package com.cg.rest.restservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.restservice.entity.Employee;
import com.cg.rest.restservice.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;
	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(int empId) {	
		return repository.findById(empId);
	}

	@Override
	public void updateEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public void delete(int empId) {
		Employee employee=repository.getOne(empId);
		repository.delete(employee);
		
	}

}
