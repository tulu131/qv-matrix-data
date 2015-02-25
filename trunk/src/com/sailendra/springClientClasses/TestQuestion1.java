package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasseswithCollections.Question1;

/**
 * @author Sailendra.Jena
 *
 */
public class TestQuestion1
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("com/sailendra/springResources/applicationContext.xml");
		BeanFactory fact = new XmlBeanFactory(resource);
		
		Question1 ques = (Question1)fact.getBean("ques");
		
		ques.displayInfo();
	}
}
