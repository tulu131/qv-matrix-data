package com.myAssets.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Sailendra.Jena
 *
 */
public class JDBCUtil
{
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static Connection getConnectionForMySQL(String url, String username, String password) throws SQLException
	{
		return DriverManager.getConnection(url, username, password);
	}
	
	public static void closeDBResources(Statement stmt, Connection con, ResultSet rs)
	{
		if(stmt != null)
		{
			try
			{
				stmt.close();
				stmt = null;
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		if(con != null)
		{
			try
			{
				con.close();
				con = null;
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		if(rs != null)
		{
			try
			{
				rs.close();
				rs = null;
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
