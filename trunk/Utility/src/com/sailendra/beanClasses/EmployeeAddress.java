package com.sailendra.beanClasses;

/**
 * @author Sailendra.Jena
 *
 */
public class EmployeeAddress
{
	private String empName;
	private String empAge;
	private String empEmailId;
	private Address address;
	
	public EmployeeAddress()
	{
		System.out.println("This is EmployeeAddress default Constructor.........");
	}
	
	public EmployeeAddress(String empName, String empAge, String empEmailId, Address address)
	{
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empEmailId = empEmailId;
		this.address = address;
	}
	
	public void show()
	{
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Age: "+empAge);
		System.out.println("Employee Email Id: "+empEmailId);
		System.out.println("Employee Address: "+address.toString());
	}
}
