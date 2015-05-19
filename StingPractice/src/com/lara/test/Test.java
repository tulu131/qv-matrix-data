package com.lara.test;

import java.io.File;




public class Test
{
	 
	  public static void main(String[] args)
	  {
		  Test fileSearch = new Test();
	 
		  fileSearch.searchDirectory(new File("D:\\Dump Folders\\2015 Dump\\May\\19May2015\\OWCon1AExitDomSilverTBVisaTest\\BookingController.lockInventory"));
	 
	  }
	  public void searchDirectory(File directory)
	  {
	 
			if (directory.isDirectory())
			{
			    search(directory);
			}
			else
			{
			    System.out.println(directory.getAbsoluteFile() + " is not a directory!");
			}
	 
	  }
	 
	  private void search(File file)
	  {
	 
			if (file.isDirectory())
			{
					String folderName = file.getName();
					String newFName = null;
					if (folderName.contains("_"))
					{
						newFName = folderName;
						String newFolder = newFName.substring(0, newFName.indexOf("_"));
						
						System.out.println(newFolder);
						System.out.println(file.getParent());
						File newDir = new File(file.getParent()+"\\"+newFolder);
						if (file.isDirectory())
						{
							file.renameTo(newDir);
							System.out.println("Old Directory got renamed successfully");
						}
						else
						{
							file.mkdir();
							file.renameTo(newDir);
							System.out.println("new Directory Done");
						}
					}
					
			            //do you have permission to read this directory?	
				    if (file.canRead())
				    {
						for (File temp : file.listFiles())
						{
							    if (temp.isDirectory())
							    {
								search(temp);
							    }
							    else
							    {
							    }
						}
			 
				    }
				    else
				    {
				    	System.out.println(file.getAbsoluteFile() + "Permission Denied");
				    }
		      }
	  }//End of seach() method.
}
