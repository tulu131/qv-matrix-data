package com.lara.clientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beanClasses.Person4;

public class Person4Manager
{
	public static void main(String[] args)
	{
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lara/resources/beans.xml"));
		
		Person4 p4 = (Person4)factory.getBean("p4");
		
		System.out.println("******************************************************************************");
		System.out.println("Person Details");
		System.out.println("******************************************************************************");
		System.out.println("Id: "+p4.getpId());
		System.out.println("Name: "+p4.getFirstName()+" "+p4.getMiddleName()+" "+p4.getLastName());
		System.out.println("Age: "+p4.getAge());
		System.out.println("Mail Id: "+p4.getMailId());
		System.out.println("Mobile Number: "+p4.getMobNo());
		System.out.println("******************************************************************************");
		System.out.println("Person Permanent Address Details");
		System.out.println("******************************************************************************");
		System.out.println(p4.getAdd().getPerAdd().getHouseNo());
		System.out.println(p4.getAdd().getPerAdd().getStreetName());
		System.out.println(p4.getAdd().getPerAdd().getCityName());
		System.out.println(p4.getAdd().getPerAdd().getDistName());
		System.out.println(p4.getAdd().getPerAdd().getStateName());
		System.out.println(p4.getAdd().getPerAdd().getCountryName());
		System.out.println(p4.getAdd().getPerAdd().getPinNo());
		System.out.println("******************************************************************************");
		System.out.println("Person Present Address Details");
		System.out.println("******************************************************************************");
		System.out.println(p4.getAdd().getPreAdd().getHouseNo());
		System.out.println(p4.getAdd().getPreAdd().getStreetName());
		System.out.println(p4.getAdd().getPreAdd().getCityName());
		System.out.println(p4.getAdd().getPreAdd().getLandMark());
		System.out.println(p4.getAdd().getPreAdd().getStateName());
		System.out.println(p4.getAdd().getPreAdd().getCountryName());
		System.out.println(p4.getAdd().getPreAdd().getPinNo());
		System.out.println("******************************************************************************");
	}
}
