package com.step63n1.model.blackJack;

import java.util.ArrayList;
import java.util.List;

import com.step63n1.model.BlackJackPlayerChoices;

public class Hand implements BlackJackPlayerChoices{
	private List<TrumpCard> hand;

	private double currentBet;
	
	public void add(TrumpCard card){
		hand.add(card);
	}
	
	public List<TrumpCard> getHand(){
		return hand;
	}
	
	public void setHand(List<TrumpCard> hand) {
		this.hand = hand;
	}
	
	public void stand() {
		
	}

	public void hit(TrumpCard card, int whichHand) {
		// TODO Auto-generated method stub
		this.hand.add(card);
	}

	public void doubleDown() {
		// TODO Auto-generated method stub
		this.currentBet = this.currentBet *2;
	}

	public List<Hand> split() {
		// TODO Auto-generated method stub
		List<Hand> splitHands = new ArrayList<Hand>();
		if (hand.size() == 2){
			for (TrumpCard card : hand){
				Hand hand = new Hand();
				hand.add(card);
				splitHands.add(hand);
			}
		}
		return splitHands; 
	}
}
