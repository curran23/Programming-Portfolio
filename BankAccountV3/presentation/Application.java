package presentation;

import java.io.FileNotFoundException;
import java.io.IOException;

import bankaccount.Bank;
import bankaccount.BankAccount;
import bankaccount.IBank;

public class Application 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Bank firstStateBank = new Bank();
		
		try
		{
		   firstStateBank = new Bank("C:\\users\\holmesm\\desktop\\BankData.txt");
		   firstStateBank.addAccount(new BankAccount("Z",100.00));
		   firstStateBank.saveAccounts();
		   
        }
		catch (IOException e)
		{
			firstStateBank = new Bank();
		}
		finally
		{
			System.out.println("Net worth: " + firstStateBank.getNetWorth());
			
			System.out.println("Number of accounts overdrawn: " + firstStateBank.getOverdrawnAccounts().size());
		}
		
		
	
	}

}