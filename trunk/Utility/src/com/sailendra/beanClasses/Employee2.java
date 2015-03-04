package com.sailendra.beanClasses;

/**
 * @author Sailendra.Jena
 *
 */
public class Employee2
{
	private int empId;
	private String empName;
	private String empAge;
	private String empEmailId;
	private long mobNo;
	private Address1 address1;
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpAge()
	{
		return empAge;
	}
	public void setEmpAge(String empAge)
	{
		this.empAge = empAge;
	}
	public String getEmpEmailId()
	{
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId)
	{
		this.empEmailId = empEmailId;
	}
	public long getMobNo()
	{
		return mobNo;
	}
	public void setMobNo(long mobNo)
	{
		this.mobNo = mobNo;
	}
	public Address1 getAddress1()
	{
		return address1;
	}
	public void setAddress1(Address1 address1)
	{
		this.address1 = address1;
	}
	
	public void displayEmpInfo()
	{
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Age: "+empAge);
		System.out.println("Employee Email Id: "+empEmailId);
		System.out.println("Employee Mobile Number: "+mobNo);
		System.out.println("Employee Address: ");
		System.out.println(address1);
	}
}
