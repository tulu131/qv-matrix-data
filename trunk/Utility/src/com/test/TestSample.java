package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Properties;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;


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
	public static void main(String[] args) throws JSONException, IOException
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
		
//		String username = PropUtil.getValues("username");
		
//		System.out.println(username);
		
		
//		String url = "https://sandbox.qa.virginamerica.com/api/v0/booking/lock-inventory-cabin/Post";
//		JSONParser json = new JSONParser();
//		JSONObject object = json.getJSONFromUrl(url);
//		String content = object.getString("Source");
		String addr = "Post";
		String s = "http://maps.google.com/maps/api/geocode/json?" +"sensor=false&address=";
		s += URLEncoder.encode(addr, "UTF-8");
		URL url = new URL(s);

		// read from the URL
		Scanner scan = new Scanner(url.openStream());
		String str = new String();
		while (scan.hasNext())
		    str += scan.nextLine();
		scan.close();
		
		// build a JSON object
		JSONObject obj = new JSONObject(str);
		if (! obj.getString("status").equals("OK"))
		    return;
		
		// get the first result
		JSONObject res = obj.getJSONArray("results").getJSONObject(0);
		System.out.println(res.getString("formatted_address"));
		JSONObject loc =
		    res.getJSONObject("geometry").getJSONObject("location");
		System.out.println("lat: " + loc.getDouble("lat") +
                    ", lng: " + loc.getDouble("lng"));
		
	}
		

//		}
}