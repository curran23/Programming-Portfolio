import java.util.ArrayList;
import java.util.Collections;

public class UNODeck implements IDeck {
	
	// Instance Variables
	private ArrayList<UNOCard> myDeck = new ArrayList<UNOCard>();
	public int[] ranks2 = {0,1,2,3,4,5,6,7,8,9,10,11,12};
	//public int[] colors2 = {0,1,2,3};
	public int[] colors2 = {0,1,2,3};
	// Constructor
	public UNODeck() {
		for (int color: colors2) {
			for (int rank: ranks2) {
				myDeck.add(new UNOCard(color, rank));
				myDeck.add(new UNOCard(color, rank));
			}
		}
		myDeck.add(new UNOCard("Black", "Wild"));
		myDeck.add(new UNOCard("Black", "Wild"));
		myDeck.add(new UNOCard("Black", "Wild"));
		myDeck.add(new UNOCard("Black", "Wild"));
		myDeck.add(new UNOCard("Black", "Wild Draw 4"));
		myDeck.add(new UNOCard("Black", "Wild Draw 4"));
		myDeck.add(new UNOCard("Black", "Wild Draw 4"));
		myDeck.add(new UNOCard("Black", "Wild Draw 4"));
	}
	
	// Methods
	public void shuffle() {
		Collections.shuffle(myDeck);
	}
	public String toString() {
		return myDeck.toString();
	}
	public void reset() {
		myDeck.clear();
		UNODeck myDeck = new UNODeck();
	}
	public int size() {
		return myDeck.size();
	}

	public UNOCard drawTopCard() throws OutOfCardsException {
		myDeck.remove(0);
		return myDeck.get(0);
		}
}