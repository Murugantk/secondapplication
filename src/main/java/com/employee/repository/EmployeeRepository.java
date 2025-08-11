package com.employee.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.dto.EmployeeDTO;
import com.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByEmployeeName(String name);
	List<Employee> findByEmployeeNameContains(String name);
	List<Employee> findByEmployeeNameContainsOrderByEmployeeName(String name);
	List<Employee> findByEmployeeNameAndAge(String name,int a);
	List<Employee> findByEmployeeNameOrAge(String name, int a);
	List<Employee> findByEmployeeNameContainsOrderByAge(String name,Pageable page);
	@Query("from Employee where employeeName=:name")
	List<Employee> findByOwnQuery(String name);
	List<EmployeeDTO>findByAge(int age);
	
	
	//07/10/2025
	
}
