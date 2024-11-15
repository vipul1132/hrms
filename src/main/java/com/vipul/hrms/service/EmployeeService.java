package com.vipul.hrms.service;

import com.vipul.hrms.dto.EmployeeDTO;

public interface EmployeeService {
	
	EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
	
	EmployeeDTO getEmployeeById(Long empId);

}