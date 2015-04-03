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
		System.out.println("Person Contact Numbers: "+p3.getMobNo());
		System.out.println("Person Educations: "+p3.getEducations());
		System.out.println("Person's Job: "+p3.getJobs());
		System.out.println("*********************************************************************");
		System.out.println("Person's Address Details");
		System.out.println("*********************************************************************");
		System.out.println("House No: "+p3.getAdd().getHouseNo());
		System.out.println("Street Name: "+p3.getAdd().getStreetName());
		System.out.println("City Name: "+p3.getAdd().getCityName());
		System.out.println("District Name: "+p3.getAdd().getDistName());
		System.out.println("State Name: "+p3.getAdd().getStateName());
		System.out.println("Country Name: "+p3.getAdd().getCountryName());
		System.out.println("Pin No: "+p3.getAdd().getPinNo());
		System.out.println("*********************************************************************");
	}
}
