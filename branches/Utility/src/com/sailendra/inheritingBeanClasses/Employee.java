package com.sailendra.inheritingBeanClasses;

public class Employee
{
	private int id;
	private String name;
	private String address;
	
	public Employee()
	{
		System.out.println("Inside default constructor..........");
	}
	
	public Employee(int id, String name, String address)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void show()
	{
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Address: "+address);
	}
}
