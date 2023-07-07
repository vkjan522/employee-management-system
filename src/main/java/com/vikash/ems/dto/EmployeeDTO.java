package com.vikash.ems.dto;

public class EmployeeDTO {
	private long userId;
	private String firstName;
	private String lastName;
	private String employeeEmail;

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(long userId, String firstName, String lastName, String employeeEmail) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeEmail = employeeEmail;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", employeeEmail=" + employeeEmail + "]";
	}

}
