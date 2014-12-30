import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;




public class GameFrame extends JFrame {

	/** This class will contain the card represented as text with a button that will
	 * display the next card in the deck.
	 * @author Curran Lipsett
	 * @date March 25 2013
	 */
	
	//----------------------------------------------------------------------------------
    // Instance Variables
	//----------------------------------------------------------------------------------
		private PlayingCardPanel gamePanel;
		private JPanel field;
		private JPanel menu;
		JMenuBar myMenu;
	
	//----------------------------------------------------------------------------------
    // Constructors
	//---------------------------------------------------------------------------------- 
		public GameFrame() throws FileNotFoundException {
			
			// Default frame constructor for the Playing Cards
			this.setSize(400,400);
			this.setTitle("Curran Lipsett Random Cards");
			
			this.createFieldPanel();
			this.createMenuPanel();
			
			this.add(field);
			this.add(menu);
			buildMenu();
			this.add("North", myMenu);
			
			
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
		}
	
	//----------------------------------------------------------------------------------
    // Helpers
	//----------------------------------------------------------------------------------    
    
		public void createMenuPanel() {
			
			//Set up the menu area.
		    menu = new JPanel();
		    menu.setBounds(0, 300, 250, 100);
		    
		    JButton draw = new JButton("Draw Card Here");
		    draw.setSize(50,20);
		    draw.addActionListener(new ClickListener());
		    draw.setLocation(200, 50);
		    
		    menu.add(draw);
		   
	}
	
		public void createFieldPanel() throws FileNotFoundException {
			
			//Set up the card field area.
	        field = new JPanel();
	        field.setBounds(50, 50, 250, 200);
	        
	       
	        //Create the card and add it.
	        gamePanel = new PlayingCardPanel();
	        
	        //Create a button and add a listener to it.
		    
			
		    // Add the button and the game panel to the frame
	        field.add(gamePanel);
		}
		
		private class ClickListener implements ActionListener 
		   {
		       public void actionPerformed(ActionEvent e) 
		       {
		    	  gamePanel.drawTopCard(getGraphics());
		       }
		   }
		private void openFile(String filePath) 
		{
			try {
		     Scanner in = new Scanner(new File(filePath));
			}
			catch (Exception e) {
				System.out.println("Invalid file path");
			}
		     repaint();
		  
		}
		private class openFileListener implements ActionListener
		{
		       public void actionPerformed(ActionEvent e)
		       {
		    	   JFileChooser myFileChooser = new JFileChooser();

		    	   int returnVal = myFileChooser.showOpenDialog(myMenu);
		    	   
		            if (returnVal == JFileChooser.APPROVE_OPTION) 
		            {
		                File userFile = myFileChooser.getSelectedFile();
		                openFile(userFile.toString());
		            } 
		    	   
		       }
		}
		
}
