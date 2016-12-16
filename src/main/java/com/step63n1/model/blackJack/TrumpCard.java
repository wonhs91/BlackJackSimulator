package com.step63n1.model.blackJack;

import com.step63n1.model.Card;
import com.step63n1.model.enums.Rank;
import com.step63n1.model.enums.Suit;

public class TrumpCard extends Card{

	private Suit suit;
	private Rank rank;
	
	public TrumpCard(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
	}
	
	public Suit getSuit(){
		return suit;
	}
	
	public void setSuit(Suit suit){
		this.suit = suit;
	}
	
	public Rank getRank(){
		return rank;
	}
	
	public void setRank(Rank rank){
		this.rank = rank;
	}
	
}
