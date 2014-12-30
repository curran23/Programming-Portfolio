package presentation;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;
import bankaccount.*;

public class BankAppFrame extends JFrame
{
	//---------------------------------
	// Instance Variables
	//---------------------------------
	Bank myBank;
	JMenuBar myMenu;

	
	public BankAppFrame() 
	{
		setSize(400,300);
		setTitle("Bank Overview");
		

		
		buildMenu();
		
		add("North",myMenu);
		
		myBank = new Bank();
		try 
		{
			myBank.loadData();
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(myMenu,"Could not connect to the database","DataBase Error", JOptionPane.WARNING_MESSAGE);
			System.exit(ERROR);
		}
	
		
		repaint();
		
		
	}
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		

		
		g.drawString("Net worth: " + myBank.getNetWorth(), 100, 100);
		g.drawString("Number of accounts: " + myBank.getNumOfAccounts(), 100, 120);
		g.drawString("Number of accounts overdrawn: " + myBank.getOverdrawnAccounts().size(), 100, 140);
	}
	
	private void buildMenu()
	{
		myMenu = new JMenuBar();
		JMenu fileMenu = new JMenu();
		JMenu accountMenu = new JMenu();
		
		fileMenu = new JMenu("File");
		myMenu.add(fileMenu);
		
		accountMenu = new JMenu("Accounts");
		myMenu.add(accountMenu);

		
		JMenuItem saveFileMenuItem = new JMenuItem("Save");
		saveFileMenuItem.addActionListener(new saveFileListener());
		fileMenu.add(saveFileMenuItem);
		
		JMenuItem addAccountMenuItem = new JMenuItem("Add Account");
		addAccountMenuItem.addActionListener(new addAccountListener());
		accountMenu.add(addAccountMenuItem);
		

	}
	

 	private void saveBankFile()
	{
		
	  try
	  { 
	     myBank.saveAccounts();
      }
	  catch (SQLException e)
	  {
	    JOptionPane.showMessageDialog(myMenu,"Could not connect to the database","DataBase Error", JOptionPane.WARNING_MESSAGE);	
	  }
	}
 	
 	private void addAccount()
 	{
 		String newAccount = myBank.getNextAvailableAccountNumber();
 		
 		
 		myBank.addAccount(new BankAccount(newAccount,0));
 	}
 	

	
	//----------------------------------------------------------------
	// Helper Inner Classes
	//----------------------------------------------------------------
	

	
	private class saveFileListener implements ActionListener
	{
	       public void actionPerformed(ActionEvent e) 
	       {
	
	                saveBankFile();
	    	   
	       }
	}
	
	private class addAccountListener implements ActionListener
	{
	       public void actionPerformed(ActionEvent e) 
	       {
	
	                addAccount();
	    	   
	       }
	}
	

	
	
	

}
