package com.sailendra.beanClasseswithCollections;

import java.util.Iterator;
import java.util.List;

public class Questions
{
	private int id;
	private String name;
	private List<String> answers;
	
	public Questions()
	{
		System.out.println("Inside default constructor.....");
	}
	
	public Questions(int id, String name, List<String>answers)
	{
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayInfo()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		Iterator<String> it = answers.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

