package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class DeleteMail
{
	public static void delete(String pop3Host, String storeType, String username, String password)
	{
		try
		{
			Properties props = new Properties();
			props.put("mail.store.protocol", "pop3");
			props.put("mail.pop3s.host", pop3Host);
			props.put("mail.pop3s.port", "995");
			props.put("mail.pop3s.starttls.enable", "true");
			
			Session emailSession = Session.getDefaultInstance(props);
			
			Store store = emailSession.getStore("pop3s");
			store.connect(pop3Host, username, password);
			
			Folder emailFolder = store.getFolder("INBOX");
			emailFolder.open(Folder.READ_WRITE);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			Message[] messages = emailFolder.getMessages();
			System.out.println("Message.length: "+messages.length);
			
			for (int i = 0; i < messages.length; i++)
			{
				Message message = messages[i];
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Email Number: "+(i+1));
				System.out.println("Subject: "+message.getSubject());
				System.out.println("From: "+message.getFrom()[0]);
				
				String subject = message.getSubject();
				System.out.println("Do you want to delete this message[y/n]?");
				String ans = reader.readLine();
				
				if ("y".equals(ans) || "Y".equals(ans))
				{
					message.setFlag(Flags.Flag.DELETED, true);
					System.out.println("Marked DELETE for message: "+subject);
				}
				else if ("n".equals(ans) || "N".equals(ans))
				{
					break;
				}
			}
			emailFolder.close(true);
			store.close();
		}
		catch(NoSuchProviderException ex)
		{
			System.out.println("Exception in NoSuchProvider: "+ex.getMessage());
		}
		catch(MessagingException|IOException ex)
		{
			System.out.println("Exception in Combine Exception: "+ex.getMessage());
		}
	}
	
	public static void main(String[] args)
	{
		String host = "pop.gmail.com";
		String mailStoreType = "pop3";
		String username = "sailendra.n.jena@gmail.com";
		String password = "shreemaa131";
		
		delete(host, mailStoreType, username, password);
	}
}
