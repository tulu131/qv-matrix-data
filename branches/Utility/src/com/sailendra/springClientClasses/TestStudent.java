package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasses.Student;

public class TestStudent
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student std = (Student)factory.getBean("studentbean");
		std.displayInfo();
	}
}
