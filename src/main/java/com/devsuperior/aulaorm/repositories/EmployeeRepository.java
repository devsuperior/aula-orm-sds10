package com.devsuperior.aulaorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulaorm.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
