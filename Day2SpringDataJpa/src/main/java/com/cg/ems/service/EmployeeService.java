package com.cg.ems.service;

import java.util.List;

import com.cg.ems.entity.Employee;

public interface EmployeeService {

	public  List<Employee>   findAllEmployees();
	public  Employee   findEmployeeById(int employeeId);
	public  Employee  addEmployee(Employee employee);
	public  Employee  deleteEmployeeById(int employeeId);
}
