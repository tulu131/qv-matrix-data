package com.lara.beanClasses;

import java.util.ArrayList;
@SuppressWarnings("rawtypes")
public class Person4
{
	private int pId;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private ArrayList mailId;
	private long mobNo;
	private Address1 add;

	public int getpId()
	{
		return pId;
	}
	public void setpId(int pId)
	{
		this.pId = pId;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public ArrayList getMailId()
	{
		return mailId;
	}
	public void setMailId(ArrayList mailId)
	{
		this.mailId = mailId;
	}
	public long getMobNo()
	{
		return mobNo;
	}
	public void setMobNo(long mobNo)
	{
		this.mobNo = mobNo;
	}
	public Address1 getAdd()
	{
		return add;
	}
	public void setAdd(Address1 add)
	{
		this.add = add;
	}
}
