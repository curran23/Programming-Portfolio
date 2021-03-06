



import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


/**
 *  MultiBallWorldFrame is a frame that contains  multiple balls.
 *
* Note: Adapted from Ball class by Tim Budd in the textbook
*       Understanding Object-Oriented Programming with Java
*
* @author Michael J. Holmes
* @version 2.0 2/20/2013
*
*/

public class MultiBallWorldFrameWithControl extends JFrame implements IBallWorldFrame
{
	  private static final int FRAME_WIDTH  = 600;
	  private static final int FRAME_HEIGHT = 400;
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
  public MultiBallWorldFrameWithControl()
  {
    this(1);
  }

   /**
   * Default constructor creates the frame and places a ball
   * inside of it.
   */
  public MultiBallWorldFrameWithControl(int numberOfBalls)
  {
	  super();

	  setSize (FRAME_WIDTH, FRAME_HEIGHT);
	  setTitle("Multi Ball World");

      ballArray = new BoundedBall[numberOfBalls];
      for (int i = 0; i < ballArray.length; i++)
      {    	  
    	  int myDx = (int) (20 * Math.random());
    	  int myDy = (int) (10 * Math.random());
    	  
          ballArray[i] = new  BoundedBall(  84-i*2, 84-i*2, 10, myDx, myDy, this);
      }
      
          Button moveButton = new Button( "Move");
          moveButton.addActionListener( new MoveButtonListener());
          add("South", moveButton);
  }

  public void paint( Graphics g )
  {
	  super.paint(g);
	  
      for (int i = 0; i < ballArray.length; i++)
      {
          ballArray[i].paint( g );
      }
  }
  
  
  
  //---------------------------------------------------------
  // Inner Classes
  //---------------------------------------------------------
  
  private class MoveButtonListener implements ActionListener
  {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		for (int i = 0; i < ballArray.length; i++)
		{
			ballArray[i].move();
		}

	
	}

	  
  }

  }
