import java.util.Random;

/** 
 * The Die class represents a die of variable sides, and
 * can be rolled to return a random value.
 * 
 * @author Curran C Lipsett
 * @date 1/30/2013
 */
public class Die
{
	//----------------------------------------------------------------------------------
    // Instance Variables
	//----------------------------------------------------------------------------------
	// Number of sides that the die is going to have
	private int numSides;
	// Get a random number that is between 1 and the number of sides on the die
    private Random myRandomNumGenerator;
    
    
    
    //----------------------------------------------------------------------------------
    //Constructors
    //----------------------------------------------------------------------------------
    /** 
     * Default constructor creates a 6-sided die.
     */
    public Die(){
    	// Default number of sides for a die is 6
        numSides = 6;
        myRandomNumGenerator = new Random();
    }
    
    
    /** 
     * This constructor takes in a single integer value and create a die with
     * that number of sides.
     * 
     * @param aNumSides Number of sides to create on the die.
     */
    public Die(int aNumSides){
    	// Number of sides the user wants on the die
        numSides = aNumSides; 
        myRandomNumGenerator = new Random();
    }
    
    //----------------------------------------------------------------------------------
    //Class Methods
    //----------------------------------------------------------------------------------
    /** 
     * Getter for the number of sides on the die.
     * 
     * @return The number of sides on the die.
     */
    public int getNumOfSides() 
    {	// The number of sides on the die
        return numSides;
    }
    
  
    /** 
     * Rolls the die to get a random value.
     * 
     * @return A random value between 1 and the number of sides.
     */
    public int roll() 
    {	// Return a random number between 1 and the number of sides to simulate a roll
        return myRandomNumGenerator.nextInt(numSides) + 1;
    }
    
}

