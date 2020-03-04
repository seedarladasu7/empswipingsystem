package com.system.swiping.employee.entity;

import java.util.Date;

public class EmpSwipeRequest {
	
	private Integer empId;
	private String empName;
	private String swipeIn;
	private String swipeOut;
	private Date Date;
	private String location;
	private String swipingType;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSwipeIn() {
		return swipeIn;
	}
	public void setSwipeIn(String swipeIn) {
		this.swipeIn = swipeIn;
	}
	public String getSwipeOut() {
		return swipeOut;
	}
	public void setSwipeOut(String swipeOut) {
		this.swipeOut = swipeOut;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSwipingType() {
		return swipingType;
	}
	public void setSwipingType(String swipingType) {
		this.swipingType = swipingType;
	}

	
}
