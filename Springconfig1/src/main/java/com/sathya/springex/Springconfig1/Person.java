package com.sathya.springex.Springconfig1;

public class Person {
	private String name;
	private String email;
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
	public void personinfo()
	{
		System.out.println("Hey"+name+"Saritha");
		System.out.println("hey"+email+"sari@gmail.com");
		
		}
}
