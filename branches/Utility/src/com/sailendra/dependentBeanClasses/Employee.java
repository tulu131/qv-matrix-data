package com.sailendra.dependentBeanClasses;

public class Employee
{
	private int id;
	private String name;
	private Address address;
	
	public Employee()
	{
		System.out.println("Inside Default Constructor...");
	}
	
	public Employee(int id, String name, Address address)
	{
		super();
		this.name = name;
		this.address = address;
	}
	
	public void show()
	{
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Address: "+address.toString());
	}
}
