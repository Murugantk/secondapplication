package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/addEmployee")
	public Employee saveEmp(@RequestBody  Employee emp) {
		return  employeeService.addEmployee(emp);
	}
	
	@GetMapping("/getEmployee/{empID}")
	public Optional<Employee> getEmployee(@RequestParam int empId) {
		return employeeService.getEmployee(empId);
	}
	
	
	@GetMapping("/getEmpAll")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@PutMapping("update/{id}")
	public String employeeUpdate(@PathVariable int id, @RequestBody Employee employee) {
		return employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/del/{id}")
	public String delEmp(int empId) {
		
		return employeeService.employeeRemove(empId);
	}
	
	@GetMapping("/getempByName/{name}")
	public List<Employee> getMethodName(@RequestParam String name) {
		return employeeService.getByName(name);
	}
	
	@GetMapping("/getempDTOByAge/{age}")
	public List<EmployeeDTO> getMethodName(@RequestParam int age) {
		return employeeService.getDtoEmployeeDetails(age);
	}
	
}
