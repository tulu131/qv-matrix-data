package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasseswithCollections.Question;

/**
 * @author Sailendra.Jena
 *
 */
public class TestQuestion
{
	public static void main(String[] args)
	{
		Resource resource = new  ClassPathResource("com/sailendra/springResources/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Question question = (Question)factory.getBean("question");
		
		question.displayInfo();
	}
}
