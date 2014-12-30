public interface IDeck {
	
	public void reset();
	
	public void shuffle();
	
	public UNOCard drawTopCard() throws OutOfCardsException;

}
