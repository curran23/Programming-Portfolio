
public class PlayingCard 
{
	private String suit;
	private String rank;
	
	public PlayingCard() 
	{
		suit = "blank";
		rank = "blank";
	}
	
	public PlayingCard(String aSuit, String aRank) 
	{
		suit = aSuit;
		rank = aRank;
	}
	
	public PlayingCard(int aSuit, int aRank) throws InvalidRankException, InvalidSuitException
	{
		try 
		{
		suit = convertToSuit(aSuit);
		rank = convertToRank(aRank);
		}
		catch(InvalidRankException e)
		{
			throw e;
		}
		catch(InvalidSuitException e1)
		{
			throw e1;
		}
	}
	public String toString() {
		return this.rank + " of " + this.suit;
	}
	
	
	
	private String convertToRank(int rankNum) throws InvalidRankException
	{
		switch (rankNum)
		{
			case 1:
				return "Ace";
			
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				return String.valueOf(rankNum);
			
			case 11:
				return "Jack";
			
			case 12:
				return "Queen";
			
			case 13:
				return "King";
				
		}
		
		throw new InvalidRankException("No rank: " + rankNum);
	}

	
	private String convertToSuit(int suitNum) throws InvalidSuitException
	{
		switch (suitNum)
		{
			case 1:
				return "Clubs";
			
			case 2:
				return "Diamonds";
			
			case 3:
				return "Hearts";
						
			case 4:
				return "Spades";
				
		}
		
		throw new InvalidSuitException("No suit: " + suitNum);
	}

	
	


}
