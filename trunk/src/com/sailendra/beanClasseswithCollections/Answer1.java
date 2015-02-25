package com.sailendra.beanClasseswithCollections;

import java.util.Date;

/**
 * @author Sailendra.Jena
 *
 */
public class Answer1
{
	private int id;
	private String answer;
	private Date postedDate;
	
	public Answer1()
	{
		System.out.println("Inside default Constructor...");
	}
	
	public Answer1(int id, String answer, Date postedDate)
	{
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}
	
	@Override
	public String toString()
	{
		return "Id: "+id+", "+"Answer: "+answer+", "+"Posted Date: "+postedDate+".";
	}
}
