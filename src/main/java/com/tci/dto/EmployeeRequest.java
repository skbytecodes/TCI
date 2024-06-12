package com.tci.dto;

import com.tci.entity.Department;

import java.time.LocalDateTime;

public class EmployeeRequest{

    private String empName;
    private Double amount;
    private String currency;
    private LocalDateTime joiningDate;
    private LocalDateTime exitDate;
    private Department department;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    public LocalDateTime getExitDate() {
        return exitDate;
    }

    public void setExitDate(LocalDateTime exitDate) {
        this.exitDate = exitDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeRequest{" +
                "empName='" + empName + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", joiningDate=" + joiningDate +
                ", exitDate=" + exitDate +
                ", department=" + department +
                '}';
    }
}
