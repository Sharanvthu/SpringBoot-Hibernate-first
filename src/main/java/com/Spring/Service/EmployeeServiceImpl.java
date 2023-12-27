package com.Spring.Service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.DAO.EmployeeDao;

import com.Spring.Model.Employee;

import jakarta.persistence.EntityManager;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	 private EmployeeDao dao;
@Transactional
@Override
public Employee get(int id) {
	System.out.println("EmployeeServiceImple is called==================================================================== ");
	return dao.get(id);
}
@Transactional
@Override
public Employee addEmployee(Employee e) {
	return dao.addEmployee(e);
}
@Transactional
@Override
public void delete(int id) {
	 dao.delete(id);
	
}
@Override
public List<Employee> displayAll() {
	
	return dao.displayAll();
}


//	@Override
//	public void saveEmployee( Employee e) {
//	System.out.println("Testing" +e);
//
//		repo.save(e);
//	}

//	@Override
//	public void updateEmployee(int id) {
//		repo.save(e);
//	}
//
//	@Override
//	public void deleteEmployee(int id) {
//		
//	}
//
//	@Override
//	public void displayEmployee(int id) {
//		
//	}
//
//	@Override
//	public void displayAllEmployee(List<Employee> lst) {
//		
//	}

}
