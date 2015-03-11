package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.myAssets.utils.PropUtil;


/**
 * @author Sailendra.Jena
 *
 */
public class TestSample
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("src\\com\\myAssets\\resources\\config.properties"));
		Properties props = new Properties();
		props.load(fis);
		
		System.out.println("Properties File Loaded Successfully.............");
		
		Properties prop = new Properties();
		String smtpAuthValues = prop.getProperty("smtpAuthValues");
		System.out.println(smtpAuthValues);
	}
}