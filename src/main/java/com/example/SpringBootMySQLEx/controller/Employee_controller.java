package com.example.SpringBootMySQLEx.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootMySQLEx.Employee;
import com.example.SpringBootMySQLEx.repo.Employee_repo;

@RestController
public class Employee_controller {
	
	@Autowired
	Employee_repo repo;
	
     @GetMapping ("/Employees")
	 public List<Employee> getEmpList(){
    	 List<Employee> students = repo.findAll();
    	 
    	 return students;
	//	 List<Employee> emplistEmployees = new ArrayList<>();
//		 emplistEmployees.add(new Employee(101,"hang",40939,"hang@gmail.com"));
//		 emplistEmployees.add(new Employee(103,"troa",70368,"troa@gmail.com"));
//		 emplistEmployees.add(new Employee(105,"amhu",98438,"amhu@gmail.com"));
		// return emplistEmployees;
    	 
    	 // Get employee by ID
	    
	  }
     @GetMapping("/employee/{id}")
	    public Employee getEmployeeById(@PathVariable int id) {
	        return repo.findById(id).orElse(null);
	    }
}