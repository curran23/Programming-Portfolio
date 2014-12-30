import java.util.Scanner;

public class GuessACardApp {

	/**
	 * @author CurranLipsett
	 * @date  : 2/11/2013
	 * @version : 1.0
	 */
	public static void main(String[] args) {
		// Create a scanner object for the user input
		Scanner in = new Scanner(System.in);
		// Create the random card
		PlayingCard card1 = new PlayingCard();
		
		// Get the user's guess
		System.out.println("Enter your guesses with the first letter capitalized");
		System.out.print("Enter the suit you think my card is: ");
		String userSuit = in.next();
		System.out.println("Note: You must enter the rank as text, not a number");
		System.out.print("Enter the rank you think my card is: ");
		String userRank = in.next();
		// Create the players card using the values they provided
		PlayingCard card2 = new PlayingCard(userSuit, userRank);
		
		/** Compare to see if the two cards are equal and tell the user what the card was
		if they are wrong
		**/
		if (card1.equals(card2)) {
			System.out.println("You got it!");
		}
		else {
			System.out.println("No, it was the: " + card1.toString());
		}
	}	

} 
