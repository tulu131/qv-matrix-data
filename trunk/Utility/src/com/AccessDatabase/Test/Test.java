package com.AccessDatabase.Test;

import com.myAssets.utils.GmailUtil;
import com.myAssets.utils.PropOutUtil;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.myAssets.utils.FileUtil;
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
			List<String> mailAddressTo = FileUtil.getMailLists();
			message.setFrom(new InternetAddress(mailFrom));
			InternetAddress[] mailAddress_To = new InternetAddress[mailAddressTo.size()];
			
			for (int i = 0; i < mailAddressTo.size(); i++)
			{
				mailAddress_To[i] = new InternetAddress(mailAddressTo.get(i));
			}
			message.addRecipients(Message.RecipientType.TO, mailAddress_To);
			String subject = PropOutUtil.getValues("subjectLine");
			message.setSubject(subject);
			message.setText(messageBody);
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