public class PlayingCard implements IPlayingCard{
	
	// Instance Variables
	
	protected String Suit;
	protected String Rank;
	
	// Implementing the getSuit method from the interface
	public String getSuit() {
		
		return Suit;
		
	}
	
	public String toString() {
		String theCard = this.Rank + " of " + this.Suit;
		return theCard;
	}
	// Implementing the getRank method from the interface
	public String getRank() {

		return Rank;
	}
	
	// Implementing the compareTo method form the Comparable interface
	public int compareTo(PlayingCard aCard) {
		if (this.Suit.equals(aCard.getSuit()) && this.Rank.equals(aCard.getRank())) {
			return 1;
		}
		return 0;
		
	}
	
	// Constructor for a playing card
	public PlayingCard(int aSuit, int aRank) {
		this.Suit = convertToSuit(aSuit);
		this.Rank = convertToRank(aRank);
	}
	public PlayingCard(String mySuit, String myRank) {
		this.Suit = mySuit;
		this.Rank = myRank;
	}
	public String convertToRank (int rankNum)
	{
		switch (rankNum)
		{
			case 0:
				return "Two";
			case 1:
				return "Three";
			case 2:
				return "Four";
			case 3:
				return "Five";
			case 4:
				return "Six";
			case 5:
				return "Seven";
			case 6:
				return "Eight";
			case 7:
				return "Nine";
			case 8:
				return "Ten";
			case 9:
				return "Jack";
			case 10:
				return "Queen";
			case 11:
				return "King";
			case 12:
				return "Ace";
		}	
		return "Invalid Rank";
	}
	
	public String convertToSuit (int colorNum)
	{
		switch (colorNum) 
		{
		case 0: 
			return "Clubs";
		case 1: 
			return "Hearts";
		case 2:
			return "Diamonds";
		case 3:
			return "Spades";
	}	
		return "Invalid Color";
}

}
