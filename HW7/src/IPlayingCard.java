public interface IPlayingCard extends Comparable<PlayingCard> {

	public String getSuit();
	
	public String getRank();
	
	public int compareTo(PlayingCard aCard);
	
	
}
