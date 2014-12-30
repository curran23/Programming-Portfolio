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

		BankAppFrame myFrame = new BankAppFrame();
		myFrame.setVisible(true);
		
	}

}