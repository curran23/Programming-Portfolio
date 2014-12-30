
/**
 * This class models an abucus.  It can add and subtract integer values.
 * 
 * 
 * @author Michael J. Holmes
 * @version Version 1.0 2/20/2013
 *
 */


public class Abacus 
{

	//--------------------------------------------------------------
	// Instance Variables 
	//--------------------------------------------------------------
	private int currentNumber;

	
	
	//--------------------------------------------------------------
	// Constructors
	//--------------------------------------------------------------	
	/**
	 * Default constructor that creates initializes the value to 0. 
	 */
	public Abacus() 
	{
		clear();
	}
	
	
	//--------------------------------------------------------------
	// Class Methods
	//--------------------------------------------------------------
	
	/**
	 * Returns the current value stored in the abacus.
	 *  
	 *  @return The current value.
	 */
	public int getCurrentNumber()
	{
		return currentNumber;
	}
	
	/**
	 * Resets the the value to 0. 
	 */
	public void clear()
	{
		currentNumber = 0;
	}
	
	/**
	 * Adds the number to the current value.
	 * 
	 *  @param myNumber The number to add.
	 */
	public void add(int myNumber)
	{
		currentNumber += myNumber;
	}

	/**
	 * Subtracts the number from the current value.
	 * 
	 *  @param myNumber The number to subtract.
	 */
	public void subtract(int myNumber)
	{
		currentNumber -= myNumber;
	}
	

}
