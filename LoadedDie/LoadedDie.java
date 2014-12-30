import java.util.Random;
/** 
 * @author CurranLipsett
 * @date 2/27/2013
 * @version 1.0
 * 
 * This class extends the Die class and allows the user to load one side of the die so that it 
 * will come up approximately the percentage they have entered.
 * 
 */


public class LoadedDie extends Die {
	
	// Instance Variables
	private int loadedValue;
	private double loadedPercentage;
	private Random random1;
	
	// Constructors
	
	// Default constructor creates a six sided die with loadedValue = 6 and 
	// loadedPercentage = .9
	
	public LoadedDie() {
		numSides = 6;
		loadedValue = 6;
		loadedPercentage = .90;
	}
	
	public LoadedDie(int aNumSides, int aLoadedValue, double aLoadedPercentage) {
		numSides = aNumSides;
		loadedValue = aLoadedValue;
		loadedPercentage = aLoadedPercentage;
		random1 = new Random();
	}
	
	public int roll() {
		int myValue = random1.nextInt(numSides + 1);
		double targetNumber = (numSides *  loadedPercentage);
		
		if (myValue > targetNumber) {
			return random1.nextInt(numSides + 1);
		}
		else {
			return loadedValue;
		}
	}

}
