package com.lara.beanClasses;

public class Person2
{
	private int pId;
	private String name;
	private int age;
	
	public Person2()
	{
		System.out.println("Calling from Person2 Default Constructor.......");
	}
	
	public Person2(int pId, String name, int age)
	{
		System.out.println("Calling from Person2 Class Constructor which is taking one argument as String.............");
		this.pId = pId;
		this.name = name;
		this.age = age;
		
	}

	
//	public void setPId(int pId)
//	{
//		System.out.println("Calling from setter method of pId of Person2 Class..........");
//		this.pId = pId;
//	}
//	
//	public int getPId()
//	{
//		System.out.println("Calling from getter method of pId of Person2 Class..........");
//		return pId;
//	}
	
	public int getpId()
	{
		System.out.println("Calling from getter method of pId of Person2 Class..........");
		return pId;
	}

	public void setpId(int pId)
	{
		System.out.println("Calling from setter method of pId of Person2 Class..........");
		this.pId = pId;
	}

	public void setName(String name)
	{
		System.out.println("Calling from setter method of name of Person2 Class.........");
		this.name = name;
	}
	
	public String getName()
	{
		System.out.println("Calling from getter method of name of Person2 Class.........");
		return name;
	}
	
	public void setAge(int age)
	{
		System.out.println("Calling from setter method of age of Person2 Class..........");
		this.age = age;
	}
	
	public int getAge()
	{
		System.out.println("Calling from getter method of age of Person2 Class........");
		return age;
	}
}
