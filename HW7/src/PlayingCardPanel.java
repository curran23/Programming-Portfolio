import java.awt.*;
import javax.swing.*;
import java.io.*;

public class PlayingCardPanel extends JPanel {
	
	/**
	 * This class will display the card as text, and will have the display next card button
	 * that will allow the user to see the next card in the deck.
	 */

	
	//----------------------------------------------------------------------------------
    // Instance Variables
	//----------------------------------------------------------------------------------
		private StandardDeck myDeck;
		int aSuit;
		int aRank;
		String filepath;

	//----------------------------------------------------------------------------------
    // Constructors
	//----------------------------------------------------------------------------------
	
		public PlayingCardPanel() throws FileNotFoundException {
			
			myDeck = new StandardDeck(filepath);
		}
	
	
	//----------------------------------------------------------------------------------
    //Class Methods
    //----------------------------------------------------------------------------------
		
		public void paintComponent(java.awt.Graphics graphics)
		{	
			super.paintComponent(graphics); 
			this.setBackground(new java.awt.Color(255,255,128));
			this.setPreferredSize(new java.awt.Dimension(200, 200));
			this.setLocation(200,200);
		}
		public void drawTopCard(java.awt.Graphics graphics)
		{
			super.paintComponent(graphics);
			java.awt.Graphics2D gr=(java.awt.Graphics2D) graphics;
			int width = 130, height = 100;
			gr.setColor(Color.white);
			gr.fillRect(0,0, width, height);
			gr.setColor(Color.black);
			gr.drawRect(0,0, width - 1, height - 1);
			PlayingCard myCard = myDeck.drawTopCard();
			gr.drawString(myCard.toString(), 10, 45);
			repaint();
		}
}



