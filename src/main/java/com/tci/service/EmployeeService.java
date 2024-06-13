package com.tci.service;

import com.tci.dto.Employees;
import com.tci.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> createEmployees(Employees employees);
    Employee getEmployeeById(Long empId);
}
