package presentation;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** 
 * The DieFrame class contains a Frame with two dice and a roll button.
 * 
 * @author Michael J. Holmes
 * @version 1.0 Dec 17, 2012.
 */
public class DiceFrame extends JFrame
{
	//----------------------------------------------------------------------------------
    // Instance Variables
	//----------------------------------------------------------------------------------
    private DiePanel die1;
    private DiePanel die2;
    private JPanel field;
    private JPanel menu;
   

    
	//----------------------------------------------------------------------------------
    // Constructors
	//----------------------------------------------------------------------------------    
    public DiceFrame()
    {
       /** 
        * Default constructor.
       */
    	
       // Initialize the frame properties
	   this.setLayout(new FlowLayout());
	   this.setSize( 300, 300 );
       this.setTitle( "Lucky Dice " );


       this.createFieldPanel();
       this.createMenuPanel();
       

       //Add the field and menu panels to the frame.
       this.add(field);
       this.add(menu);
   }
   
    
	//----------------------------------------------------------------------------------
    // Class Methods
	//----------------------------------------------------------------------------------    
    
   
    

    
  
	//----------------------------------------------------------------------------------
    // Private Helpers
	//----------------------------------------------------------------------------------  

    /** 
     * Build the menu panel.
    */
    private void createMenuPanel()
    {
      //Set up the menu area.
      menu = new JPanel();
      menu.setBounds(0,300,250,100);
   
      //Create a button and add a listener to it.
      JButton rollButton = new JButton("Re-Roll");
      rollButton.setSize(300,200);
   
      rollButton.addActionListener(new RollListener());
   
      //Add the button to the menu area.
      menu.add(rollButton);
    }
    
    
    /** 
     * Build the field panel.
    */
    private void createFieldPanel()
    {
        //Set up the dice field area.
        field = new JPanel();
        field.setBounds(0,0,250,200);
       
        //Create the dice and add them.
        die1 = new DiePanel();
        die2 = new DiePanel();
       
        field.add(die1);
        field.add(die2);
               
    	
    }
    
    
    
    
   private class RollListener implements ActionListener 
   {
       public void actionPerformed(ActionEvent e) 
       {
    	   die1.rollDie();
    	   die2.rollDie();
       }
   }
}