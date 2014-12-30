package dao;

import java.sql.*;


public class BankDBConnection

{

	public static String CONNECTION_STRING = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\users\\holmesm\\desktop\\Bank.accdb;";
	
	public BankDBConnection() 
	{
		
	}
	
	
	public Connection getConnection() throws SQLException
	{
		Connection myDBConnection = null;
		
		 try 
         {  
            myDBConnection = DriverManager.getConnection(CONNECTION_STRING,"","");        
         } 
         catch (SQLException e) 
         {  
           throw e;
         }  
		 
		return myDBConnection;
		 
	}

}
