package com.lara.test;

public class Test
{
	public static void main(String[] args)
	{
		String TRUE_CLIENT_IP = "True-Client-IP";
		String[] name = TRUE_CLIENT_IP.split("-");
		
		for (int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
	}
}
