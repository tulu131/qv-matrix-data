package com.AccessDatabase.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test
{
	public static void main(String[] args) throws IOException
	{
//		try
//		{
//			String data = "Sailendra Narayan Jena"+"\n";
//			
//			File file = new File("D:\\testlog.log");
//			
//			if (!file.exists())
//			{
//				file.createNewFile();
//			}
//			
//			FileWriter fileWriter = new FileWriter(file, true);
//			BufferedWriter brWriter = new BufferedWriter(fileWriter);
//			brWriter.write(data);
//			brWriter.newLine();
//			brWriter.close();
//			
//			System.out.println("File Written Successfully............");
//		}
//		catch(IOException ex)
//		{
//			ex.printStackTrace();
//		}
		
		BufferedReader brReader = new BufferedReader(new FileReader("src/com/myAssets/resources/DumpSample.txt"));
		File file = new File("D:\\testlog.log");
		FileWriter writer = new FileWriter(file, true);
		if (!file.exists())
		{
			file.createNewFile();
		}
		BufferedWriter brWriter = new BufferedWriter(writer);
		
		String line = null;
		
		while ((line = brReader.readLine()) != null)
		{
			System.out.println(line);
			brWriter.write(line);
			brWriter.newLine();
		}
		brReader.close();
		brWriter.close();
		
		System.out.println("File written Successfully.........");
	}
}
