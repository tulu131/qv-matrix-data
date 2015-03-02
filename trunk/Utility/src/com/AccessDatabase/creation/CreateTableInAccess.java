package com.AccessDatabase.creation;

import java.sql.Connection;

public class CreateTableInAccess
{
	public static void main(String[] args)
	{
		Connection con = null;
		
		try
		{
			//Load Jdbc-Odbc Driver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Jdbc-Odbc Driver Loaded Successfully..........");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
