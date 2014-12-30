package presentation;

import java.awt.*;
import javax.swing.*;
import gamecomponents.*;


/** 
 * The DiePanel class draws the image of a die.
 * 
 * @author Michael J. Holmes
 * @version 1.0 Dec 17, 2012.
 */

public class DiePanel extends JPanel 
{
	
	
	//----------------------------------------------------------------------------------
    // Instance Variables
	//----------------------------------------------------------------------------------
    private static final int PIP_DIAMETER = 15;
    private Die myDie;
      
  
	//----------------------------------------------------------------------------------
    // Constructors
	//----------------------------------------------------------------------------------
    
    /** 
     * Default constructor creates a white die.
     */
    public DiePanel() 
    {
        myDie = new Die();
    
        this.setBackground(Color.green);
        this.setPreferredSize(new Dimension(100,100));   
    }
    
    
    //----------------------------------------------------------------------------------
    //Class Methods
    //----------------------------------------------------------------------------------
    /** 
     * Rolls the die and repaints the display to the new result.
     */
    public void rollDie()
    {
       repaint();    
    }


    /** 
     * Defines how this object is drawn on the screen.
     * 
     * @param g The Graphics object to draw to.
     */
    public void paintComponent(Graphics g) 
    {
    	// Required to draw the panel.
        super.paintComponent(g);
        
        // Initialize local variables.
        int panelWidth = this.getWidth();
        int panelHeight = this.getHeight(); 
        
        // Draw the outside border of die.
        g.drawRoundRect(0, 0, panelWidth-1, panelHeight-1, 10, 10);
                
        // Add on the pips.
        this.drawPips(g, myDie.roll());
    }
    
    
    
    //----------------------------------------------------------------------------------
    // Private Helper Methods
    //----------------------------------------------------------------------------------
    
    /** 
     * Defines how this object is drawn on the screen.
     * 
     * @param g The Graphics object to draw to.
     * @param numberOfPips the number of pips to draw on the die.
     */    
    private void drawPips(Graphics g, int numberOfPips)
    {
    	//Initialize local variables.
        int panelWidth = this.getWidth();
        int panelHeight = this.getHeight(); 
    	
        //Conditinal to determine how many and locations of pips.
    	switch (numberOfPips) 
        {
        case 1: drawPip(g, panelWidth/2, panelHeight/2);
                break;
        
        case 2: drawPip(g, panelWidth/4, panelHeight/4);
                drawPip(g, 3*panelWidth/4, 3*panelHeight/4);
                break;
                
        case 3: drawPip(g, panelWidth/2, panelHeight/2);
        		drawPip(g, panelWidth/4, panelHeight/4);
        		drawPip(g, 3*panelWidth/4, 3*panelHeight/4);
                break;
        
        case 4: drawPip(g, panelWidth/4, panelHeight/4);
                drawPip(g, 3*panelWidth/4, 3*panelHeight/4);
                drawPip(g, 3*panelWidth/4, panelHeight/4);
                drawPip(g, panelWidth/4, 3*panelHeight/4);
                break;
                
        case 5: drawPip(g, panelWidth/2, panelHeight/2);
                drawPip(g, panelWidth/4, panelHeight/4);
                drawPip(g, 3*panelWidth/4, 3*panelHeight/4);
                drawPip(g, 3*panelWidth/4, panelHeight/4);
                drawPip(g, panelWidth/4, 3*panelHeight/4);
                break;
                
        case 6: drawPip(g, panelWidth/4, panelHeight/4);
                drawPip(g, 3*panelWidth/4, 3*panelHeight/4);
                drawPip(g, 3*panelWidth/4, panelHeight/4);
                drawPip(g, panelWidth/4, 3*panelHeight/4);
                drawPip(g, panelWidth/4, panelHeight/2);
                drawPip(g, 3*panelWidth/4, panelHeight/2);
                break;
         }
    }
    
    
    /** 
     * Defines how this object is drawn on the screen.
     * 
     * @param g The Graphics object to draw to.
     * @param x the x coordinate of where to draw the pip.
     * @param y the y coordinate of where to draw the pip.
     */       
    private void drawPip(Graphics g, int x, int y) 
    {
        g.fillOval(x-PIP_DIAMETER/2, y-PIP_DIAMETER/2, PIP_DIAMETER, PIP_DIAMETER);
    }
    
    
    
    
}