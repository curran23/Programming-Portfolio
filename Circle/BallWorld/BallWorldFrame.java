import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *  BallWorld Frame is a frame that contains balls.
 *  
* Note: Adapted from Ball class by Tim Budd in the textbook
*       Understanding Object-Oriented Programming with Java
* 
* @author Michael J. Holmes
* @version 1.0 2/20/2013
*
*/

public class BallWorldFrame extends JFrame
{
  private static final int FRAME_WIDTH  = 600;
  private static final int FRAME_HEIGHT = 400;
  private static final int INTERACTIONS  = 50;

	
  //---------------------------------------------------------
  // Instance Variables
  //--------------------------------------------------------- 
  private Ball ball;
  private int  counter;

  
  
  //---------------------------------------------------------
  // Constructors
  //---------------------------------------------------------
  /**
   * Default constructor creates the frame and places a ball
   * inside of it.
   */
  public BallWorldFrame()
  {
    super();

    setSize ( FRAME_WIDTH, FRAME_HEIGHT );
    setTitle( "Ball World" );

    ball    = new Ball( 84, 84, 10, 10, 5 );
    counter = 0;
  }
  
  
  //---------------------------------------------------------
  // Class Methods
  //---------------------------------------------------------
  /**
   * Paints the ballworld frame and moves the ball within it.
   * 
   * @param g The graphics environment variables for the application.
   */ 
  public void paint( Graphics g )
  {
	  super.paint(g);
    ball.paint( g );
    ball.move();
    counter++;

    if ( counter >= INTERACTIONS ) 
    {	
    	return;
    }

    try 
    {
		Thread.sleep(60);
	} 
    catch (InterruptedException e) 
    {
		e.printStackTrace();
	}
    
    repaint();
  }
}
