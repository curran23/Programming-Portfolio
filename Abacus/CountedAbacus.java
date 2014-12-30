/**
 * This class models an abucus.  It can add and subtract integer values,
 * and keeps track of how many calculations it has made.
 * 
 * 
 * @author Michael J. Holmes
 * @version Version 1.0 2/20/2013
 *
 */
public class CountedAbacus extends Abacus 
{
	//--------------------------------------------------------------
	// Instance Variables 
	//--------------------------------------------------------------
	private int numberOfCalculations;
	
	
	//--------------------------------------------------------------
	// Constructors
	//--------------------------------------------------------------
	
	/**
	 * Default constructor that creates initializes the values to 0. 
	 */
	public CountedAbacus() 
	{
		clear();
	}
	
	/**
	 * Resets the values to 0.
	 * 
	 */
	public void clear() 
	{
		super.clear();
		numberOfCalculations = 0;
	}
	
	
	/**
	 * Adds the value and increments the counter.
	 * 
	 * @param myNumber The number to add
	 */
	public void add(int myNumber) 
	{
		super.add(myNumber);
		numberOfCalculations++;
	}
	
	/**
	 * Subtracts the value and increments the counter.
	 * 
	 * @param myNumber The number to subtract
	 */
	public void subtract(int myNumber) 
	{
		super.subtract(myNumber);
		numberOfCalculations++;
	}
	
	/**
	 * Returns the number of calculations since the last reset.
	 * 
	 * @return The number of calculations
	 */
	public int getNumberOfCalculations() 
	{
		return numberOfCalculations;
	}

}
