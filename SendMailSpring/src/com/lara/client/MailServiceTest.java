package com.lara.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.lara.beanClasses.MailMail;


public class MailServiceTest
{
	public static void main(String[] args)
	{
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory b = new XmlBeanFactory(r);
		
		MailMail m = (MailMail)b.getBean("mailMail");
		String sender = "sailendra.n.jena@gmail.com";
		String reciever = "sailendra.n.jena@gmail.com";
		
		m.sendMail(sender, reciever, "Hi", "Welcome");
		
		System.out.println("Successfull");
	}
}
