package com.myAssets.utils;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.URLName;

import com.sun.mail.pop3.POP3SSLStore;

public class GmailUtil
{
	private static Session session = null;
	private static Store store = null;
	private static String username = PropUtil.getValues("username");
	private static String password = PropUtil.getValues("password");
	private static Folder folder;
	private static String host = PropUtil.getValues("host");
	private static String storeType = PropUtil.getValues("mailStoreType");
	private static Properties props = null;
	private static Message message = null;
	
	//Getting Gmail Connection using this below method.
	public static void connection()
	{
		String socketFactory = "javax.net.ssl.SSLSocketFactory";
		
		Properties pop3Props = new Properties();
		
		pop3Props.setProperty("mail.pop3.socketFactory.class", socketFactory);
		pop3Props.setProperty("mail.pop3.socketFactory.fallback", "false");
		pop3Props.setProperty("mail.pop3.port", "995");
		pop3Props.setProperty("mail.pop3.socketFactory.port", "995");
		
		URLName url = new URLName("pop3", "pop.gmail.com", 995, "", username, password);
		
		session = Session.getInstance(pop3Props, null);
		store = new POP3SSLStore(session, url);
		
		try
		{
			store.connect();
			System.out.println("Gmail Connection Successfull...........");
		}
		catch(MessagingException ex)
		{
			ex.printStackTrace();
		}
	}
	
	//Opening particular folder which user want to open inside Gmail Account.
	public static void openFolder(String folderName)
	{
		try
		{
			folder = store.getDefaultFolder();
			folder = folder.getFolder(folderName);
			
			if (folder == null)
			{
				throw new Exception("Invalid Folder Name.");
			}
			
			folder.open(folder.READ_WRITE);
			System.out.println("Folder is open Successfully........");
		} 
		catch (MessagingException ex)
		{
			ex.printStackTrace();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	public static void readMail(String username, String password, String folderName)
	{
		try
		{
			props = new Properties();
			props.put("mail.pop3.host", host);
			props.put("mail.pop3.port", "995");
			props.put("mail.pop3.starttls.enable", "true");
			
			
			session = Session.getDefaultInstance(props);
			System.out.println(session);
			store = session.getStore(storeType);
			store.connect(host, username, password);
			
			folder = store.getFolder(folderName);
			folder.open(Folder.READ_ONLY);
			
			Message[] messages = folder.getMessages();
			System.out.println("Message.length---"+messages.length);
			
			for (int i = 0; i < messages.length; i++)
			{
				message = messages[i];
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Email No: "+(i+1));
				System.out.println("Subject: "+message.getSubject());
				System.out.println("From: "+message.getFrom());
				System.out.println("Text: "+message.getContent().toString());
			}
			
			//Close Store and Folder Reesources
			folder.close(false);
			store.close();
		}
		catch(NoSuchProviderException ex)
		{
			ex.printStackTrace();
		}
		catch(MessagingException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	//Closing Folder which is already opened by User.
	public static void closeFolder()
	{
		try
		{
			folder.close(false);
			System.out.println("All Gmail Folder got closed Successfully...........");
		}
		catch (MessagingException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void disconnectGmailAcount()
	{
		try
		{
			store.close();
			System.out.println("Gmail Account Disconnect Successfully.......");
		} 
		catch (MessagingException ex)
		{
			ex.printStackTrace();
		}
	}
	
	
}
