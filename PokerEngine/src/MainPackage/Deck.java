package MainPackage;
	

import java.util.ArrayList;
import java.util.Random;

public class Deck extends Card  {

	public Deck() {
		super(rank, suit);
		// TODO Auto-generated constructor stub
	}

	/*
	 * A deck is an object.
ï	Each deck (you could have multiple decks, depending on the game) 
	is an array of cards.
ï	When you instantiate a deck, you should build the array list of cards.  
	You should also shuffle the deck (make the order of cards random).
ï	A method is needed that will be to draw from the deck 
	(return next cardÖ assuming deck is shuffled).
ï	Build a method to denote how many cards are remaining to be drawn.

	 * 
	 * 
	 */
	int deckLength = 52;
	public ArrayList<String> newDeck() {
		ArrayList<String> deck = new ArrayList<String>();
		String card = null;
		for (int i = 0;i < suit.length; i++){
			int n = 1;
			while(n<rank.length)
				card = Integer.toString(rank[n]) + suit[i];
				deck.add(card);
				n = n + 1;
			
		}
	return deck;
	}  
	
	public ArrayList<String> deckShuffler(ArrayList<String> unshuffled) {
		ArrayList<String> newDeck = new ArrayList<String>();
		int i = 52;
		int n = 0;
				
		while (unshuffled.size()!=0){
			Random randInt = new Random();
			Random b = randInt;
				newDeck.add(unshuffled.get(randInt.nextInt(i)));
				unshuffled.remove(b);
				n = n + 1;
				i = i - 1;
		}
				
		return newDeck;
				
				
				
	}

	protected String[] hand(ArrayList<String> shuffled_deck){
		String[] hand = new String[5];
		for(int i = 0;i < 5;i++){
			hand[i] = shuffled_deck.get(i);
			shuffled_deck.remove(i);
			
			
		}
		return hand;
	}

	private void cards_remaining(ArrayList<Integer> newDeck){
		System.out.println("There are " + newDeck.size() + "cards remaining");
	}
}

	
	

