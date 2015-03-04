package com.AccessDatabase.Test;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.myAssets.utils.GmailUtil;
import com.myAssets.utils.LogFileUtil;
import com.myAssets.utils.PropOutUtil;
import com.myAssets.utils.PropUtil;


/**
 * @author Sailendra.Jena
 *
 */
public class Test
{
//	private static Message message = null;
//	private static BodyPart messageBodyPart = null;
//	private static final DataSource source = null;
//	private static Session session = null;
//	private static Multipart multipart = null;
//	
//	
//	private static final String username = PropOutUtil.getValues("username");
//	private static final String password = PropOutUtil.getValues("password");
//	private static final String subjectLine = PropOutUtil.getValues("subjectLine");
//	private static final String contentLine = PropOutUtil.getValues("contentLine");
//	private static final String filename = PropOutUtil.getValues("attachedFilePath");
			
			
	public static void main(String[] args) 
	{
//		String to = PropUtil.getValues("username");
//		
//		String from = PropUtil.getValues("username");
		
//	      final String username = "sailendra.n.jena@gmail.com";//change accordingly
//	      final String password = PropUtil.getValues("password");//change accordingly

	      // Assuming you are sending email through relay.jangosmtp.net
//	      String host = "smtp.gmail.com";
//
//	      Properties props = new Properties();
//	      props.put("mail.smtp.auth", "true");
//	      props.put("mail.smtp.starttls.enable", "true");
//	      props.put("mail.smtp.host", host);
//	      props.put("mail.smtp.port", "587");
//
//	      // Get the Session object.
//	      session = GmailUtil.getSession(props, username, password);
//
//	      try {
//	         // Create a default MimeMessage object.
//	         message = new MimeMessage(session);
//
//	         // Set From: header field of the header.
//	         message.setFrom(new InternetAddress(username));
//
//	         // Set To: header field of the header.
//	         message.setRecipients(Message.RecipientType.TO,
//	            InternetAddress.parse(username));
//
//	         // Set Subject: header field
//	         message.setSubject(subjectLine);
//
//	         // Create the message part
//	         messageBodyPart = new MimeBodyPart();
//
//	         // Now set the actual message
//	         messageBodyPart.setText(contentLine);
//
//	         // Create a multipar message
//	         multipart = new MimeMultipart();
//
//	         // Set text message part
//	         multipart.addBodyPart(messageBodyPart);
//
//	         // Part two is attachment
//	         messageBodyPart = new MimeBodyPart();
////	         String filename = "D:\\test.txt";
//	         DataSource source = new FileDataSource(filename);
//	         messageBodyPart.setDataHandler(new DataHandler(source));
//	         messageBodyPart.setFileName(filename);
//	         multipart.addBodyPart(messageBodyPart);
//
//	         // Send the complete message parts
//	         message.setContent(multipart);
//
//	         // Send message
//	         Transport.send(message);
//
//	         System.out.println("Sent message successfully....");
//	  
//	      } catch (MessagingException e) {
//	         throw new RuntimeException(e);
//	      }
		
		GmailUtil.attachOneFileMail();
	}
}
