package com.Spring.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Spring.Model.Employee;

import jakarta.persistence.EntityManager;
@Repository
public class EmployeeDaoImpl  implements EmployeeDao{

	@Autowired
	private EntityManager entityManager;
	@Override
	public Employee get(int id) {
		System.out.println("EmployeeDaoImpl called============================================================================");
		Session session=entityManager.unwrap(Session.class);
//		Query<Employee> query=session.createQuery("from Employee where id='"+id+"'",Employee.class);
//		Employee e=query.getSingleResult();
		System.out.println("==============================================================="+id);
		Employee e= session.get(Employee.class, id);
		System.out.println(e);
		return e;
	}
	@Override
	public Employee addEmployee(Employee e) {
		Session session1=entityManager.unwrap(Session.class);
		session1.save(e);
		return e;
	}
	
	@Override
	public void delete(int id) {
		Session session2=entityManager.unwrap(Session.class);
		Employee e =session2.get(Employee.class, id);
		session2.delete(e);
		
	}
	@Override
	public List<Employee> displayAll() {
		Session session4=entityManager.unwrap(Session.class);
		Query<Employee> query=session4.createQuery("from employee");
		List<Employee> lst=query.getResultList();
		return lst;
	}

}
