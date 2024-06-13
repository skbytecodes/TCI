package com.tci.serviceImpl;

import com.tci.dto.Employees;
import com.tci.entity.Department;
import com.tci.entity.Employee;
import com.tci.repo.DepartmentRepo;
import com.tci.repo.EmployeeRepo;
import com.tci.service.EmployeeService;
import com.tci.util.LocalDateParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private DepartmentRepo departmentRepo;

    @Transactional
    @Override
    public List<Employee> createEmployees(Employees employees) {
        List<Employee> savedEmployees = new ArrayList<>();
        try {
            if(employees != null){
                employees.getEmployees().forEach(employeeRequest -> {
                    Employee employee = new Employee();
                    employee.setEmpName(employeeRequest.getEmpName());
                    employee.setAmount(employeeRequest.getAmount());
                    employee.setCurrency(employeeRequest.getCurrency());
                    try {
                        employee.setJoiningDate(LocalDateParser.stringToLocalDate(employeeRequest.getJoiningDate()));
                        employee.setExitDate(LocalDateParser.stringToLocalDate(employeeRequest.getExitDate()));
                    } catch (com.fasterxml.jackson.core.JsonParseException e) {
                        throw new RuntimeException(e);
                    }
                    Optional<Department> departmentOpt = departmentRepo.findByDepartment(employeeRequest.getDepartment());
                    Department newDepartment = departmentOpt.orElseGet(() -> {
                        Department department = new Department();
                        department.setDepartment(employeeRequest.getDepartment());
                        return departmentRepo.save(department);
                    });
                    employee.setDepartment(newDepartment);
                    savedEmployees.add(employeeRepo.save(employee));
                });
                return savedEmployees;
            }
            throw new IllegalStateException("Employee Request is null");
        }catch (IllegalArgumentException e){
            throw new IllegalStateException(e.getMessage());
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Employee getEmployeeById(Long empId) {
        return null;
    }
}
