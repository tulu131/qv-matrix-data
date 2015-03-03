package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.dependentBeanClasses.Employee;

public class TestEmployeeDepedentObject
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("com/sailendra/springResources/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee emp = (Employee)factory.getBean("employee");
		emp.show();
	}
}
