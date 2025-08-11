package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee employee);
	Optional<Employee> getEmployee(int empID);
	List<Employee> getAllEmployee(); 
	String updateEmployee(int empId,Employee employee);
	String employeeRemove(int empId);
	List<Employee>getByName(String name);
	List<EmployeeDTO>getDtoEmployeeDetails(int age);
}
