package MainPackage;

import java.util.Arrays;


public class Hand extends Deck {
	
	/*A “hand” is an object.
	Each hand is an array of cards that are drawn from the deck.
	A common (static) method is needed to judge a single hand.  
	A similar method (overloaded) will be needed to judge multiple hands 
	(you pass in array of hands, it passes back the winner).
	*/


	//*******************THIS IS THE SEPERATOR*************
	protected static String[] handEvalSuit(String[] hand){
		String[] suits = new String[5];
		for(int n = 0; n < hand.length ; n++) {
			String card = hand[n];
			String[] vals = card.split("D-S", 14);
			String valsSuit = String.valueOf(vals[0]);
			suits[n] = valsSuit;
	
		}
	return suits;
	}
	//*****************************************************		
			protected static Integer[] handEvalRank(String[] hand){
				Integer[] rank = new Integer[5];
				for(int n = 0; n < hand.length ; n++) {
					String card = hand[n];
					String[] vals = card.split("D-S", 14);
					Integer valsRank = Integer.valueOf(vals[1]);			
					rank[n] = valsRank;
				
					
				}
		return rank;
			}
			
					
			// Checks if Hand has No Pair
			public static boolean NoPair(Integer[] rank) {
				int sum= 0;
				for(int i= 0; i < 5; i++) {
					if (rank[i] == rank[i + 1]){
						sum =+ 1;
					}
				}
				
				if(sum == 0)
				{
					return true;
				}
					else
					{
						return false;
					}
				}
			
			// Checks if Hand has One Pair
			public static boolean OnePair(Integer[] rank) {
				int sum= 0;
				for(int i= 0; i < 5; i++) {
					if (rank[i] == rank[i + 1]){
						sum =+ 1;
					}
				}
				
				if(sum == 1)
				{
					return true;
				}
					else
					{
						return false;
					}
				}
			
			//Checks if Hand is Three of a Kind
			public static boolean ThreeKind(String[] suit) {
				int sum= 0;
				for(int i= 0; i < 5; i++) {
					if (suit[i] == suit[i + 1]){
						sum =+ 1;
					}
				}
				
				if(sum == 3)
				{
					return true;
				}
					else
					{
						return false;
					}
				}
			
			// Checks if Hand is a Straight
			public static boolean Straight(Integer[] rank) {
				int sum= 0;
				
				//Sorts Card's Rank, low - high
				Arrays.sort(rank);
				
				for(int i= 0; i < 5; i++){
					if (rank[i] + 1 == rank[i + 1]) {
						sum += 1;
					}
				}
				
				if (sum == 5) {
					return true;
				}
				else {
					return false;
				}
			}
			
			//Checks if Hand is a Flush
			public static boolean Flush(String[] suit) {
				int sum= 0;
				for(int i= 0; i < 5; i++){
					if (suit[i] == suit[i + 1]) {
						sum += 1;
					}
				}
				
				if (sum == 1) {
					return true;
				}
				else {
					return false;
				}
			}
			
			//Checks if Hand is a Full House	
			public static boolean FullHouse(Integer[] rank) {
				int sum = 0;
				
				Arrays.sort(rank);
				
				// Checks if 1-3 cards are the same
				for(int i=0; i < 3; i++){
					if(rank[i] == rank[i+1]){
						sum+=1;
					}
				}
				
				// Checks if 4-5 cards are the same
				for(int i=4; i < 5; i++){
					if(rank[i] == rank[i+1]){
						sum+=1;
					}
				}
				
				if (sum == 5) {
					return true;
				}
				else {
					return false;
				}
			}


			//Checks if Hand is Four of a Kind
			public static boolean FourKind(String[] rank) {
				int sum= 0;
				for(int i= 0; i < 5; i++) {
					if (rank[i] == rank[i + 1]){
						sum =+ 1;
					}
				}
				
				if(sum == 4)
				{
					return true;
				}
					else
					{
						return false;
					}
				}
				
			//Checks if Hand is Straight Flush
			public static boolean StraightFlush(String[] rank, Integer[] suit) {
				if (Straight(suit) == true & Flush(rank) == true) {
					return true;
				}
				else {
					return false;
				}
				
				
			}

			//Checks if Hand is a Royal Flush
			public static boolean RoyalFlush(String[] suit, Integer[] rank) {
				// 10 + Jack + Queen + King + Ace = 60 (rank)
				int rankTotal = 0;
				int suitTotal = 0;
				
				for(int i= 0; i < 5; i++){
					rankTotal += rank[i];
					}
				
				for(int i= 0; i < 5; i++){
					if (suit[i] == suit[i + 1]) {
						suitTotal += 1;
					}
				}
				
				if(rankTotal == 60 && suitTotal == 5) {
					return true;
				}
				else {
					return false;
				}
				
			}

			//NEED OVERLOAD TO JUDGE MULTIPLE HANDS
			
			public static int Score(String[] hand1){
				int score= 0;
				String[] suit = handEvalSuit(hand1);
				Integer[] rank = handEvalRank(hand1);
				
				if(RoyalFlush(suit, rank) == true) {
					score += 8;
				}
				if(StraightFlush(suit, rank) == true) {
					score += 7;
				}
				if(FourKind(suit) == true) {
					score += 6;
				}
				if(FullHouse(rank) == true) {
					score += 5;
				}
				if(Flush(suit) == true) {
					score += 4;
				}
				if(Straight(rank) == true) {
					score += 3;
				}
				if(ThreeKind(suit) == true) {
					score += 2;
				}
				if(OnePair(rank) == true) {
					score += 1;
				}
				else{
					score += 0;
				}
				
				return score;
			}
			
			// Finds winner of different hands
			public static String[] overload(String[] hand1, String[] hand2){
				if (Score(hand1) > Score(hand2)){
					return hand1;
				}
				else {
					return hand2;
				}
			
			}
}
			
			
			
			
