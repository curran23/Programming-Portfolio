public interface IPlayingCard extends Comparable<UNOCard> {

	public String getColor();
	
	public String getRank();
	
	public int compareTo(UNOCard aCard);
	
	
}
