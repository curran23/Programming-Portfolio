import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class GameFrame extends JFrame {

	/** This class will use the panel for the card to display the card
	 * to the user as well as allow the button to be used by the user
	 * so that the next card can be displayed.
	 */
	
	//----------------------------------------------------------------------------------
    // Instance Variables
	//----------------------------------------------------------------------------------
		//private StandardDeck myDeck;
		private JPanel field;
		private JPanel menu;
	
	//----------------------------------------------------------------------------------
    // Constructors
	//---------------------------------------------------------------------------------- 
		public GameFrame() {
			
			//this.setLayout(new FlowLayout());
			this.setSize(300,300);
			this.setTitle("Curran Lipsett Random Cards");
			
			this.createFieldPanel();
			this.createMenuPanel();
			
			this.add(field);
			this.add(menu);
			
			JButton roll = new JButton("Draw Card");
			
			roll.addActionListener(new RollListener());
			
			add("East", roll);
		
		}
	
	//----------------------------------------------------------------------------------
    // Helpers
	//----------------------------------------------------------------------------------    
    
		public void createMenuPanel() {
			
		}
	
		public void createFieldPanel() {
			
		}
		
		private class RollListener implements ActionListener 
		   {
		       public void actionPerformed(ActionEvent e) 
		       {
		    	  //myDeck.drawTopCard();
		       }
		   }
		
}
