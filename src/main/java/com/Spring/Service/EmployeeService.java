package com.Spring.Service;

import java.util.List;

import com.Spring.Model.Employee;

public interface EmployeeService {
	Employee get(int id);
	Employee addEmployee(Employee e);
	void delete(int id);
	List<Employee> displayAll();
//	void updateEmployee(int id);
//	void deleteEmployee(int id);
//	void displayEmployee(int id);
//	void displayAllEmployee(List<Employee> lst);
	

}
