package com.employee.directory.dao;

import java.util.List;

import com.employee.directory.entity.Employee;

public interface EmployeeDAO {

	List<Employee> findAll();
	Employee findById(int empId);
	Employee save(Employee employee);
	void deleteById(int empId);
}
