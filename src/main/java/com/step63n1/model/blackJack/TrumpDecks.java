package com.step63n1.model.blackJack;

import java.util.ArrayList;
import java.util.List;

public class TrumpDecks {
	private List<TrumpCard> decks;
	private int startingNumDeck;
	
	private int numRemainingCard;
	private int numPlayedCard;
	


	public int getNumRemainingCard(){
		return numRemainingCard;
	}
	
	public int getNumPlayedCard(){
		return numPlayedCard;
	}
	
	public void setNumPlayedCard(int numPlayedCard){
		this.numPlayedCard = numPlayedCard;
	}
	
	public List<TrumpCard> getDecks(){
		return decks;
	}
	
	public void setDecks(List<TrumpCard> decks){
		this.decks = decks;

	}
	
	public void setDecks(int startingNumDecks, List<TrumpDeck> decks){
		List<TrumpCard> cards = new ArrayList<TrumpCard>();
		this.startingNumDeck = startingNumDecks;

		for (TrumpDeck deck : decks){
			cards.addAll(deck.getDeck());
		}
		
		this.decks = cards;
		this.startingNumDeck = decks.size();
	}
	
	public int getStartingNumDeck(){
		return startingNumDeck;
	}
	
	public void setStartingNumDeck(int startingNumDeck){
		this.startingNumDeck = startingNumDeck;
	}

	
}
