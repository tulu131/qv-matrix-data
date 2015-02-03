package com.AccessDatabase.Test;

import com.myAssets.utils.GmailUtil;


public class Test
{
	public static void main(String[] args)
	{
		String username = "sailendra.n.jena@gmail.com";
		String password = "shreemaa131";
		String reciepentMail = "sailendra.n.jena@gmail.com";
		String subjectLine = "Java Mail";
		String textContent = "Hi Sailendra, "+"\n\n"+"This mail is coming from Java Code. Please don't reply on this mail.."+"\n\n"+"Thanks & Regards"+"\n"+"Sailendra Narayan Jena"+"\n"+"Mob: +919731728407";
		String folderName = "INBOX";
		GmailUtil.openFolder(username, password, folderName);
		GmailUtil.disconnectGmailAcount();
	}
}