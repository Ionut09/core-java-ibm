package com.ibm._9_jdbc;

import java.time.LocalDate;

public class Singer {
	private long id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate; //10-05-1992
	
	public Singer() {
	}
	
	public Singer(long id, String firstName, String lastName, LocalDate birthDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Singer{" +
			       "id=" + id +
			       ", firstName='" + firstName + '\'' +
			       ", lastName='" + lastName + '\'' +
			       ", birthDate=" + birthDate +
			       '}';
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
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
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
