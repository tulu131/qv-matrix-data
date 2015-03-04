package com.sailendra.beanClasses;

/**
 * @author Sailendra.Jena
 *
 */
public class Person1
{
	private int pId;
	private String name;
	private String age;
	private String emailId;
	private long mobNo;
	private long pinNo;

	public int getpId()
	{
		return pId;
	}
	public void setpId(int pId)
	{
		this.pId = pId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAge()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public String getEmailId()
	{
		return emailId;
	}
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	public long getMobNo()
	{
		return mobNo;
	}
	public void setMobNo(long mobNo)
	{
		this.mobNo = mobNo;
	}
	public long getPinNo()
	{
		return pinNo;
	}
	public void setPinNo(long pinNo)
	{
		this.pinNo = pinNo;
	}
	
	public void displayInfo()
	{
		System.out.println("Person Id: "+pId);
		System.out.println("Person Name: "+name);
		System.out.println("Person Age: "+age);
		System.out.println("Person Mobile Number: "+mobNo);
		System.out.println("Person Email Id: "+emailId);
		System.out.println("Person Pin Number: "+pinNo);
	}
}
