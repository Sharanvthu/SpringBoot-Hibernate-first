package com.Spring.DAO;



import java.util.List;

import com.Spring.Model.Employee;

public interface EmployeeDao {

	Employee addEmployee(Employee e);
	Employee get(int id);
	void delete(int id);
	List<Employee> displayAll();
}
