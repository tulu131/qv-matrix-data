package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sailendra.Jena
 *
 */
public class TestSample
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("D:/mailLists.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = null;
		List<String> list = new ArrayList<String>();
		while ((line = br.readLine()) != null)
		{
			
			list.add(line);
		}
		
		System.out.println(list);
	}
}