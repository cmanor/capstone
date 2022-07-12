package com.example.capstone.service;

import com.example.capstone.model.Employee;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
