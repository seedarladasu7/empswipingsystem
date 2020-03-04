package com.system.swiping.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.swiping.employee.dao.EmployeeDAO;
import com.system.swiping.employee.entity.EmpSwipeRequest;
import com.system.swiping.employee.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeDAO empDAO;
	
	@GetMapping("getEmployee/{empId}")
	public Employee  getEmployeeDetails(@PathVariable int empId) {
		return empDAO.getEmployee(empId);
	}
	
	@PostMapping("/swipe")
	public void saveEmployeeSwipeInfo(@RequestBody EmpSwipeRequest request) {
		String emptyStr = "";
		Employee emp = new Employee();
		emp.setEmpId(request.getEmpId());
		emp.setEmpName(request.getEmpName());
		
		emp.setSwipeIn(emptyStr);
		emp.setSwipeOut(emptyStr);
		
		if(request.getSwipingType().equalsIgnoreCase("IN")) {
			emp.setSwipeIn(request.getSwipeIn());
		} else if(request.getSwipingType().equalsIgnoreCase("OUT")) {
			emp.setSwipeOut(request.getSwipeOut());
		}
		
		emp.setDate(request.getDate());
		emp.setLocation(request.getLocation());
		
		empDAO.saveEmpData(emp);
	}

}
