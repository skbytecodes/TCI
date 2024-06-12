package com.tci.dto;

public class DepartmentRequest {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "DepartmentRequest{" +
                "department='" + department + '\'' +
                '}';
    }
}
