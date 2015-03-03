package com.sailendra.beanClasses;

public class PersonAddress
{
	private PermanentAddress perAdd;
	private PresentAddress preAdd;
	
	public PersonAddress(PermanentAddress perAdd, PresentAddress preAdd)
	{
		this.perAdd = perAdd;
		this.preAdd = preAdd;
	}
	
	public String displayPerAdd()
	{
		return perAdd.show();
	}
	public String displayPreAdd()
	{
		return preAdd.show();
	}
}
