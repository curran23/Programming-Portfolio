package presentation;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import bankaccount.*;

public class BankAppFrame extends JFrame
{
	//---------------------------------
	// Instance Variables
	//---------------------------------
	IBank myBank;
	JMenuBar myMenu;

	
	public BankAppFrame() 
	{
		setSize(400,300);
		setTitle("Bank Overview");
		
		myBank = new Bank();
		
		buildMenu();
		
		add("North",myMenu);
		
	}
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.drawString("Net worth: " + myBank.getNetWorth(), 100, 100);
		g.drawString("Number of accounts overdrawn: " + myBank.getOverdrawnAccounts().size(), 100, 120);
	}
	
	private void buildMenu()
	{
		myMenu = new JMenuBar();
		JMenu fileMenu = new JMenu();
		
		fileMenu = new JMenu("File");
		myMenu.add(fileMenu);
		
		JMenuItem openFileMenuItem = new JMenuItem("Open");
		openFileMenuItem.addActionListener(new openFileListener());
		fileMenu.add(openFileMenuItem);
		
		JMenuItem saveFileMenuItem = new JMenuItem("Save");
		saveFileMenuItem.addActionListener(new saveFileListener());
		fileMenu.add(saveFileMenuItem);
		
		JMenuItem saveAsFileMenuItem = new JMenuItem("Save As");
		saveAsFileMenuItem.addActionListener(new saveAsFileListener());
		fileMenu.add(saveAsFileMenuItem);
	}
	
 	private void openBankFile(String filePath)
	{
	  try
	  {
	     myBank = new Bank(filePath);
      }
	  catch (IOException e)
	  {
	    myBank = new Bank();
	  }

	  repaint();
	  
	}
 	
 	private void saveBankFile()
	{
		
	  try
	  { 
	     myBank.saveAccounts();
      }
	  catch (IOException e)
	  {
		  //JDialog x = new JDialog();
		  //x.setVisible(true);
	  }
	}
 	
 	private void saveBankFile(String filePath)
	{
		
	  try
	  { 
	     myBank.saveAccounts(filePath);
      }
	  catch (IOException e)
	  {
		  //JDialog x = new JDialog();
		  //x.setVisible(true);
	  }
	}
	
	
	
	
	
	//----------------------------------------------------------------
	// Helper Inner Classes
	//----------------------------------------------------------------
	
	private class openFileListener implements ActionListener
	{
	       public void actionPerformed(ActionEvent e) 
	       {
	    	   JFileChooser myFileChooser = new JFileChooser();

	    	   int returnVal = myFileChooser.showOpenDialog(myMenu);
	    	   
	            if (returnVal == JFileChooser.APPROVE_OPTION) 
	            {
	                File userFile = myFileChooser.getSelectedFile();
	                openBankFile(userFile.toString());
	            } 
	    	   
	       }
	}
	
	private class saveFileListener implements ActionListener
	{
	       public void actionPerformed(ActionEvent e) 
	       {
	
	                saveBankFile();
	    	   
	       }
	}
	
	
	private class saveAsFileListener implements ActionListener
	{
	       public void actionPerformed(ActionEvent e) 
	       {
	    	   JFileChooser myFileChooser = new JFileChooser();

	    	   int returnVal = myFileChooser.showSaveDialog(myMenu);
	    	   
	            if (returnVal == JFileChooser.APPROVE_OPTION) 
	            {
	                File userFile = myFileChooser.getSelectedFile();
	                
	                saveBankFile(userFile.toString());
	            } 
	    	   
	       }
	}
	
	
	

}
