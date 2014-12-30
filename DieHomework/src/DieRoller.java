
public class DieRoller {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		Die die1 = new Die(8);
		Die die2 = new Die(20);
		
		System.out.println("You rolled a " + die1.roll() + " on an 8 sided die");
		System.out.println("You rolled a " + die2.roll() + " on an 20 sided die");

	}

}
