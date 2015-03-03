package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasses.Employee1;

public class TestEmployee1
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("com/sailendra/springResources/Spring-Employee1.xml");
		BeanFactory fact = new XmlBeanFactory(resource);
		
		Employee1 emp = (Employee1)fact.getBean("emp1");
		emp.display();
	}
}