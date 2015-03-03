package com.sailendra.beanClasseswithCollections;

public class User
{
	private int id;
	private String name;
	private String email;
	
	public User()
	{
		System.out.println("Inside default Constructor....");
	}
	
	public User(int id, String name, String email)
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString()
	{
		return "Id: "+id+", "+"Name: "+name+", "+"Email Id: "+email+".";
	}
}
