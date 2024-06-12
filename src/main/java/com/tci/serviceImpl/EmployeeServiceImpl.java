package com.tci.serviceImpl;

import com.tci.dto.EmployeeRequest;
import com.tci.entity.Department;
import com.tci.entity.Employee;
import com.tci.repo.DepartmentRepo;
import com.tci.repo.EmployeeRepo;
import com.tci.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private DepartmentRepo departmentRepo;

    @Transactional
    @Override
    public Employee createEmployee(EmployeeRequest employeeRequest) {
        try {
            if(employeeRequest != null){
                var employee = new Employee();
                employee.setEmpName(employeeRequest.getEmpName());
                employee.setAmount(employeeRequest.getAmount());
                employee.setCurrency(employeeRequest.getCurrency());
                employee.setJoiningDate(employeeRequest.getJoiningDate());
                employee.setExitDate(employeeRequest.getExitDate());
                Optional<Department> departmentOpt = departmentRepo.findByDepartment(employeeRequest.getDepartment().getDepartment());
                Department newDepartment = departmentOpt.orElseGet(() -> {
                    Department department = new Department();
                    department.setDepartment(employeeRequest.getDepartment().getDepartment());
                    return departmentRepo.save(department);
                });
                employee.setDepartment(newDepartment);
                return employeeRepo.save(employee);
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
