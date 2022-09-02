package com.pojo;

public class EmpDetail {

	private String firstname;
	private String testdetails;
	private String location;


	public EmpDetail(String firstname, String testdetails, String location) {
		super();
		this.firstname = firstname;
		this.testdetails = testdetails;
		this.location = location;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getTestdetails() {
		return testdetails;
	}
	public void setTestdetails(String testdetails) {
		this.testdetails = testdetails;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}



}
