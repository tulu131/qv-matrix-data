package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasses.Person2;

/**
 * @author Sailendra.Jena
 *
 */
public class TestPerson2
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("com/sailendra/springResources/Spring-Person2.xml");
		BeanFactory fact = new XmlBeanFactory(resource);
		
		Person2 per = (Person2)fact.getBean("person2");
		per.displayInfo();
	}
}
