package MainPackage;

import java.util.ArrayList;

public class Play extends Hand {
	public static void main(String[] args){
	Deck deck = new Deck();
	ArrayList<String> unshuffled = deck.newDeck();
	ArrayList<String> shuffled_deck = deck.deckShuffler(unshuffled);
	String[] hand1 = deck.hand(shuffled_deck);
	String[] hand2 = deck.hand(shuffled_deck);
		
	
	}
}
