package com.myAssets.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropUtil
{
	public static File file = null;
	public static FileInputStream fileInput = null;
	public static Properties props = null;


	static
	{
		file = new File("src\\com\\myAssets\\resources\\config.properties");
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
}
