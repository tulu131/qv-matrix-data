package com.myAssets.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Sailendra.Jena
 *
 */
@SuppressWarnings("unused")
public class FileUtil
{
	//File realted Classes
	
	private static File file = null;
	private static FileReader fileReader = null;
	private static FileInputStream fInput = null;
	private static FileOutputStream fOutput = null;
	private static FileWriter fwriter = null;
	
	//Buffered Related Classes
	private static BufferedReader buffer = null;
	private static BufferedInputStream brInput = null;
	private static BufferedOutputStream brOutput = null;
	private static BufferedWriter brWriter = null;
	
	//Input and Output Related Classes
	private static InputStream input = null;
	private static OutputStream output = null;
	private static InputStreamReader inputReader = null;
	private static OutputStreamWriter outputWriter = null;
	
	private static List<String> list = null;
	private static String line = null;
	
	public static List<String>  getMailLists()
	{
		file = new File("D:/mailLists.txt");
		list = new ArrayList<String>();
		try
		{
			fileReader = new FileReader(file);
			buffer = new BufferedReader(fileReader);
			
			while ((line = buffer.readLine()) != null)
			{
				list.add(line);
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		return list;
	}
	
	public static void fileExtension(File srcFile)
	{
		if (srcFile.getName().endsWith(".jpg"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".txt"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".mp3"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".pdf"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".mp4"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".png"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".java"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".jsp"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".js"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".css"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".html"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".xhtml"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".xls"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".doc"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".docx"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".ppk"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".bat"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".exe"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else if (srcFile.getName().endsWith(".log"))
		{
			System.out.println("File Extension of "+srcFile.getName()+" is "+srcFile.getName().substring(srcFile.getName().lastIndexOf(".")+1));
		}
		else
		{
			System.out.println("There is no Such file available inside this Location which you have mentioned...Please try some different Location");
		}
	}
	
	
	public static void renameFile(File srcFile, File destFile)
	{
		//TODO
	}
	
	public static void createFile(String fileName, String extens, String destPath)
	{
		try
		{
			file = new File(destPath+fileName+"."+extens);
			
			if (file.createNewFile())
			{
				System.out.println("File : "+file.getName()+" Created Successfully");
			}
			else
			{
				System.out.println("File : "+file.getName()+" Already exist inside this directory.....Please select another Directory");
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void createReadableFile(String fileName, String extens, String destPath)
	{
		try
		{
			file = new File(destPath+fileName+"."+extens);
			
			file.createNewFile();
			file.setReadOnly();
			
			if (file.canRead())
			{
				System.out.println("Readable File Created Successfully");
			}
			else
			{
				System.out.println("File is Writable....");
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void createWritableFile(String fileName, String extens, String destPath)
	{
		try
		{
			file = new File(destPath+fileName+"."+extens);
			
			file.createNewFile();
			file.setWritable(true);
			
			if (file.canWrite())
			{
				System.out.println("File : "+file.getName()+" can Writable Successfully");
			}
			else
			{
				System.out.println("File : "+file.getName()+" can Readable only...");
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}

	//TODO
	
//	public static void checkHiddenFile(String fileName, String location)
//	{
//		file = new File(location+"\\"+fileName);
//		
//		if (file.isHidden())
//		{
//			System.out.println("File : "+file.getName()+" is a hidden file....");
//		}
//		else
//		{
//			System.out.println("File : "+file.getName()+" is not a hidden file...");
//		}
//	}
	
	public static void changeFileLastModifiedDate(String fileName, String destPath, String newLastModifiedDate)
	{
		try
		{
			file = new File(destPath+fileName);
			
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			System.out.println("Original Last Modified Date : "+sdf.format(file.lastModified()));
			
			
			Date newDate = sdf.parse(newLastModifiedDate);
			
			file.setLastModified(newDate.getTime());
			
			
			System.out.println("Latest Last Modified Date: "+sdf.format(file.lastModified()));
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	
	public static void destroyFileResources(FileReader fileReader, FileInputStream fileInputStr, FileOutputStream fileOutputStr, FileWriter fWriter,
																					BufferedReader buffer, BufferedInputStream brInputStr, BufferedOutputStream brOutputStr, 
																					BufferedWriter brWriter, InputStream inputStr, OutputStream outputStr, InputStreamReader inputStrReader, 
																					OutputStreamWriter outputStrWriter)
	{
		if(fileReader != null)
		{
			try
			{
				fileReader.close();
				fileReader = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if(fileInputStr != null)
		{
			try
			{
				fileInputStr.close();
				fileInputStr = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if(fileOutputStr != null)
		{
			try
			{
				fileOutputStr.close();
				fileOutputStr = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if(fWriter != null)
		{
			try
			{
				fWriter.close();
				fWriter = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if(buffer != null)
		{
			try
			{
				buffer.close();
				buffer = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if(brInputStr != null)
		{
			try
			{
				brInputStr.close();
				brInputStr = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if (brOutputStr != null)
		{
			try
			{
				brOutputStr.close();
				brOutputStr = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if (brWriter != null)
		{
			try
			{
				brWriter.close();
				brWriter = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if (inputStr != null)
		{
			try
			{
				inputStr.close();
				inputStr = null;
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
		if (outputStr != null)
		{
			try
			{
				outputStr.close();
				outputStr = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if (inputStrReader != null)
		{
			try
			{
				inputStrReader.close();
				inputStrReader = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
		
		if(outputStrWriter != null)
		{
			try
			{
				outputStrWriter.close();
				outputStrWriter = null;
			}
			catch(IOException ex)
			{
				//TODO Log file generate here.
				ex.printStackTrace();
			}
		}
	}
}
