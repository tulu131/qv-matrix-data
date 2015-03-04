package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasses.Person;

/**
 * @author Sailendra.Jena
 *
 */
public class TestPerson
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Person per = (Person)factory.getBean("person");
		per.dispplayInfo();
	}
}
