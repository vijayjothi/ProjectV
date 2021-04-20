package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class MiniprojectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MiniprojectApplication.class, args);
	}
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("surya","M","surya@atos.net"));
		this.employeeRepository.save(new Employee("vikram","K","vikram@atos.net"));
		this.employeeRepository.save(new Employee("chiyaan","V","chiyaan@atos.net"));
	}

}
