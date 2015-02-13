package com.AccessDatabase.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test
{
	public static void main(String[] args)
	{
		try
		{
			String data = "Sailendra Narayan Jena"+"\n";
			
			File file = new File("D:\\testlog.log");
			
			if (!file.exists())
			{
				file.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter brWriter = new BufferedWriter(fileWriter);
			brWriter.write(data);
			brWriter.newLine();
			brWriter.close();
			
			System.out.println("File Written Successfully............");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
