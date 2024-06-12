package com.tci.service;

import com.tci.dto.EmployeeRequest;
import com.tci.entity.Employee;

public interface EmployeeService {
    Employee createEmployee(EmployeeRequest employeeRequest);
    Employee getEmployeeById(Long empId);
}
