import java.awt.*;
import java.util.Collections;
import java.util.List;

import javax.swing.*;

public class GamePanel extends JPanel {
	
	/**
	 * This class will display the card as text, and will have the display next card button
	 * that will allow the user to see the next card in the deck.
	 */

	
	//----------------------------------------------------------------------------------
    // Instance Variables
	//----------------------------------------------------------------------------------
		private UNOCard myCard;
		public UNODeck myDeck2;
		int aSuit;
		int aRank;

	//----------------------------------------------------------------------------------
    // Constructors
	//----------------------------------------------------------------------------------
	
		public GamePanel() {
			
			myDeck2 = new UNODeck();
			//this.setBackground(Color.gray);
			this.setPreferredSize(new java.awt.Dimension(200,200));
			this.setLocation(200,200);
			
		}
	
	
	//----------------------------------------------------------------------------------
    //Class Methods
    //----------------------------------------------------------------------------------
		
	 	public void paintComponent(java.awt.Graphics graphics)
		{
			super.paintComponent(graphics);  // paint background 
		}
		
		public void getCard(java.awt.Graphics graphics) throws OutOfCardsException
		{
			try {
			super.paintComponent(graphics);
			java.awt.Graphics2D gr=(java.awt.Graphics2D) graphics;
			UNOCard myCard2 = myDeck2.drawTopCard();
			
			myCard2.toString();
			gr.drawString (myCard2.toString(), 5, 45);
			repaint();
			}
			catch (OutOfCardsException e) {
				throw e;
			}
		}
		
		public void drawTopCard() {
			repaint();
		}
		
		public void shuffle() {
			UNODeck myDeck2 = new UNODeck();
			myDeck2.shuffle();
			repaint();
		}
		
		
}