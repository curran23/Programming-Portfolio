import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StandardDeck implements IDeck {
	
	// Instance Variables
	ArrayList<PlayingCard> myDeck = new ArrayList<PlayingCard>(); 
	public int Suits[] = {0,1,2,3};
	public int Ranks[] = {0,1,2,3,4,5,6,7,8,9,10,11,12};
	
	// Implementing the reset method of the interface
	public void reset()  {
		StandardDeck myDeck = new StandardDeck();
		}
	
	// Implementing the shuffle method of the interface
	public void shuffle() {
		
		Collections.shuffle(myDeck);
		
	}
	
	// Implementing the drawTopCard method of the interface
	public PlayingCard drawTopCard() {
		PlayingCard myCard = myDeck.get(0);
		myDeck.remove(0);
		return myCard;
	}
	
	// Constructor for a standard deck of cards
	public StandardDeck() {
		
		for (int suit: Suits) {
			for (int rank: Ranks) {
				myDeck.add(new PlayingCard(suit, rank));
			}
		}
	}
	
	public StandardDeck(String filename) throws FileNotFoundException {
		//Scanner in = new Scanner(new File("EuchreDeck.txt"));
		Scanner in = new Scanner(new File("OldMaidDeck.txt"));
		// pass in myFile for EuchreDeck.txt, or myFile2 for OldMaidDeck.txt
		while (in.hasNextLine()) {
			String line = in.nextLine();
			int i = 0;
			while (Character.isLetterOrDigit(line.charAt(i))) {
				i++;
		}
			String rank = line.substring(0, i);
			String suit = line.substring(i).replace(",", "");
			myDeck.add(new PlayingCard(suit, rank));
		}
		in.close();
	}		
}
