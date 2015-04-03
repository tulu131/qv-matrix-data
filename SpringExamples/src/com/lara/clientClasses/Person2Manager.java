package com.lara.clientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beanClasses.Person2;

public class Person2Manager
{
	public static void main(String[] args)
	{
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lara/resources/beans.xml"));
		System.out.println("Bean Factory got initialized.........");
		
		Person2 p2 = (Person2)factory.getBean("p2");
		Person2 p3 = (Person2)factory.getBean("p2");
		System.out.println("Person2 class object data retrieve from IOC Container...........");
		
		System.out.println(p2.getpId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		System.out.println(p2 == p3);
		System.out.println(p2.equals(p3));
		
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}
}
