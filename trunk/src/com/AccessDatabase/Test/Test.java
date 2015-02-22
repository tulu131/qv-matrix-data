package com.AccessDatabase.Test;

import com.myAssets.utils.GmailUtil;

public class Test
{
	public static void main(String[] args) 
	{
		String username = "sailendra.n.jena@gmail.com";
		String password = "shreemaa131";
		String folderName = "INBOX";
		
		GmailUtil.readMail(username, password, folderName);
	}
}
