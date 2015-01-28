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
		final String username = PropUtil.getValues("username");
		final String password = PropUtil.getValues("password");
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", PropUtil.getValues("mail.smtp.auth"));
		props.put("mail.smtp.starttls.enable", PropUtil.getValues("mail.smtp.starttls.enable"));
		props.put("mail.smtp.host", PropUtil.getValues("mail.smtp.host"));
		props.put("mail.smtp.port", PropUtil.getValues("mail.smtp.port"));
		
		Session session = Session.getInstance(props, new Authenticator()
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
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(username));
			message.setSubject("Mail From Java Code.............");
			message.setText("Hi Sailendra, "+"\n\n"+"Actually this mail is coming from Java Code. So  Please don't reply on this mail......");
			
			Transport.send(message);
			
			System.out.println("Message Sent Successfully................");
		}
		catch(MessagingException ex)
		{
			ex.printStackTrace();
		}
	}
}
