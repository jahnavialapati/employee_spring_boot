package com.cg.rest.restservice.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.restservice.entity.Employee;
import com.cg.rest.restservice.service.EmployeeService;


@RestController
@RequestMapping("/employees")//Addressable Resource
public class EmployeeResources {
	
@Autowired
private EmployeeService service;

@PostMapping//Uniform Constraint Interface
public void addNewEmployee(@RequestBody Employee employee) {
	service.addNewEmployee(employee);
}

	/*
	 * @RequestMapping(method=RequestMethod.GET,produces=
	 * {"application/json","application/xml"})
	 */
@GetMapping//Uniform Constraint Interface
public List<Employee> getAllEmployees(){
	return service.getAllEmployees();
}

@PutMapping
public void updateEmployee(@RequestBody Employee employee) {
	service.updateEmployee(employee);
}


@GetMapping("/{empId}")
public Optional<Employee> getEmployeeById(@PathVariable int empId) {
	return service.getEmployeeById(empId);
	
}

@DeleteMapping("/{empId}")
public void delete(@PathVariable int empId) {
	service.delete(empId);
}

}
