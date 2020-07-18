package com.gsp.entities;

public class Person {

	private int pno;
	private String firstName;
	private String lastName;
	public Person(int pno, String firstName, String lastName) {
		super();
		this.pno = pno;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
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
	@Override
	public String toString() {
		return "Person [pno=" + pno + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
