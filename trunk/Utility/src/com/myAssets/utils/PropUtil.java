package com.myAssets.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Sailendra.Jena
 *
 */
public class PropUtil
{

	public static File file = null;
	public static FileInputStream fileInput = null;
	public static Properties props = null;


	
	static
	{
		file = new File("D:\\resources.properties");//new File("src\\com\\myAssets\\resources\\config.properties");
		try
		{
			fileInput = new FileInputStream(file);
			props = new Properties();
			props.load(fileInput);
			System.out.println("Properties file Loaded Successfully........");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			FileUtil.destroyFileResources(null, fileInput, null, null, null, null, null, null, null, null, null, null);
		}

	}
	
	public static String getValues(String key)
	{
		String value = props.getProperty(key);
		return value;
	}

	//SMTP Details
	private static final String smtpAuthValues = getValues("smtpAuthValues");
	private static final String smtpStarttlsValues = getValues("smtpStarttlsValues");
	private static final String smtpHostValues = getValues("smtpHostValues");
	private static final String smtpPortValues = getValues("smtpPortValues");
	
	private static final String smtpAuthKey = getValues( "smtpAuthKey");
	private static final String smtpStarttlsKey = getValues("smtpStarttlsKey");
	private static final String smtpHostKey = getValues("smtpHostKey");
	private static final String smtpPortKey = getValues("smtpPortKey");

	
	public static Properties getSMTPProps()
	{
		
		return props;
	}


	public static void main(String[] args)
	{
		String username = getValues("username");
		
		System.out.println(username);
	}
}
