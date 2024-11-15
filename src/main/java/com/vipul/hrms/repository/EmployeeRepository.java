package com.vipul.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vipul.hrms.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}