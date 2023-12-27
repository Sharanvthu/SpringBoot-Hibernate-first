package com.Spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Model.Employee;
import com.Spring.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/emp/{id}")
	public Employee get(@PathVariable int id )
	{
		return employeeService.get(id);
		
	}

	@PostMapping("/add")
	public Employee save(@RequestBody Employee e)
	{
		return employeeService.addEmployee(e);
	}
	
	@PostMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		 employeeService.delete(id);
	}
	
	@GetMapping("/all")
	public List<Employee> get()
	{
		return employeeService.displayAll();
		
	}
}
