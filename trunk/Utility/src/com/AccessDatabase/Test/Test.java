package com.AccessDatabase.Test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.myAssets.utils.GmailUtil;
import com.myAssets.utils.PropOutUtil;
import com.myAssets.utils.PropUtil;


/**
 * @author Sailendra.Jena
 *
 */
public class Test
{
	
	public static boolean send(String messageBody)
	{
		boolean status = false;
		String username = PropUtil.getValues("username");
		String password = PropUtil.getValues("password");
		try
		{
			Properties props = System.getProperties();
			String host_name = PropUtil.getValues("smtpHostValues");
			props.put("mail.smtp.host", host_name);
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.port", "587");
			
			Session session = GmailUtil.getSession(props, username, password);
			MimeMessage message = new MimeMessage(session);
			
			String mailFrom = PropUtil.getValues("username");
			String mailTo = PropUtil.getValues("username");
			String[] mailAddressTo = {"sailendra.narayan.jena@gmail.com", "sailendra.jena@niit-tech.com"};
			message.setFrom(new InternetAddress(mailFrom));
			InternetAddress[] mailAddress_To = new InternetAddress[mailAddressTo.length];
			
			for (int i = 0; i < mailAddressTo.length; i++)
			{
				mailAddress_To[i] = new InternetAddress(mailAddressTo[i]);
			}
			message.addRecipients(Message.RecipientType.TO, mailAddress_To);
			String subject = PropOutUtil.getValues("subjectLine");
			message.setSubject(subject);
			message.setContent(messageBody, "text/html");
			Transport.send(message);
			status = true;
		}
		catch(SendFailedException ex)
		{
			ex.printStackTrace();
		}
		catch(MessagingException ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
	
	public static void main(String[] args) 
	{
		String messageBody = PropOutUtil.getValues("contentLine");
		boolean status = send(messageBody);
		
		System.out.println(status);
	}
}