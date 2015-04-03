package com.lara.clientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beanClasses.Person1;

public class Person1Manager
{
	public static void main(String[] args)
	{
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lara/resources/beans.xml"));
		
		Person1 p1 = (Person1)factory.getBean("p1");
//		System.out.println("****************************************************************** ");
//		System.out.println("Person Detail Information");
//		System.out.println("****************************************************************** ");
//		System.out.println(p1.getpId());
//		System.out.println(p1.getFirstName());
//		System.out.println(p1.getLastName());
//		System.out.println(p1.getAge());
//		System.out.println(p1.getMailId());
//		System.out.println(p1.getPresentAdd());
//		System.out.println(p1.getPerAdd());
//		System.out.println(p1.getMobNo());
//		System.out.println("****************************************************************** ");
		
		System.out.println("****************************************************************** ");
		System.out.println("Person Detail Information");
		System.out.println("****************************************************************** ");
		System.out.println("Person ID: "+p1.getpId());
		System.out.println("Person Name: "+p1.getFirstName()+" "+p1.getLastName());
		System.out.println("Person Age: "+p1.getAge());
		System.out.println("Person Email Id: "+p1.getMailId());
		System.out.println("Person Pressent Address: "+p1.getPresentAdd());
		System.out.println("Person Permanent Address: "+p1.getPerAdd());
		System.out.println("Person Mobile Number: "+p1.getMobNo());
		System.out.println("****************************************************************** ");

	}
}
