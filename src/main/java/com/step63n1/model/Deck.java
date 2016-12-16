package com.step63n1.model;

import java.util.List;

public class Deck {
	
	protected List<Card> deck;
	protected int numCard;
	
	public List<Card> getDeck(){
		return deck;
	}
	
	public void setDeck(List<Card> deck){
		this.deck = deck;
	}
	
	public int getNumCard(){
		return numCard;
	}
	
}
