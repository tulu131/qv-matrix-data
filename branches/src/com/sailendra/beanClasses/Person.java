package com.sailendra.beanClasses;

public class Person
{
	private int pId;
	private String perName;
	private String perAge;
	private String perEmailId;
	private long mobNo;
	private PersonAddress personAdd;
	
	public Person(int pId, String perName, String perAge, String perEmailId, long mobNo, PersonAddress perAdd)
	{
		this.pId = pId;
		this.perName = perName;
		this.perAge = perAge;
		this.perEmailId = perEmailId;
		this.mobNo = mobNo;
		this.personAdd = perAdd;
	}
	
	public void dispplayInfo()
	{
		System.out.println("Person Id: "+pId);
		System.out.println("Person Name: "+perName);
		System.out.println("Person Age: "+perAge);
		System.out.println("Person Email Id: "+perEmailId);
		System.out.println("Person Contact Info: "+mobNo);
		System.out.println("Person Permanent Address Details: "+personAdd.displayPerAdd());
		System.out.println("Person Present Address Details: "+personAdd.displayPreAdd());
	}
}
