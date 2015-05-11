package com.lara.test;

import java.io.File;

public class RenameFolder
{
	public static void main(String[] args)
	{
		File file = new File("D:\\Test\\myFolder\\purchase.rt.ad.1a\\AddRemarksGateway\\AddRemarks#1_29");
		String name = file.getName();
//		System.out.println(name);
		
		String newName = name.substring(0, name.indexOf("_"));
		
//		System.out.println(newName);
		System.out.println(file.getParent());
		
		File newDir = new File(file.getParent()+"\\"+newName);
		
		if (file.isDirectory())
		{
			System.out.println(file.getName());
			file.renameTo(newDir);
			System.out.println("Old Directory renamed Successfully");
		}
		else
		{
			file.mkdir();
			file.renameTo(newDir);
		}
	}
}
