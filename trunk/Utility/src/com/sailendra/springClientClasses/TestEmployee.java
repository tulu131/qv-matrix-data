package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasses.Employee;

/**
 * @author Sailendra.Jena
 *
 */
public class TestEmployee
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee emp = (Employee)factory.getBean("emp");
		
		emp.show();
	}
}