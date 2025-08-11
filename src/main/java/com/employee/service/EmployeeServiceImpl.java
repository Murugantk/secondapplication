package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> getEmployee(int empID) {
		return employeeRepository.findById(empID);
		}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public String updateEmployee(int empId, Employee employee) {
		 Optional<Employee> optEmployee=employeeRepository.findById(empId);
		if(optEmployee.isPresent()) {
			Employee exitEmployee=optEmployee.get();
			exitEmployee.setAge(employee.getAge());
			exitEmployee.setEmployeeAddress(employee.getEmployeeAddress());
			exitEmployee.setEmployeeName(employee.getEmployeeName());
			exitEmployee.setSalary(employee.getSalary());
			employeeRepository.save(exitEmployee);
			 return "Employee updated";
		}
		return "Employee not found";
	}

	@Override
	public String employeeRemove(int empId) {
		employeeRepository.deleteById(empId);
		return "Employee details deleted";
	}

	@Override
	public List<Employee> getByName(String name) {
		return employeeRepository.findByEmployeeNameContainsOrderByEmployeeName(name);
	}

	@Override
	public List<EmployeeDTO> getDtoEmployeeDetails(int age) {
		
		return employeeRepository.findByAge(age);
	}

}
