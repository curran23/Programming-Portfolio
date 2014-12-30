import java.util.Random;

public class PlayingCard {
	
	/**This program will allow a user to create a random playing card from a standard
	 * 52 card deck or allow them to enter the suit and rank on their own.
	 * @author : Curran Lipsett
	 * @date   : 2/11/2013
	 * @version : 1.0
	 */

	// Instance Variables
		private String Suit;
		private String Rank;
			
		
	// Constructors
		// Creates a random playing card with a random Suit and a random Rank
		public PlayingCard() {
			Random randomSuitGenerator = new Random();
			Random randomRankGenerator = new Random();
			int suitRandom = randomSuitGenerator.nextInt(4);
			int rankRandom = randomRankGenerator.nextInt(13);
			// Assignments of the random choice for the card suit
			if (suitRandom == 0) {
				Suit = "Hearts";
			}
			else if (suitRandom == 1) {
				Suit = "Diamonds";
			}
			else if (suitRandom == 2) {
				Suit = "Clubs";
			}
			else
				Suit = "Spades";
			// Assignments of the random choice for the card rank
			if (rankRandom == 0) {
				Rank = "Ace";
			}
			else if (rankRandom == 1) {
				Rank = "Two";
			}
			else if (rankRandom == 2) {
				Rank = "Three";
			}
			else if (rankRandom == 3) {
				Rank = "Four";
			}
			else if (rankRandom == 4) {
				Rank = "Five";
			}
			else if (rankRandom == 5) {
				Rank = "Six";
			}
			else if (rankRandom == 6) {
				Rank = "Seven";
			}
			else if (rankRandom == 7) {
				Rank = "Eight";
			}
			else if (rankRandom == 8) {
				Rank = "Nine";
			}
			else if (rankRandom == 9) {
				Rank = "Ten";
			}
			else if (rankRandom == 10) {
				Rank = "Jack";
			}
			else if (rankRandom == 11) {
				Rank = "Queen";
			}
			else {
				Rank = "King";
			}
			
		}
		/**User can pass in the Suit and Rank of the playing card
		@param aSuit the suit the user wants
		@param aRank the rank the user wants
		*/
		
		public PlayingCard(String aSuit, String aRank) {
			Suit = aSuit;
			Rank = aRank;
		}
	// Class methods
		/**Returns the string representation of the Playing Card
		 * @return the rank and suit of the card
		 */
		
		public String toString() {
			String cardString = Rank + " of " + Suit;
			return cardString;
		}
		// Compares the current card with the players card and sees if they are equal
		public boolean equals(PlayingCard aCard) {
			if (this.Suit.equals(aCard.Suit) && this.Rank.equals(aCard.Rank)) {
				return true;
			}
			else {
				return false;
			}
			
		}
}

