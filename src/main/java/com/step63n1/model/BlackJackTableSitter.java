package com.step63n1.model;

import java.util.ArrayList;
import java.util.List;

import com.step63n1.model.blackJack.TrumpCard;
import com.step63n1.model.enums.Rank;

public class BlackJackTableSitter {

	protected List<TrumpCard> hands;

	private boolean isDealer;
	protected double originalAsset;
	protected double earnedMoney;
	
	
	protected BlackJackTableSitter(double originalAsset, boolean isDealer){
		this.hands = new ArrayList<TrumpCard>();
		
		this.originalAsset = originalAsset;
		this.isDealer = isDealer;
		this.earnedMoney = 0;
	}
	
	
	public List<TrumpCard> getHands() {
		return hands;
	}

	public void setHands(List<TrumpCard> hands) {
		this.hands = hands;
	}
	
	public void addHand(TrumpCard card){
		this.hands.add(card);
	}
	
	public double getAsset() {
		return originalAsset;
	}

	public void setAsset(double originalAsset) {
		this.originalAsset = originalAsset;
	}

	public boolean isDealer() {
		return isDealer;
	}

	public void setDealer(boolean isDealer) {
		this.isDealer = isDealer;
	}
	
	public double getEarnedMoney() {
		return earnedMoney;
	}

	public void setEarnedMoney(double earnedMoney) {
		this.earnedMoney = earnedMoney;
	}

}
