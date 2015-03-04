package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasseswithCollections.Question2;

/**
 * @author Sailendra.Jena
 *
 */
public class TestQuestion2
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("com/sailendra/springResources/applicationContext.xml");
		BeanFactory fact = new XmlBeanFactory(resource);
		
		Question2 ques = (Question2)fact.getBean("q");
		
		ques.displayInfo();
	}
}
