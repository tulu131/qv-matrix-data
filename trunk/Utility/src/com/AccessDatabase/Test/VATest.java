package com.AccessDatabase.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author Sailendra.Jena
 *
 */
public class VATest
{
	public static void main(String[] args) throws IOException
	{
		String timeStamp = new SimpleDateFormat("ddMMMyyyy").format(Calendar.getInstance().getTime());
		String month = new SimpleDateFormat("MMMM").format(new Date(Calendar.getInstance().getTimeInMillis()));
		String year = new SimpleDateFormat("yyyy").format(new Date(Calendar.getInstance().getTimeInMillis()));
		
		
		File json = new File("D:\\Dump Folders\\"+year+" Dump\\"+month+"\\"+timeStamp+"\\JSON");
		File status = new File("D:\\Dump Folders\\"+year+" Dump\\"+month+"\\"+timeStamp+"\\Test Cases Status.txt");
		File backup = new File("D:\\Dump Folders\\"+year+" Dump\\"+month+"\\"+timeStamp+"\\BackUp Dumps");
		
		if (!json.exists() && !status.exists() && !backup.exists())
		{
			if (json.mkdirs() && status.createNewFile() && backup.mkdirs())
			{
				System.out.println(json.getName()+" , "+status.getName()+" & "+backup.getName()+" Created Successfully.....");
			}
		}
		else
		{
			System.out.println(json.getName()+" , "+status.getName()+" & "+backup.getName()+" already exist in that location.....");
		}
		
		BufferedReader brReader = new BufferedReader(new FileReader("D:/DumpSample.txt"));
		//File file = new File("D:\\testlog.log");
		FileWriter writer = new FileWriter(status, true);
		if (!status.exists())
		{
			status.createNewFile();
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