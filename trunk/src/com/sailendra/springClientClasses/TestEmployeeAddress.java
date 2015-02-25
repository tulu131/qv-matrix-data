package com.sailendra.springClientClasses;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sailendra.beanClasses.EmployeeAddress;

/**
 * @author Sailendra.Jena
 *
 */
public class TestEmployeeAddress
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		EmployeeAddress empAdd = (EmployeeAddress)factory.getBean("empAdd");
		
		empAdd.show();
	}
}
