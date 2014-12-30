package ballworld;

/**
 * This class represents a 2 dimensional ball that can be graphically drawn and 
 * move within the window.
 *
 * Note: Adapted from Ball class by Tim Budd in the textbook
 *       Understanding Object-Oriented Programming with Java
 * 
 * @author Michael J. Holmes
 * @version 1.0 2/20/2013
 *
 */

public class Ball extends Disk
{
	//-----------------------------------------
	// Instance Variables
	//-----------------------------------------
    protected int deltaX;
    protected int deltaY;

    
    /**
     * Constructs a ball at the given coordinates, with the
     * radius and x and y deltas.
     * 
     * @param x	The beginning x coordinate.
     * @param y The beginning y coordinate.
     * @param r The radius of the ball.
     * @param dx The delta in the x coordinate for moving.
     * @param dy The delta in the y coordinate for moving.
     */
    public Ball( int x, int y, int r, int dx, int dy )
    {
        super( x, y, r );
        deltaX = dx;
        deltaY = dy;
    }

    /**
     * This method moves the ball and resets the x,y coordinates based
     * on the deltaX and deltaY values.
     */
    public void move()
    {
        moveBy( deltaX, deltaY );
    }
    
    protected void reverseDeltaX()
    {
    	deltaX *= -1;
    }
    
    protected void reverseDeltaY()
    {
    	deltaY *= -1;
    }
    
}
