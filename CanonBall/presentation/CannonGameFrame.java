package presentation;
/**
 *  CannonGameFrame draws a cannon and a target and simulates a shot.
 *  
* Note: Adapted from Ball class by Tim Budd in the textbook
*       Understanding Object-Oriented Programming with Java
* 
* @author Michael J. Holmes
* @version 1.0 2/20/2013
*
*/


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import ballworld.*;

public class CannonGameFrame extends JFrame
{
  private static final int FrameWidth  =  600;
  private static final int FrameHeight =  400;

  //--------------------------------------------------------------
  // Instance Variables
  //--------------------------------------------------------------
  private int        angle;
  private String     message;
  private CannonBall cannonBall;
  private Scrollbar  angleSlider;

  
  
  //--------------------------------------------------------------
  // Constructors
  //--------------------------------------------------------------
  
  /**
   * Default constructor that draws the inital game.
   */
  public CannonGameFrame()
  {
    super();

    setSize ( FrameWidth, FrameHeight );
    setTitle( "Cannon World" );
    
    
    angle      = 30;
    message    = "Angle: " + angle;
    cannonBall = null;

    angleSlider = new Scrollbar( Scrollbar.VERTICAL, angle, 5, 0, 95 );
    angleSlider.addAdjustmentListener( new AngleSliderListener() );
    add( "East", angleSlider );

    JButton fire = new JButton( "shoot a cannonball" );
    fire.addActionListener( new FireButtonListener() );
    add( "North", fire );
    
  }

  
  //--------------------------------------------------------------
  // Class Methods
  //--------------------------------------------------------------
  
  /**
   * Draws the game screen.
   */
  
  public void paint( Graphics g )
  {
	super.paint(g);
    drawCannon    ( g );
    drawTarget    ( g );
    drawCannonBall( g );
    writeMessage  ( g );
  }

  /**
   * Helper method to draw the cannon.
   * @param g
   */
  protected void drawCannon( Graphics g )
  {
    int x = 20;
    int y = 15;

    double radianAngle = angle * Math.PI / 180.0;

    int lv = (int) ( 30 * Math.sin(radianAngle) );
    int lh = (int) ( 30 * Math.cos(radianAngle) );
    int sv = (int) ( 10 * Math.sin(radianAngle + Math.PI/2) );
    int sh = (int) ( 10 * Math.cos(radianAngle + Math.PI/2) );

    g.setColor( Color.green );
    g.drawLine( x, dy(y), x+lh, dy(y+lv) );
    g.drawLine( x+lh, dy(y+lv), x+lh+sh, dy(y+lv+sv) );
    g.drawLine( x+lh+sh, dy(y+lv+sv), x+sh, dy(y+sv) );
    g.drawLine( x+sh, dy(y+sv), x, dy(y) );
    g.fillOval( x-8, dy(y+10), 12, 12 );
  }

  /** 
   * Helper method to draw the target.
   * @param g
   */
  protected void drawTarget( Graphics g )
  {
    g.setColor( Color.blue );
    g.fillRect( FrameWidth-100, dy(12), 50, 10 );
  }

  
/**
 * Helper method to draw the cannonball moving.
 * @param g
 */
  protected void drawCannonBall( Graphics g )
  {
    if ( cannonBall == null ) return;

    cannonBall.move();
    cannonBall.paint( g );

    if ( dy(cannonBall.y()) > 0 )
    {
      try 
      {
		  Thread.sleep(10);
	  } 
      catch (InterruptedException e) 
      {
		  e.printStackTrace();
	  }	
    	
      repaint();
    }
    else
    {
      int ballX   = cannonBall.x();
      int targetX = FrameWidth - 100;

      if ( ballX < targetX )
        message = sorryMessageFor( targetX - ballX );
      else if ( ballX > (targetX + 50) )
        message = sorryMessageFor( ballX - targetX - 50 );
      else
        message = "Congratulations!";

      cannonBall = null;
    }
  }

  /**
   * Helper method that writes the message to the screen.
   * @param g
   */
  protected void writeMessage( Graphics g )
  {	
    g.drawString( message, 10, FrameHeight/2 );
  }

  /**
   * Calulates the height.
   * @param y
   * @return
   */
  public int dy( int y )
  {
    return FrameHeight - y;
  }

/**
 * Helper method to format the sorry message.
 * @param units
 * @return
 */
  protected String sorryMessageFor( int units )
  {
    return "Sorry... You missed by " + units + " feet.";
  }

  
  
    
  
  //--------------------------------------------------------------
  // Inner classes
  //--------------------------------------------------------------

  private class FireButtonListener implements ActionListener
  {
    public void actionPerformed( ActionEvent e )
    {
      double angleInRadians = angle * Math.PI / 180.0;
      double sinAngle       = Math.sin( angleInRadians );
      double cosAngle       = Math.cos( angleInRadians );
      
      cannonBall = new CannonBall( 15 + (int) (30 * cosAngle),
                                   dy(5+(int) (30 * sinAngle)),
                                   5, 12 * cosAngle, -12 * sinAngle );
      repaint();
    }
  }

  private class AngleSliderListener implements AdjustmentListener
  {
    public void adjustmentValueChanged( AdjustmentEvent e )
    {
      angle   = angleSlider.getValue();
      message = "Angle: " + angle;
      repaint();
    }
  }
}
