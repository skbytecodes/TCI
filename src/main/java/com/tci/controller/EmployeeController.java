package com.tci.controller;


import com.fasterxml.jackson.core.JsonParseException;
import com.tci.dto.EmployeeBonusResponse;
import com.tci.dto.Employees;
import com.tci.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/tci/employee-bonus")
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


    @GetMapping("/tci/employee-bonus")
    public ResponseEntity<?> employeeBonus(@RequestParam("date") String date) throws JsonParseException {
        try {
            return new ResponseEntity<>(employeeService.employeeBonus(date), HttpStatus.OK);
        }catch (IllegalStateException e){
            var response = new EmployeeBonusResponse();
            response.setData(new ArrayList<>());
            response.setErrorMessage("BAD REQUEST");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }catch (RuntimeException e){
            var response = new EmployeeBonusResponse();
            response.setData(new ArrayList<>());
            response.setErrorMessage("SOMETHING WENT WRONG");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
