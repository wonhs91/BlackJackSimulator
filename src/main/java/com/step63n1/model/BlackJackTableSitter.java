package com.step63n1.model;

import java.util.ArrayList;
import java.util.List;

import com.step63n1.model.blackJack.Hand;
import com.step63n1.model.blackJack.TrumpCard;

public class BlackJackTableSitter {

	protected List<Hand> hands;
	
	protected int whichHand;

	private boolean isDealer;
	protected double originalAsset;
	protected double totalAsset;
	
	
	protected BlackJackTableSitter(double originalAsset, boolean isDealer){
		this.hands = new ArrayList<Hand>();
		
		this.originalAsset = originalAsset;
		this.isDealer = isDealer;
		this.totalAsset = originalAsset;
	}
	
	
	public List<Hand> getHands() {
		return hands;
	}

	public void setHands(List<Hand> hands) {
		this.hands = hands;
	}
	
	public void addHand(TrumpCard card, int whichHand){
		this.hands.get(whichHand).add(card);;
	}
	
	public void addHand(TrumpCard card){
		this.hands.get(whichHand).add(card);;
	}
	
	public double getOriginalAsset() {
		return originalAsset;
	}

	public void setOriginalAsset(double originalAsset) {
		this.originalAsset = originalAsset;
	}

	public boolean isDealer() {
		return isDealer;
	}

	public void setDealer(boolean isDealer) {
		this.isDealer = isDealer;
	}
	
	public double getTotalAsset() {
		return totalAsset;
	}
	
	public void winBet(double bet){
		totalAsset += bet;
	}
	
	public void loseBet(double bet){
		totalAsset -= bet;
	}
	
	public int getWhichHand() {
		return whichHand;
	}


	public void setWhichHand(int whichHand) {
		this.whichHand = whichHand;
	}

}
