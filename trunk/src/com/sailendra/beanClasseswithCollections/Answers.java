package com.sailendra.beanClasseswithCollections;

/**
 * @author Sailendra.Jena
 *
 */
public class Answers
{
	private int id;
	private String name;
	private String by;
	
	public Answers()
	{
		System.out.println("Inside default constructor.....");
	}
	
	public Answers(int id, String name, String by)
	{
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}
	
	@Override
	public String toString()
	{
		return id+", "+name+", "+by;
	}
}
