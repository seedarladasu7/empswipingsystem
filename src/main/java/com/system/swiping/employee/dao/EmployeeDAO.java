package com.system.swiping.employee.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.system.swiping.employee.entity.Employee;

@Repository
public class EmployeeDAO {

	public void saveEmpData(Employee emp) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
	}
	
	public Employee getEmployee(int empId) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Employee emp = session.load(Employee.class, empId);
		return emp;
	}

}
