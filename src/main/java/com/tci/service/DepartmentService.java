package com.tci.service;

import com.tci.dto.DepartmentRequest;
import com.tci.entity.Department;

public interface DepartmentService {
    Department addNewDepartment(DepartmentRequest request);
}
