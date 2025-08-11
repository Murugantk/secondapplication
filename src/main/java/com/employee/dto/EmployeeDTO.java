package com.employee.dto;

public class EmployeeDTO {
	
	private String employeeName;
	private String employeeAddress;
	private int age;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeDTO(String employeeName, String employeeAddress, int age) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.age = age;
	}
	
	

}
