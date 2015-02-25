package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasses.Person1;

/**
 * @author Sailendra.Jena
 *
 */
public class TestPerson1
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("com/sailendra/springResources/Spring-Person1.xml");
		BeanFactory fact = new XmlBeanFactory(resource);
		
		Person1 per = (Person1)fact.getBean("person1");
		per.displayInfo();
	}
}
