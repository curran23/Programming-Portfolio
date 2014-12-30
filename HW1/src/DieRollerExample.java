
    /**
     * Main program for the die class
     *  
     * @author Curran C Lipsett
     * @date 1/30/2013
     * 
     */

public class DieRollerExample {

    /**
     * Program runs and rolls two separate die, one is 8 sided and one is 20 sided
     *  
     * @param args Standard input argument list that is not used in this program.
     * 
     */
    public static void main(String[] args){
    	// Die object with 8 sides
        Die die1 = new Die(8);
        // Die object with 20 sides
        Die die2 = new Die(20);
        
        System.out.println("You rolled a: " + die1.roll() + " and a " + die1.roll() + 
        		" on an 8 sided die");
        System.out.println("You rolled a: " + die2.roll() + " and a " + die2.roll() +
        		" on a 20 sided die");
        
    }
	
	
}
