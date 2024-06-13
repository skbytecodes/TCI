package com.tci.dto;

public class EmployeeResponse {
    private String empName;
    private Double amount;

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

    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "empName='" + empName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
