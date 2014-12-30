package dao;

import java.sql.*;

import bankaccount.*;

public class BankAccountDAO 
{
	//---------------------------------------------
	// Instance Variables
	//---------------------------------------------
	BankDBConnection myDB;

	
	
	//---------------------------------------------
	// Constructor
	//---------------------------------------------
	public BankAccountDAO() 
	{
		myDB = new BankDBConnection();
	}
	
	
	
	
	//---------------------------------------------
	// Class Methods
	//---------------------------------------------
		
	public BankAccount getData(String myAccountNumber) throws SQLException, BankAccountNotFoundException
	{
		Connection myConnection = myDB.getConnection();
		BankAccount myAccount = new BankAccount();
		ResultSet rs;
			
		try
		{
			Statement mySQL = myConnection.createStatement();

	        String select =    "SELECT accountnumber, balance " +
	            		         "FROM account" +
	            		         "WHERE accountnumber = '" +  myAccountNumber + "'";  
	     
	        rs = mySQL.executeQuery(select);  
	        
	        if (rs.next())
	        {  
	        	myAccount = new BankAccount(rs.getString("AccountNumber"),rs.getDouble("balance"));
	        }
	        else
	        {
			     rs.close();
			     myConnection.close();  
	        	throw new BankAccountNotFoundException();
	        }	
		}
		catch (SQLException e)
		{
			throw e;
		}
		
	    rs.close();
	    myConnection.close();  
		return myAccount;
	}
	
		
	public void save(BankAccount myAccount) throws SQLException
	{
		Connection myConnection = myDB.getConnection();
		ResultSet rs = null;
			
		try
		{
			Statement mySQL = myConnection.createStatement();
			
			String select =    "SELECT * " +
					           "FROM account " +
			       		       "WHERE accountnumber = '" +  myAccount.getAccountNumber() + "'";  
			

			
			rs = mySQL.executeQuery(select);
			     
			if (rs.next())
			{
				updateBankAccount(myAccount);
			}
			else
			{
				insertBankAccount(myAccount);
			}
				

			      
		}
		catch (SQLException e)
		{
			throw e;
		}
		finally
		{
			rs.close();
			myConnection.close();
		}
	}
	
	private void insertBankAccount(BankAccount myAccount) throws SQLException
	{
		Connection myConnection = myDB.getConnection();
			
		try
		{
			Statement mySQL = myConnection.createStatement();
			
			String insert =    "INSERT INTO account (accountnumber, balance) " +
			       		       "VALUES ('" + myAccount.getAccountNumber() + "'," + myAccount.getBalance() + ")";
			     
			mySQL.execute(insert);   
		}
		catch (SQLException e)
		{
			throw e;
		}
		finally
		{
			myConnection.close();
		}
	}
	
	private void updateBankAccount(BankAccount myAccount) throws SQLException
	{
		Connection myConnection = myDB.getConnection();
			
		try
		{
			Statement mySQL = myConnection.createStatement();
			
			String update =    "UPDATE account " +
			       		       "SET balance = " + myAccount.getBalance() + " " +
			       		       "WHERE accountnumber = '" +  myAccount.getAccountNumber() + "'";  
			
			mySQL.execute(update);
			      
		}
		catch (SQLException e)
		{
			throw e;
		}
		finally
		{
			myConnection.close();
		}
	}
	
	

}
