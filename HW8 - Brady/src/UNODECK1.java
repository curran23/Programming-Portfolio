/**
  Class: UNODeck1
  Description: This class sets the UNO cards
 */
import java.util.*;

public class UNODECK1 {
	
	//Public fields
	public static final int FULL = 0;
	public static final int EMPTY = 1;
	public static final int FIRST_CARD = 0;
	
	//Instance Variables
	private Vector cards;	
	
	//Constructor: for a new deck
	public UNODECK1(int mode) {
		
		cards = new Vector(108, 0);
		
		if (mode == FULL) {
			initCards(cards);
		}	
	}
	
	public int getSize() {
		return cards.size();
	}
	
	/**
	 initCards: creates the UNO card set, in order,
	            but you should have another method that deals the deck
	 */
	protected Vector initCards(Vector cards) {
		
		for (int i = UNOCard1.RED; i != 4; i += 1) {
			
			for (int k = 0; k != 2; k++) {
				for (int j = 1; j != 10; j++) {
					cards.add(new UNOCard1(i, j));
				}
			}
			
			for (int j = 0; j != 2; j++) {
				cards.add(new UNOCard1(i, UNOCard1.DRAW_TWO));
				cards.add(new UNOCard1(i, UNOCard1.REVERSE));
				cards.add(new UNOCard1(i, UNOCard1.SKIP));
				
			}
			for (int j = 0; j != 1; j++) {
				cards.add(new UNOCard1(i, j));
				}
		
		}
		
		for (int i = 0; i != 4; i += 1) {
			cards.add(UNOCard1.NULL, new UNOCard1(UNOCard1.NULL, UNOCard1.WILD));
		}
		
		for (int i = 0; i != 4; i += 1) {
			cards.add(i, new UNOCard1(UNOCard1.NULL, UNOCard1.WILD_FOUR));
		}
		
		shuffleDeck();
		return cards;
	}
	
	/**
	 getCard(): This gets a card from the deck
	 */
	public UNOCard1 getCard(int index) {
		
		UNOCard1 card = (UNOCard1)cards.elementAt(index);
		cards.remove(index);
		return card;
	}
	
	public UNOCard1 showCard(int index) {
		return (UNOCard1)cards.elementAt(index);
	}
	
	/**
	 insertCard(): This inserts a card in the deck
	 */
	public void insertCard(UNOCard1 card) {
		cards.add(0, card);
	}
	
	public void insertCardAtLast(UNOCard1 card) {
		cards.add(card);
	}
	
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	public boolean exists(UNOCard1 card) {
		
		boolean sameColor = false;
		boolean sameValue = false;
		boolean isOnlyValue = card.getColor() == UNOCard1.NULL; //this tests if the method only wants a value withour regarding about the color
		
		for (int i = 0; i != cards.size(); i += 1) {
			sameColor = isOnlyValue? true: card.getColor() == showCard(i).getColor();
			sameValue = card.getValue() == showCard(i).getValue();
			
			if (sameColor && sameValue) return true;
		}
		
		return false;
	}
	
	/**
	 randomizeDeck(): This gets the deck and puts the cards in random order
	 */
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	
	public void sort() {
		Collections.sort(cards);
	}
	public String toString()
	{
		return cards.toString();
	}


	public static void main(String[] args)
	{
		UNODECK1 deck= new UNODECK1(0);
		
		
		while (deck.getSize() != 0)
		{
			
			deck.toString();
			System.out.println(deck);
			System.out.println(deck.getSize());
			UNOCard1 x = deck.getCard(FIRST_CARD);
			System.out.println(x);
			System.out.println(deck.getSize());
		}
		
	}
}
		
	

