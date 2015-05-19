package com.lara.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropsTest
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("D:\\resources.properties");
			FileInputStream input = new FileInputStream(file);
			
			Properties props = new Properties();
			props.load(input);
			System.out.println("Properties File Loaded Successfully.........");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
