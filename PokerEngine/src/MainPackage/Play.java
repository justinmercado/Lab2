package MainPackage;

import java.util.ArrayList;

public class Play extends CoryHand {
	public static void main(String[] args){
	Deck deck = new Deck();
	ArrayList<String> unshuffled = deck.newDeck();
	ArrayList<String> shuffled_deck = deck.deckShuffler(unshuffled);
	String[] hand1 = deck.hand(shuffled_deck);
	String[] hand2 = deck.hand(shuffled_deck);
	System.out.println(hand1);
	System.out.println(hand2);
	System.out.println("what");
	//System.out.println(Deck.cards_remaining(shuffled_deck));
	}
}
