package com.example.SpringBootMySQLEx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootMySQLEx.Employee;

public interface Employee_repo extends JpaRepository<Employee,Integer>{

}
