package presentation;


 /**
 * Simple BallWorld Application.
 * 
 * Note: Adapted from Ball class by Tim Budd in the textbook
 *       Understanding Object-Oriented Programming with Java
 * 
 * @author Michael J. Holmes
 * @version 1.0 3/20/2013
 *
 */
public class BallWorldApp
{
  public static void main( String[] args )
  {
    MultiBallWorldFrame universe = new MultiBallWorldFrame(12);
    universe.setVisible( true );
  }
  

  
}

