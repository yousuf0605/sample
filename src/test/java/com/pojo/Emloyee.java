package com.pojo;

import java.util.List;

public class Emloyee {

	private String name;
	private String email;
	private long phoneNo;
	private List<EmpDetail> course;



	public Emloyee(String name, String email, long phoneNo, List<EmpDetail> detail) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.course = detail;
	}

	public List<EmpDetail> getCourse() {
		return course;
	}
	public void setCourse(List<EmpDetail> course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}









}
