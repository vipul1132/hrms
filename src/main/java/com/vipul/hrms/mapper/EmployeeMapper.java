package com.vipul.hrms.mapper;

import com.vipul.hrms.dto.EmployeeDTO;
import com.vipul.hrms.entity.Employee;

public class EmployeeMapper {
	public static EmployeeDTO mapToEmployeeDTO(Employee emp) {
		EmployeeDTO empDto = new EmployeeDTO();
		empDto.setId(emp.getId());
		empDto.setName(emp.getName());
		empDto.setLocation(emp.getLocation());
		empDto.setSalary(emp.getSalary());
		empDto.setDepartment(emp.getDepartment());
		return empDto;
	}
	
	public static Employee mapDtoToEmployee(EmployeeDTO empDto) {
		Employee emp = new Employee();
		emp.setId(empDto.getId());
		emp.setName(empDto.getName());
		emp.setLocation(empDto.getLocation());
		emp.setSalary(empDto.getSalary());
		emp.setDepartment(empDto.getDepartment());
		return emp;
	}
}