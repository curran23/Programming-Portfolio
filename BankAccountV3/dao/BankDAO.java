package dao;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import bankaccount.*;

public class BankDAO 
{  
	//----------------------------------------
	// Instance Variables
	//----------------------------------------
	private String fileName;
	
	
	//----------------------------------------
	// Constructors
	//----------------------------------------	
		
	public BankDAO(String myFilePath) 
	{
		fileName = myFilePath;
	}
	
	
	
	//----------------------------------------
	// Class Methods
	//----------------------------------------	
	
	public Bank loadAccounts() throws IOException
	{
		Scanner fileIn;
		String line;
		String[] values;
		Bank myBank = new Bank();
		
		try
		{
			
		   // Open File	
		   fileIn = new Scanner(new FileInputStream(fileName));
				
		   // Read from File		
		   while ( fileIn.hasNext())
		   {
				line = fileIn.nextLine();
				
				values = line.split(",");
				
				myBank.addAccount(new BankAccount(values[0], Double.valueOf(values[1])));
				
		   }		
		
		   // Close File
		   fileIn.close();
		
		}
		catch (IOException e)
		{
			throw e;
		}
		
		return myBank;
	}

	public void saveAccounts(Bank myBank) throws IOException
	{
		FileWriter fileOut;
		
		try
		{
			
		   // Open File	
		   fileOut = new FileWriter(fileName);
				
		   // Write to File
		   BankAccount aAccount;
		   
		   for(int i = 0; i < myBank.getNumOfAccounts(); i++)
		   {
			  aAccount = (BankAccount) myBank.getAccount(i);
			   fileOut.write(aAccount.getAccountNumber() + "," + aAccount.getBalance() + "\r\n");
		   }
		
		   // Close File
		   fileOut.close();
		
		
		}
		catch (IOException e)
		{
			throw e;
		}
	}

}
	
	


