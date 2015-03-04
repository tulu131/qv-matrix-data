package com.AccessDatabase.creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableInAccess1
{
	static
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\Sailendra.Jena\\Documents\\MyDatabase.accdb";
//		System.out.println("Connection Successfull..........");
		try
		{
			con = DriverManager.getConnection(database);
			stmt = con.createStatement();
			stmt.executeUpdate("create table Student(sId integer, name varchar(20), age integer)");
			System.out.println("Statement Executed Successfully........");
			stmt.close();
			con.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
