


import java.awt.Color;
import java.awt.Graphics;

/**
 *  Disk is a base class that draws circles.
 *  
* Note: Adapted from Ball class by Tim Budd in the textbook
*       Understanding Object-Oriented Programming with Java
* 
* @author Michael J. Holmes
* @version 1.0 2/20/2013
*
*/

public class Disk
{
  //----------------------------------------------
  //  Instance Variables
  //----------------------------------------------
  protected int   x;
  protected int   y;
  protected int   radius;
  protected Color color;

  
  //----------------------------------------------
  //  Constructors
  //----------------------------------------------  
  
  /**
   * Constructor to create a disk at the x,y coordinates with a given radius. 
   * 
   * @param x The initial x coordinate of the disk.
   * @param y The initial y coordinate of the disk.
   * @param r The initial radius of the disk.
   */
  public Disk( int x, int y, int r )
  {
    this.x = x;
    this.y = y;
    radius = r;
    color  = Color.red;
  }

  /**
   * Paints the disk onto the frame.
   * 
   * @param g The graphics environment variables.
   */
  public void paint( Graphics g )
  {
    g.setColor( color );
    g.fillOval( x, y, radius*2, radius*2 );
  }
  
  /**
   * Moves the x and y coordinates by the deltaX and deltaY values.
   * 
   * @param deltaX The delta for the x coordinate.
   * @param deltaY The delta for the y coordinate.
   */
  protected void moveBy( int deltaX, int deltaY )
  {
    x += deltaX;
    y += deltaY;
  }
}
