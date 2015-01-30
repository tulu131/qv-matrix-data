package com.AccessDatabase.Test;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.myAssets.utils.PropUtil;


public class Test
{
	public static void main(String[] args)
	{
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		
		final String username = PropUtil.getValues("username");
		final String password = PropUtil.getValues("password");
		
		Session session = Session.getDefaultInstance(props, new Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(username, password);
			}
		});
		
		try
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("sailendra.jena@niit-tech.com"));
			message.setSubject("This Mail is coming from Java Code");
			message.setText("Hi Sailendra, "+"\n\n"+"This mail is comiing from Java Code. Please don't reply on this mail.");
			
			Transport.send(message);
			System.out.println("Message sent Successfully.........");
		}
		catch(MessagingException ex)
		{
			ex.printStackTrace();
		}
	}
}