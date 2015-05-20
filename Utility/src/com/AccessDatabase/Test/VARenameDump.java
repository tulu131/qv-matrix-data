package com.AccessDatabase.Test;

import java.io.File;

import com.myAssets.utils.PropOutUtil;

public class VARenameDump
{
	  public static void main(String[] args)
	  {
		  
		  VARenameDump fileSearch = new VARenameDump();
		  String path = PropOutUtil.getValues("DumpRenameFolderPath");
		  System.out.println(path);
		  fileSearch.searchDirectory(new File(path));
	 
	  }
	  public void searchDirectory(File directory)
	  {
	 
			if (directory.isDirectory())
			{
			    search(directory);
			    System.out.println("Folder Rename Successfull.........");
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
						}
				    }
				    else
				    {
				    	System.out.println(file.getAbsoluteFile() + "Permission Denied");
				    }
		      }
	  }//End of seach() method.

}
