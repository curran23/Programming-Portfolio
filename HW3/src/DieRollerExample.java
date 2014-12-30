

import java.util.Scanner;

    /**
     * This is the main class for the first die example.
     *  
     * @author Michael J. Holmes
     * @version 2.0 February 5, 2013
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
    
	
	public static void main(String[] args)
	{

        //Local variables 	
    	Die die1;
        int numberOfSides;
        String reRoll = "Y";
    	Scanner in = new Scanner(System.in);
        
        //Get user input
        System.out.print("Enter the number of sides for your die: ");
        numberOfSides = in.nextInt();
        
        //Instantiate die
        //die1 = new Die(numberOfSides);
    	die1 = new LoadedDie(numberOfSides,5,.5);
    	
       while (reRoll.toUpperCase().startsWith("Y"))
       {	   
    	 //Print out results
        
        System.out.println("You rolled a: " + die1.roll() );
    
         //Prompt user to roll again
         System.out.print("Roll again (Y)es or (N)o: ");
         reRoll = in.next();   
       }
       
       System.out.print("Bye");
       
     }
	
	
}
