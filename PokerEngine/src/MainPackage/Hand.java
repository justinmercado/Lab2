package MainPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Hand extends Deck{
	
	Deck hand1 = new Deck();
	Deck hand2 = new Deck();
	
		
	
	// Checks if Hand has No Pair
	public static boolean NoPair(Card[] hand) {
		int sum= 0;
		for(int i= 0; i < 5; i++) {
			if (hand.rank[i] == hand.rank[i + 1]){
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
	public static boolean OnePair(Card[] hand) {
		int sum= 0;
		for(int i= 0; i < 5; i++) {
			if (hand.rank[i] == hand.rank[i + 1]){
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
	public static boolean ThreeKind(Card[] hand) {
		int sum= 0;
		for(int i= 0; i < 5; i++) {
			if (hand.rank[i] == hand.rank[i + 1]){
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
	public static boolean Straight(Card[] hand) {
		int sum= 0;
		
		//Sorts Card's Rank, low - high
		Arrays.sort(hand);
		
		for(int i= 0; i < 5; i++){
			if (hand.rank[i] + 1 == hand.rank[i + 1]) {
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
	public static boolean Flush(Card[] hand) {
		int sum= 0;
		for(int i= 0; i < 5; i++){
			if (hand.suit[i] == hand.suit[i + 1]) {
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
	public static boolean FullHouse(Card[] hand) {
		int sum = 0;
		
		Arrays.sort(hand);
		
		if (hand.rank[1] == hand.rank[2] == hand.rank[3] && hand.rank[4] == hank.rank[5]) {
			return true;
		}
		else {
			return false;
		}
	}

	//Checks if Hand is Four of a Kind
	public static boolean FourKind(Card[] hand) {
		int sum= 0;
		for(int i= 0; i < 5; i++) {
			if (hand.rank[i] == hand.rank[i + 1]){
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
	public static boolean StraightFlush(Card[] hand) {
		if (Straight(hand) == true & Flush(hand) == true) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	//Checks if Hand is a Royal Flush
	public static boolean RoyalFlush(Card[] hand) {
		// 10 + Jack + Queen + King + Ace = 60 (rank)
		int rank= 0;
		int suit= 0;
		
		for(int i= 0; i < 5; i++){
			rank += hand.rank[i];
			}
		
		for(int i= 0; i < 5; i++){
			if (hand.suit[i] == hand.suit[i + 1]) {
				suit += 1;
			}
		}
		
		if(rank== 60 && suit == 5) {
			return true;
		}
		else {
			return false;
		}
		
	}

	
	
	
	
	
	//*******DON'T DELETE THIS TO BOTTOM******************************
	
	// Calculates the score of a hand
	public static int Score(Card[] hand1){
		int score= 0;
		
		if(RoyalFlush(hand1) == true) {
			score += 8;
		}
		if(StraightFlush(hand1) == true) {
			score += 7;
		}
		if(FourKind(hand1) == true) {
			score += 6;
		}
		if(FullHouse(hand1) == true) {
			score += 5;
		}
		if(Flush(hand1) == true) {
			score += 4;
		}
		if(Straight(hand1) == true) {
			score += 3;
		}
		if(ThreeKind(hand1) == true) {
			score += 2;
		}
		if(OnePair(hand1) == true) {
			score += 1;
		}
		else{
			score += 0;
		}
		
		return score;
	}
	
	// Finds winner of different hands
	public static Card[] overload(Card[] hand1, Card[] hand2){
		if (Score(hand1) > Score(hand2)){
			return hand1;
		}
		else {
			return hand2;
		}
	}
	}


