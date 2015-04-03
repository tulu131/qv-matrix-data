package com.lara.clientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beanClasses.Person3;

public class Person3Manager
{
	public static void main(String[] args)
	{
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lara/resources/beans.xml"));
		
		Person3 p3 = (Person3)factory.getBean("p3");
		
		System.out.println("*********************************************************************");
		System.out.println("Person Details");
		System.out.println("*********************************************************************");
		System.out.println("Person Id: "+p3.getpId());
		System.out.println("Person First Name: "+p3.getFirstName());
		System.out.println("Person Last Name: "+p3.getLastName());
		System.out.println("Person Age: "+p3.getAge());
		System.out.println("Person Mail Id: "+p3.getMailId());
		System.out.println();
		System.out.println("*********************************************************************");
	}
}
