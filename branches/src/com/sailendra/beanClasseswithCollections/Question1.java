package com.sailendra.beanClasseswithCollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question1
{
	private int id;
	private String name;
	private Map<String, String> answers;
	
	public Question1()
	{
		System.out.println("Inside default Constructor.........");
	}
	
	public Question1(int id, String name, Map<String, String> answers)
	{
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayInfo()
	{
		System.out.println("Question's Id: "+id);
		System.out.println("Question's Name: "+name);
		
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext())
		{
			Entry<String, String>entry = it.next();
			System.out.println("Answers: "+entry.getKey()+"Posted By: "+entry.getValue());
		}
	}
}
