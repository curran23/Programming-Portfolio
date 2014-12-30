package bankaccount;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import dao.*;



public class Bank implements IBank 
{
	//----------------------------------------
	// Instance Variables
	//----------------------------------------
	private BankDAO myDAO;
	private ArrayList<BankAccount> accounts;
	
	
	//----------------------------------------
	// Constructors
	//----------------------------------------	
	public Bank() 
	{
		accounts = new ArrayList<BankAccount>();
		myDAO = new BankDAO("C:\\Data.txt");
	}

	public Bank(String myFilePath) throws IOException
	{
		myDAO = new BankDAO(myFilePath);
		
		
		try
		{
		  Bank data = myDAO.loadAccounts();
		  this.accounts = data.accounts;
		}
		catch (IOException e)
		{
			throw e;
		}
		
		
	}
	
	
	//----------------------------------------
	// Class Methods
	//----------------------------------------	
	
	@Override
	public double getNetWorth() 
	{		
		//There are other ways to do this loop, but I wanted to demonstrate the use of Iterator.
		Iterator<BankAccount> list = accounts.iterator();
		double netWorth = 0.0;
		BankAccount aAccount;
		
		while ( list.hasNext() )
		{
			aAccount = list.next();
			netWorth += aAccount.getBalance();
		}
		
		return netWorth;
	}

	@Override
	public Collection getOverdrawnAccounts() 
	{
		Collections.sort(accounts);
	
		Iterator<BankAccount> list = accounts.iterator();
		ArrayList<BankAccount> overdrawn = new ArrayList<BankAccount>();
		BankAccount aAccount;
		boolean stop = false;
		
		while ( list.hasNext() && ! stop )
		{
			aAccount = list.next();
			
			if (aAccount.getBalance() < 0)
			{
				overdrawn.add(aAccount);
			}
			else
			{
				stop = true;
			}
		}
		
		return  overdrawn;		
	}

	public int getNumOfAccounts()
	{
		return accounts.size();
	}
	
	public IBankAccount getAccount(int index)
	{
		return (BankAccount) accounts.get(index);
	}


	public void saveAccounts() throws IOException
	{
		try 
		{
			myDAO.saveAccounts(this);
		} 
		catch (IOException e) 
		{
			throw e;
		}
	}

	
	@Override
	public void addAccount(IBankAccount aAccount) 
	{
		accounts.add((BankAccount) aAccount);
	}




	@Override
	public double getAccountBalance(String myAccountNumber) 
	{
		Iterator<BankAccount> list = accounts.iterator();
		BankAccount aAccount;
		boolean stop = false;
		
		while ( list.hasNext() && ! stop )
		{
			aAccount = list.next();
			
			if (aAccount.getAccountNumber().equals(myAccountNumber))
			{
				return aAccount.getBalance();
			}
			else
			{
				stop = true;
			}
		}
		
		return  0.00;	
	}

}
