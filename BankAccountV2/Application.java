package BankAccount;


import java.util.Arrays;

public class Application 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//IBank firstStateBank = new BankArrayList();
		//IBank firstStateBank = new BankLinkedList();
		IBank firstStateBank = new BankVector();
		
		firstStateBank.addAccount(new BankAccount("1",1000.00));
		firstStateBank.addAccount(new BankAccount("2",200.00));
		firstStateBank.addAccount(new BankAccount("3",0.00));
		firstStateBank.addAccount(new BankAccount("4",-0.01));
		firstStateBank.addAccount(new BankAccount("5",-100.00));
		
		System.out.println("Networth: " + firstStateBank.getNetWorth());
	
		System.out.println("Number of accounts overdrawn: " + firstStateBank.getOverdrawnAccounts().size());
		System.out.println(String.format("Account balance for account 4: %6.2f", firstStateBank.getAccountBalance("5")));
	}

}
