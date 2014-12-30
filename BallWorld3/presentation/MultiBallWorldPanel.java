package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import ballworld.*;


/**
 *  MultiBallWorldPanel is a panel that contains  multiple balls.
 *
* Note: Adapted from Ball class by Tim Budd in the textbook
*       Understanding Object-Oriented Programming with Java
*
* @author Michael J. Holmes
* @version 2.0 3/20/2013
*
*/

public class MultiBallWorldPanel extends JPanel implements IBallWorldPanel
{

	  protected static final int INTERACTIONS  = 5000;
	
	
  //---------------------------------------------------------
  // Instance Variables
  //---------------------------------------------------------
  protected Ball[] ballArray;
  protected int counter;




  //---------------------------------------------------------
  // Constructors
  //---------------------------------------------------------
  /**
   * Default constructor creates the frame and places a ball
   * inside of it.
   */
  public MultiBallWorldPanel()
  {
    this(1);
  }

   /**
   * Default constructor creates the frame and places a ball
   * inside of it.
   */
  public MultiBallWorldPanel(int numberOfBalls)
  {
	  super();


	  this.setBorder(BorderFactory.createLineBorder(Color.black, 1));

      ballArray = new BoundedBall[numberOfBalls];
      for (int i = 0; i < ballArray.length; i++)
      {    	  
    	  int myDx = (int) (20 * Math.random());
    	  int myDy = (int) (10 * Math.random());
    	  
          ballArray[i] = new  BoundedBall(  84-i*2, 84-i*2, 10, myDx, myDy, this);
      }
      

  }

  public void paint( Graphics g )
  {
	  super.paint(g);
	  
      for (int i = 0; i < ballArray.length; i++)
      {
          ballArray[i].paint( g );
          ballArray[i].move();
      }

      try 
      {
  		Thread.sleep(10);
  	  } 
      catch (InterruptedException e) 
      {
  		e.printStackTrace();
  	  }
      
      counter = counter + 1;
      
      if ( counter < INTERACTIONS )
      {
          repaint();
      }
  }
  

  }
