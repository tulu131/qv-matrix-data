package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.myAssets.utils.PropUtil;

/**
 * @author Sailendra.Jena
 *
 */

class Tested
{
	private static Properties props = null;
	private static InputStream input = null;
	
	static
	{
		props = new  Properties();
		
		try
		{
			input = new FileInputStream("src/com/myAssets/resources/config.properties");
			props.load(input);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (input != null)
			{
				try
				{
					input.close();
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}
	
	public static String getValues(String key)
	{
//		props = new Properties();
		
		String values = props.getProperty(key);
		
		return values;
	}
}
public class TestSample
{
	public static void main(String[] args)
	{
//		Properties props = new Properties();
//		InputStream input = null;
//		
//		try
//		{
//			input = new FileInputStream("src/com/myAssets/resources/config.properties");
//			props.load(input);
//			
//		}
//		catch(IOException ex)
//		{
//			ex.printStackTrace();
//		}
//		finally
//		{
//			if (input != null)
//			{
//				try
//				{
//					input.close();
//				}
//				catch(IOException ex)
//				{
//					ex.printStackTrace();
//				}
//			}
//			System.out.println(props.getProperty("username"));
//			System.out.println(props.getProperty("password"));
		
//		String username = Tested.getValues("username");
//		
//		System.out.println(username);
		
		String username = PropUtil.getValues("username");
		System.out.println(username);
	}
		

//		}
}