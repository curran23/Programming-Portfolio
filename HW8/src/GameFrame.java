import java.awt.*;
import javax.swing.*;

import java.awt.event.*;



public class GameFrame extends JFrame  {

	/** This class will contain the card represented as text with a button that will
	 * display the next card in the deck.
	 * @author Curran Lipsett
	 * @date March 25 2013
	 */
	
	//----------------------------------------------------------------------------------
    // Instance Variables
	//----------------------------------------------------------------------------------
		private GamePanel gamePanel;
		private JPanel field;
		private JPanel menu;
		private UNODeck myDeck;
	
	//----------------------------------------------------------------------------------
    // Constructors
	//---------------------------------------------------------------------------------- 
		public GameFrame() {
			
			// Default frame constructor for the Playing Cards
			this.setSize(500,400);
			this.setTitle("Curran Lipsett UNO Cards");
			
			this.createFieldPanel();
			this.createMenuPanel();
			
			this.add(field);
			this.add(menu);
			
			
		}
	
	//----------------------------------------------------------------------------------
    // Helpers
	//----------------------------------------------------------------------------------    
    
		public void createMenuPanel() {
			
			//Set up the menu area.
		    menu = new JPanel();
		    menu.setBounds(0, 300, 250, 100);
		    
		    //Create a button and add a listener to it.
		    JButton draw = new JButton("Draw Card");
		    draw.setSize(300,200);
		    draw.addActionListener(new DrawListener());
		  
		    JButton shuffle = new JButton("Shuffle");
	     	shuffle.setSize(300,200);
		    shuffle.addActionListener(new ShuffleListener());
		    //Add the button to the menu area.
		      
		    menu.add(draw);
		    menu.add(shuffle);
		}
		   
		public void createFieldPanel() {
			
			//Set up the card field area.
	        field = new JPanel();
	        field.setBounds(50,50,250,200);
	        
	       
	        //Create the card and add it.
	        gamePanel = new GamePanel();
	        
	        //Create a button and add a listener to it.
			
		    // Add the button and the game panel to the frame
	        field.add(gamePanel);
		}
		
		private class DrawListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				 try {
					gamePanel.getCard(getGraphics());
				} 
				 catch (OutOfCardsException e1) {
					e1.printStackTrace();
				}
		}
		}

		private class ShuffleListener implements ActionListener 
		{
			
			public void actionPerformed(ActionEvent e) 
		    {	
				gamePanel.shuffle();
		    }
		}
}