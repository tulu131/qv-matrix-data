package com.myAssets.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Sailendra.Jena
 *
 */
public class PropOutUtil
{
	public static File file = null;
	public static FileInputStream fileInput = null;
	public static Properties props = null;


	
	static
	{
		file = new File("D:\\resources.properties");
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
	
	public static void main(String[] args)
	{
		String username = PropOutUtil.getValues("attachedFilePath");
		System.out.println(username);
	}
}
