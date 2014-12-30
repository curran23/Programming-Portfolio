package BankAccount;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class BankVector implements IBank 
{

	private Vector<BankAccount> accounts;

	public BankVector() 
	{
		accounts = new Vector<BankAccount>();
	}

	
	
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
		Vector<BankAccount> overdrawn = new Vector<BankAccount>();
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
