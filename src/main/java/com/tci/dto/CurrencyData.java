package com.tci.dto;

import com.tci.entity.Employee;

import java.util.List;

public class CurrencyData {
    private String currency;
    private List<EmployeeResponse> employees;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<EmployeeResponse> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeResponse> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "CurrencyData{" +
                "currency='" + currency + '\'' +
                ", employees=" + employees +
                '}';
    }
}
