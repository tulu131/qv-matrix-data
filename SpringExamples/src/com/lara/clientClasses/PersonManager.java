package com.lara.clientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lara.beanClasses.Person;

public class PersonManager
{
	public static void main(String[] args)
	{
//		Person p = new Person();
//		p.setpId(100);
//		p.setName("Sailendra Narayan Jena");
//		p.setAge(32);
//		p.setEmailId("sailendra.n.jena@gmail.com");
//		
//		System.out.println(p.getpId());
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		System.out.println(p.getEmailId());
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lara/resources/beans.xml"));
		
		Person p = (Person)factory.getBean("p");
		
		System.out.println(p.getpId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getEmailId());
	}
}
