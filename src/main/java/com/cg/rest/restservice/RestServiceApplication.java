package com.cg.rest.restservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.cg.rest.restservice.entity.Employee;
import com.cg.rest.restservice.repository.EmployeeRepository;

@SpringBootApplication
@ComponentScan("com")
public class RestServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class,args);
	}
	@Bean
	public CommandLineRunner populateData(EmployeeRepository repository) {
		return (arg) -> {
			repository.save(new Employee(101, "jahnavi", 10000, new com.cg.rest.restservice.entity.Address("gandhi", "hyderabad", 546789, "j12")));			
			repository.save(new Employee(102, "saroja", 20000, new com.cg.rest.restservice.entity.Address("rajeev", "vijayawada", 546708, "a23")));			
			repository.save(new Employee(103, "sam", 1000, new com.cg.rest.restservice.entity.Address("ramakrishna", "vizag", 546787, "k1")));			
			repository.save(new Employee(104, "ram", 5000, new com.cg.rest.restservice.entity.Address("gandhi", "hyderabad", 546789, "j12")));			
			
		};
		
	}
}
