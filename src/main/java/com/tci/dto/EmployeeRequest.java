package com.tci.dto;

public class EmployeeRequest{

    private String empName;
    private Double amount;
    private String currency;
    private String joiningDate;
    private String exitDate;
    private String department;

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

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
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
