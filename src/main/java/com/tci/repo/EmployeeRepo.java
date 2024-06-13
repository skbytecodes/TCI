package com.tci.repo;

import com.tci.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE :date BETWEEN e.joiningDate AND e.exitDate")
    List<Employee> findActiveEmployees(LocalDate date);
}
