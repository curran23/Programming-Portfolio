
// Extension of the Abacus class

public class CountedAbacus2 extends Abacus {
	
	// Instance Variables
	
	private int counter;
	
	// Constructors
	
	public CountedAbacus2() {
		clear();
	}
	// Class Methods
	
	public void clear() {
		super.clear();
		counter = 0;
	}
	
	public void add(int myNumber) {
		super.add(myNumber);
		counter ++;
	}
	
	public void subtract(int myNumber) {
		super.subtract(myNumber);
		counter --;
	}
	
	public int getNumberOfCalculations() {
		return counter;
	}
}
