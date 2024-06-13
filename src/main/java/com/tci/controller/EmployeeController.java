package com.tci.controller;


import com.tci.dto.Employees;
import com.tci.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<?> createEmployee(@RequestBody Employees employees){
        try {
            employeeService.createEmployees(employees);
            return new ResponseEntity<>("CREATED", HttpStatus.CREATED);
        }catch (IllegalStateException e){
            return new ResponseEntity<>("BAD REQUEST", HttpStatus.BAD_REQUEST);
        }catch (RuntimeException e){
            return new ResponseEntity<>("SOMETHING WENT WRONG", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
