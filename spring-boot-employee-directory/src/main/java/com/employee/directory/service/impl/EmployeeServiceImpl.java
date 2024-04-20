package com.employee.directory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.directory.dao.EmployeeDAO;
import com.employee.directory.entity.Employee;
import com.employee.directory.service.EmployeeService;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int empId) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(empId);
	}

	@Transactional
	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.save(employee);
	}

	@Transactional
	@Override
	public void deleteById(int empId) {
		// TODO Auto-generated method stub
		Employee employee = employeeDAO.findById(empId);
		if(employee == null) {
			throw new RuntimeException("Employee Not Present, EmployeeId: "+empId);
		}
		employeeDAO.deleteById(empId);
		
	}

	
}
