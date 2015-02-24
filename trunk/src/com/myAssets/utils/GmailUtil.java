package com.myAssets.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.URLName;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.pop3.POP3SSLStore;

/**
 * @author Sailendra.Jena
 *
 */
public class GmailUtil
{
	
	//SMTP Details
	private static final String smtpAuthValues = PropUtil.getValues("smtpAuthValues");
	private static final String smtpStarttlsValues = PropUtil.getValues("smtpStarttlsValues");
	private static final String smtpHostValues = PropUtil.getValues("smtpHostValues");
	private static final String smtpPortValues = PropUtil.getValues("smtpPortValues");
	
	private static final String smtpAuthKey =PropUtil.getValues( "smtpAuthKey");
	private static final String smtpStarttlsKey = PropUtil.getValues("smtpStarttlsKey");
	private static final String smtpHostKey =PropUtil.getValues("smtpHostKey");
	private static final String smtpPortKey = PropUtil.getValues("smtpPortKey");

	
	//SSL Details
	private static final String sslHostValues = PropUtil.getValues("sslHostValues");
	private static final String sslSocketFactoryPortValues = PropUtil.getValues("sslSocketFactoryPortValues");
	private static final String sslSocketFactoryClassValues = PropUtil.getValues("sslSocketFactoryClassValues");
	private static final String sslAuthValues = smtpAuthValues;
	private static final String sslPortValues = PropUtil.getValues("sslPortValues");
	
	private static final String sslHostKey = smtpHostKey;
	private static final String sslSocketFactoryPortKey = PropUtil.getValues("sslSocketFactoryPortKey");
	private static final String sslSocketFactoryClassKey = PropUtil.getValues("sslSocketFactoryClassKey");
	private static final String sslAuthKey = smtpAuthKey;
	private static final String sslPortKey = smtpPortKey;
	

	//POP3 Mail Connection Details
	private static Session session = null;
	private static Store store = null;
	private static String username = PropUtil.getValues("username");
	private static String password = PropUtil.getValues("password");
	private static Folder folder;
	private static String host = PropUtil.getValues("host");
	private static String storeType = PropUtil.getValues("mailStoreType");
	private static Properties props = null;
	private static Message message = null;
	
	private static final String pop3MailSocketfactoryClassKey = PropUtil.getValues("pop3MailSocketfactoryClassKey");
	private static final String pop3MailSocketFactoryFallbackKey = PropUtil.getValues("pop3MailSocketFactoryFallbackKey");
	private static final String pop3MailPortKey = PropUtil.getValues("pop3MailPortKey");
	private static final String pop3MailSocketFactoryPortKey = PropUtil.getValues("pop3MailSocketFactoryPortKey");
	private static final String pop3HostKey = PropUtil.getValues("pop3HostKey");
	private static final String pop3PortKey = PropUtil.getValues("pop3PortKey");
	private static final String pop3StarttlsKey = PropUtil.getValues("pop3StarttlsKey");
	
	private static final String pop3SocketFactoryClassValues = sslSocketFactoryClassValues;
	private static final String pop3MailSocketFactoryFallbackValues = PropUtil.getValues("pop3MailSocketFactoryFallbackValues");
	private static final String pop3MailPortValues = PropUtil.getValues("pop3MailPortValues");
	private static final String pop3MailSocketFactoryPortValues = PropUtil.getValues("pop3MailSocketFactoryPortValues");
	private static final String pop3HostValue = host;
	private static final String pop3PortValue = pop3MailPortValues;
	private static final String pop3StarttlsValue = PropUtil.getValues("pop3StarttlsValue");
	
	//Getting Gmail Connection using this below method.
	public static void connection()
	{
		
		
		Properties pop3Props = new Properties();
		
		pop3Props.setProperty(pop3MailSocketfactoryClassKey, pop3SocketFactoryClassValues);
		pop3Props.setProperty(pop3MailSocketFactoryFallbackKey, pop3MailSocketFactoryFallbackValues);
		pop3Props.setProperty(pop3MailPortKey, pop3MailPortValues);
		pop3Props.setProperty(pop3MailSocketFactoryPortKey, pop3MailSocketFactoryPortValues);
		
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
	
	public static void getMailConnetion(String username, String password)
	{
		Properties pop3Props = new Properties();
		
		pop3Props.setProperty(pop3MailSocketfactoryClassKey, pop3SocketFactoryClassValues);
		pop3Props.setProperty(pop3MailSocketFactoryFallbackKey, pop3MailSocketFactoryFallbackValues);
		pop3Props.setProperty(pop3MailPortKey, pop3MailPortValues);
		pop3Props.setProperty(pop3MailSocketFactoryPortKey, pop3MailSocketFactoryPortValues);
		
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
	public static void openFolder(String username, String password, String folderName)
	{
		getMailConnetion(username, password);
		try
		{
			folder = store.getDefaultFolder();
			folder = folder.getFolder(folderName);
			
			if (folder == null)
			{
				throw new Exception("Invalid Folder Name.");
			}
			
			folder.open(Folder.READ_WRITE);
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
			props.put(pop3HostKey, pop3HostValue);
			props.put(pop3PortKey, pop3PortValue);
			props.put(pop3StarttlsKey, pop3StarttlsValue);
			
			
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
				LogFileUtil.infoMsg("-----------------------------------------------------------------");
				System.out.println("Email No: "+(i+1));
				LogFileUtil.infoMsg("Email No: "+(i+1));
				System.out.println("Subject: "+message.getSubject());
				LogFileUtil.infoMsg("Subject: "+message.getSubject());
				System.out.println("From: "+message.getFrom());
				LogFileUtil.infoMsg("From: "+message.getFrom());
				System.out.println("Text: "+message.getContent().toString());
				LogFileUtil.infoMsg("Text: "+message.getContent().toString());
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
	
	//Sending Mail using SMTP Server
	public static void sentSingleMailSMTP(final String username, final String password, String reciepentMail, String subjectLine, String textContent)
	{
		props = new Properties();
		props.put(smtpAuthKey, smtpAuthValues);
		props.put(smtpStarttlsKey, smtpStarttlsValues);
		props.put(smtpHostKey, smtpHostValues);
		props.put(smtpPortKey, smtpPortValues);
		
		session = getSession(props, username, password);
		
		try
		{
			message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(reciepentMail));
			message.setSubject(subjectLine);
			message.setText(textContent);
			
			Transport.send(message);
			System.out.println("Message Sent Successfully.....");
		}
		catch(MessagingException ex)
		{
			ex.printStackTrace();
		}
	}
	

	//Sending Mail Using SSL Server
	public static void sentSingleMailSSL(String username, String password, String reciepentMail, String subjectLine, String textContent)
	{
		props = new Properties();
		props.put(sslHostKey, sslHostValues);
		props.put(sslSocketFactoryPortKey, sslSocketFactoryPortValues);
		props.put(sslSocketFactoryClassKey, sslSocketFactoryClassValues);
		props.put(sslAuthKey, sslAuthValues);
		props.put(sslPortKey, sslPortValues);
		
		session = getSession(props, username, password);
		
		try
		{
			message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(reciepentMail));
			message.setSubject(subjectLine);
			message.setText(textContent);
			
			Transport.send(message);
			System.out.println("Message sent from SSL Port Successfully..........");
		}
		catch(MessagingException ex)
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
	
	//Getting mail Session Object using Properties class object and username, password.
	public static Session getSession(Properties props, final String username, final String password)
	{
		session = Session.getDefaultInstance(props, new Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(username, password);
			}
		});
		
		if (session != null)
		{
			System.out.println("Mail Session Object Created Successfully.....");
			return session;
		}
		else
		{
			throw new RuntimeException("Mail Session Object Creation Failure....");
		}
	}
}
