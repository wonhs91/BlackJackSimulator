package com.step63n1.model.blackJack;

import java.util.ArrayList;
import java.util.List;

import com.step63n1.model.Card;
import com.step63n1.model.Deck;
import com.step63n1.model.Decks;

public class TrumpDecks extends Decks{


	
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
}
