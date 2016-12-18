package com.step63n1.model.blackJack;

import java.util.List;

public class TrumpDeck {

	protected List<TrumpCard> deck;
	protected int numCard;
	
	public List<TrumpCard> getDeck(){
		return deck;
	}
	
	public void setDeck(List<TrumpCard> deck){
		this.deck = deck;
	}
	
	public int getNumCard(){
		return numCard;
	}
}
