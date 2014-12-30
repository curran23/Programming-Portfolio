package dao;


import java.sql.*;

import bankaccount.*;

public class BankDAO 
{
	
	//---------------------------------------------
	// Instance Variables
	//---------------------------------------------
	BankDBConnection myDB;

	
	
	//---------------------------------------------
	// Constructor
	//---------------------------------------------
	public BankDAO() 
	{
		myDB = new BankDBConnection();
	}
	
	
	//---------------------------------------------
	// Class Methods
	//---------------------------------------------
	
	public Bank getData() throws SQLException
	{
		Connection myConnection = myDB.getConnection();
		Bank myBank = new Bank();
		BankAccount aAccount;
		
		try
		{
      	  Statement mySQL = myConnection.createStatement();

          String select =    "SELECT accountnumber, balance " +
            		         "FROM account";  
       
      
      //Display what is in the database  
      ResultSet rs = mySQL.executeQuery(select);  
      while(rs.next()) 
      {  
    	  myBank.addAccount(new BankAccount(rs.getString("AccountNumber"),rs.getDouble("balance")));
      }  
      
      rs.close();
      myConnection.close();
		
		}
		catch (SQLException e)
		{
			throw e;
		}
		
		return myBank;
	}
	
	
	public void save(Bank myBank) throws SQLException
	{
		Bank aBankAccount;
		
		for(int i = 0; i < myBank.getNumOfAccounts(); i++)
		{
			try 
			{
				myBank.getAccount(i).save();
			} 
			catch (SQLException e) 
			{
				throw e;
			}
		}
	}
	

}
