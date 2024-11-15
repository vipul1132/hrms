package com.vipul.hrms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vipul.hrms.dto.EmployeeDTO;
import com.vipul.hrms.entity.Employee;
import com.vipul.hrms.exception.EmployeeNotFoundException;
import com.vipul.hrms.mapper.EmployeeMapper;
import com.vipul.hrms.repository.EmployeeRepository;
import com.vipul.hrms.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
		Employee employee = EmployeeMapper.mapDtoToEmployee(employeeDTO);
		Employee savedEmp = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDTO(savedEmp);
	}

	@Override
	public EmployeeDTO getEmployeeById(Long empId) {
		Employee employee = employeeRepository.findById(empId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found"));
		return EmployeeMapper.mapToEmployeeDTO(employee);
	}
}