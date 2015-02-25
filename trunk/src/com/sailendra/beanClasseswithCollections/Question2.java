package com.sailendra.beanClasseswithCollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Sailendra.Jena
 *
 */
public class Question2
{
	private int id;
	private String name;
	private Map<Answer1, User> answers;
	
	public Question2()
	{
		System.out.println("Inside default Constructor....");
	}
	
	public Question2(int id, String name, Map<Answer1, User> answers)
	{
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayInfo()
	{
		System.out.println("Question's Id: "+id);
		System.out.println("question's Name: "+name);
		
		System.out.println("Question's Answers: ");
		
		Set<Entry<Answer1, User>> set = answers.entrySet();
		Iterator<Entry<Answer1, User>> it = set.iterator();
		
		while(it.hasNext())
		{
			Entry<Answer1, User> entry = it.next();
			Answer1 ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information: ");
			System.out.println(ans);
			System.out.println("Posted By: ");
			System.out.println(user);
		}
	}
}
