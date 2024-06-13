package com.tci.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.tci.dto.EmployeeBonusResponse;
import com.tci.dto.Employees;
import com.tci.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> createEmployees(Employees employees);
    EmployeeBonusResponse employeeBonus(String date) throws JsonParseException;
}
