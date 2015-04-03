package com.lara.beanClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class Person3
{
	private int pId;
	private String firstName;
	private String lastName;
	private int age;
	private HashSet mailId;
	private ArrayList mobNo;
	private HashMap educations;
	private Address add;
	private Properties jobs;

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
	public HashSet getMailId()
	{
		return mailId;
	}
	public void setMailId(HashSet mailId)
	{
		this.mailId = mailId;
	}
	public ArrayList getMobNo()
	{
		return mobNo;
	}
	public void setMobNo(ArrayList mobNo)
	{
		this.mobNo = mobNo;
	}
	public HashMap getEducations()
	{
		return educations;
	}
	public void setEducations(HashMap educations)
	{
		this.educations = educations;
	}
	public Address getAdd()
	{
		return add;
	}
	public void setAdd(Address add)
	{
		this.add = add;
	}
	public Properties getJobs()
	{
		return jobs;
	}
	public void setJobs(Properties jobs)
	{
		this.jobs = jobs;
	}
}
