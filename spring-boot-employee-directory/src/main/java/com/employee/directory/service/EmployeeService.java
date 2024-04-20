package com.employee.directory.service;

import java.util.List;

import com.employee.directory.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	Employee findById(int empId);
	Employee save(Employee employee);
	void deleteById(int empId);
}
