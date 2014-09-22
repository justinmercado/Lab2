package MainPackage;

public class Card {
	protected static int rank[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	protected static String suit[] = { "H", "S", "C", "D" };

	public Card(int[] rank, String[] suit) {
		Card.rank = rank;
		Card.suit = suit;
	}

}
