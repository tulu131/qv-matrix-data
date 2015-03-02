package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasseswithCollections.Questions;

/**
 * @author Sailendra.Jena
 *
 */
public class TestQuestions
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("com/sailendra/springResources/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Questions ques = (Questions)factory.getBean("q");
		
		ques.displayInfo();
	}
}
