package com.sailendra.beanClasses;

/**
 * @author Sailendra.Jena
 *
 */
public class Employee
{
	private String empName;
	private int empAge;
	private String empEmailId;
	
	public Employee()
	{
		System.out.println("inside Employee Default Constructor");
	}
	
	public Employee(String empName, int empAge, String empEmailId)
	{
		this.empName = empName;
		this.empAge = empAge;
		this.empEmailId = empEmailId;
	}
	
	public void show()
	{
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Age: "+empAge);
		System.out.println("Employee Email Id: "+empEmailId);
	}
}
