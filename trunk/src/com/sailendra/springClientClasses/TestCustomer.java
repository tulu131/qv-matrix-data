package com.sailendra.springClientClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sailendra.beanClasses.Customer;

public class TestCustomer
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sailendra/springResources/Spring-Customer.xml");
		
		Customer cust = (Customer)context.getBean("CustomerBean");
		System.out.println(cust);
	}
}
