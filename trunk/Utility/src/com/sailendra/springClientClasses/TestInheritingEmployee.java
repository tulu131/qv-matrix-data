package com.sailendra.springClientClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sailendra.inheritingBeanClasses.Employee;

/**
 * @author Sailendra.Jena
 *
 */
public class TestInheritingEmployee
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sailendra/springResources/Spring-Customer.xml");
		Employee emp = (Employee)context.getBean("emp1");
		emp.show();
	}
}
