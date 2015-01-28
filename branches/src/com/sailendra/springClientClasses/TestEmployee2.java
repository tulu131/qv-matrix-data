package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasses.Employee2;

public class TestEmployee2
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("com/sailendra/springResources/Spring-Employee2.xml");
		BeanFactory fact = new XmlBeanFactory(resource);
		
		Employee2 emp = (Employee2)fact.getBean("emp2");
		
		emp.displayEmpInfo();
	}
}
