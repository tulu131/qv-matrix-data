package com.sailendra.beanClasses;

public class Person2
{
	private int pId;
	private String name;
	private int age;
	private String emailId;
	private long mobNo;
	private Person2Address p2Add;
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
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
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
	public Person2Address getP2Add()
	{
		return p2Add;
	}
	public void setP2Add(Person2Address p2Add)
	{
		this.p2Add = p2Add;
	}
	
	public void displayInfo()
	{
		System.out.println("Person ID: "+pId);
		System.out.println("Person Name: "+name);
		System.out.println("Person Age: "+age);
		System.out.println("Person Email Id: "+emailId);
		System.out.println("Person Mobile Number: "+mobNo+"\n");
		System.out.println("Person Address: "+"\n"+p2Add.displayInfo());
	}
}
