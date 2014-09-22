package MainPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class CoryHand extends Deck {
	
	/*A �hand� is an object.
	Each hand is an array of cards that are drawn from the deck.
	A common (static) method is needed to judge a single hand.  
	A similar method (overloaded) will be needed to judge multiple hands 
	(you pass in array of hands, it passes back the winner).
	*/

	
	protected static void handScores(){
		Integer royalFlush = 10;
		Integer straightFlush = 9;
		Integer fourOfAKind = 8;
		Integer fullHouse = 7;
		Integer flush = 6;
		Integer straight = 5;
		Integer threeOfAKind = 4;
		Integer twoPair = 3;
		Integer onePair = 2;
		Integer highCard = 1;
									
	}
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
			public static boolean FullHouse(String[] rank) {
				int sum = 0;
				
				Arrays.sort(rank);
				
				if (rank[1] = rank[2] = rank[3] && rank[4] = rank[5]) {
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
			
			}