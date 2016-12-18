package com.step63n1.model;

import java.util.ArrayList;
import java.util.List;

public class Decks {
	
	protected List<Card> decks;
	protected int startingNumDeck;
	
	public List<Card> getDecks(){
		return decks;
	}
	
	public void setDecks(List<Card> decks){
		this.decks = decks;

	}
	
	public void setDecks(int startingNumDecks, List<Deck> decks){
		List<Card> cards = new ArrayList<Card>();
		this.startingNumDeck = startingNumDecks;

		for (Deck deck : decks){
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
