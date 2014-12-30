package presentation;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *  MultiBallWorldFrame is a frame that contains  multiple balls.
 *
* Note: Adapted from Ball class by Tim Budd in the textbook
*       Understanding Object-Oriented Programming with Java
*
* @author Michael J. Holmes
* @version 2.0 3/20/2013
*
*/

public class MultiBallWorldFrame extends JFrame
{
	  private static final int FRAME_WIDTH  = 1000;
	  private static final int FRAME_HEIGHT = 600;
	  protected static final int INTERACTIONS  = 5000;
	
	
  //---------------------------------------------------------
  // Instance Variables
  //---------------------------------------------------------





  //---------------------------------------------------------
  // Constructors
  //---------------------------------------------------------
  /**
   * Default constructor creates the frame and places one panel in it.
   */
  public MultiBallWorldFrame()
  {
    this(1);
  }

   /**
   * Default constructor creates the frame and places a number of panel in it.
   */
  public MultiBallWorldFrame(int numberOfWorlds)
  {
	  super();

	  setSize (FRAME_WIDTH, FRAME_HEIGHT);
	  setTitle("Multi Ball World");
	  this.setLayout(new GridLayout((numberOfWorlds%4),4));
	  
	  MultiBallWorldPanel x;

      for (int i = 0; i < numberOfWorlds; i++)
      {    	
    	  x = new MultiBallWorldPanel(5);
    	  add(x);    	  
      }
  }


  

  }
