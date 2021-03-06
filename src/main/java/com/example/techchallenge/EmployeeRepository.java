package com.example.techchallenge;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findBySalaryBetween(float min, float max, Pageable pageable);
    boolean existsByName(String name);
    Employee findByName(String name);
}
