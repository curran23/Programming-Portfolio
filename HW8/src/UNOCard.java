public class UNOCard implements IPlayingCard {

	// Instance Variables
	private String Color;
	private String Rank;
	private int aColor;
	private int aRank;
	
	// Constructors
	
	public UNOCard(String myColor, String myRank) {
		this.Color = myColor;
		this.Rank = myRank;
	}
	public UNOCard(int aColor, int aRank) {
		this.Color = convertToColor(aColor);
		this.Rank = convertToRank(aRank);
	}
	
	// Methods
	public String getRank() {
		return Rank;
	}
	
	public String getColor() {
		return Color;
	}
	
	public String toString() {

		String theCard = this.Color + ": " + this.Rank; 
		return theCard;
	}
	
	public int compareTo(UNOCard aCard) {
		if (aCard.aColor > this.aColor) {
			// current card has a lower color value
			return -1;
		}
		if (aCard.aColor < this.aColor){
			// current card has a higher color value
			return 1;
		}
		// card color is equal, so compare ranks
		else {
			if (aCard.aRank > this.aRank) {
				// current card has a lower rank
				return -1;
			}
			if (aCard.aRank < this.aRank){
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	
	// Convert an integer color into a string
	public String convertToRank (int rankNum)
	{
		switch (rankNum)
		{
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				return String.valueOf(rankNum);
			case 10:
				return "Reverse";
			case 11:
				return "Skip";
			case 12:
				return "Draw Two";
		}	
		return "Invalid Rank";
	}
	
	public String convertToColor (int colorNum)
	{
		switch (colorNum) 
		{
		case 0: 
			return "Red";
		case 1: 
			return "Yellow";
		case 2:
			return "Blue";
		case 3:
			return "Green";
		case 4:
			return "Black";
	}	
		return "Invalid Color";
}
}
