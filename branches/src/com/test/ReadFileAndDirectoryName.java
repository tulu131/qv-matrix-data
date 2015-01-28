package com.test;

import java.io.File;
import java.util.Iterator;

public class ReadFileAndDirectoryName
{
	public void listFilesFolders(String directoryName)
	{
		File directory = new File(directoryName);
		File[] list = directory.listFiles();
		
		for (File file : list)
		{
			System.out.println(file.getName());
		}
	}
	
	public void listFolders(String directoryName)
	{
		File directory = new File(directoryName);
		
		File[] list = directory.listFiles();
		
		for (File file : list)
		{
			if (file.isDirectory())
			{
				System.out.println(file.getName());
			}
		}
	}
	
	public void listFiles(String directoryName)
	{
		File directory = new File(directoryName);
		File[] list = directory.listFiles();
		
		for (File file : list)
		{
			if (file.isFile())
			{
				System.out.println(file.getName());
			}
		}
	}
	
	public void listFilesAndFilesSubDirectory(String directoryName)
	{
		File directory = new File(directoryName);
		
		File[] list = directory.listFiles();
		
		for (File file : list)
		{
			if (file.isFile())
			{
				System.out.println(file.getAbsolutePath());
			} else if (file.isDirectory())
			{
				listFilesAndFilesSubDirectory(file.getAbsolutePath());
			}
		}
	}
	
	public static void main(String[] args)
	{
		ReadFileAndDirectoryName listFileUtils = new ReadFileAndDirectoryName();
		final String directoryName = "D:/Dump Folders/24Nov2014/purchase.rt.ad.1a1c";
		
		listFileUtils.listFilesFolders(directoryName);
	}
}
