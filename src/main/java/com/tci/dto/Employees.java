package com.tci.dto;

import java.util.List;

public class Employees {
    private List<EmployeeRequest> employees;

    public List<EmployeeRequest> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeRequest> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employees=" + employees +
                '}';
    }
}
