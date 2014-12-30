
    /**
     * This is the main class for the first die example.
     *  
     * @author Michael J. Holmes
     * @version 1.0 Dec 17, 2012
     * 
     */

public class DieRollerExample {

    /**
     * The main program that runs, and prints out the results of rolling a die twice
     * to the console.
     *  
     * @param args Standard input argument list that is not used in this program.
     * 
     */
    public static void main(String[] args){
        Die die1 = new Die(8);
        Die die2 = new Die(20);
        
        System.out.println("You rolled a: " + die1.roll() + " and a " + die1.roll() + 
        		" on an 8 sided die");
        System.out.println("You rolled a: " + die2.roll() + " and a " + die2.roll() +
        		" on a 20 sided die");
        
    }
	
	
}
