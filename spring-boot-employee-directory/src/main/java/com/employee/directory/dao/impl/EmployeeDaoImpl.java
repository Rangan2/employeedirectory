package com.employee.directory.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.directory.dao.EmployeeDAO;
import com.employee.directory.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Employee> empQuery = entityManager.createQuery("from Employee", Employee.class);
		List<Employee> employees = empQuery.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int empId) {
		// TODO Auto-generated method stub
		return entityManager.find(Employee.class, empId);
	}

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return entityManager.merge(employee);
	}

	@Override
	public void deleteById(int empId) {
		// TODO Auto-generated method stub
		Employee employeeToBeDeleted = entityManager.find(Employee.class, empId);
		entityManager.remove(employeeToBeDeleted);
	}

}
