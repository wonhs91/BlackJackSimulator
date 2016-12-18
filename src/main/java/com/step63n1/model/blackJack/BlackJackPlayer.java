package com.step63n1.model.blackJack;

import java.util.List;

import com.step63n1.model.BlackJackTableSitter;

public class BlackJackPlayer extends BlackJackTableSitter{
	
	private List<TrumpCard> hands;

	private double winRate;
	private double lossRate;
	private double pushRate;
	private double blackJackRate;
	
	private double startingBetAmount;
	
	private double earnedMoney;

	public BlackJackPlayer(double originalAsset, double startingBetAmount) {
		super(originalAsset, false);
		this.startingBetAmount = startingBetAmount;
	}
	
	public double getWinRate() {
		return winRate;
	}

	public void setWinRate(double winRate) {
		this.winRate = winRate;
	}

	public double getLossRate() {
		return lossRate;
	}

	public void setLossRate(double lossRate) {
		this.lossRate = lossRate;
	}

	public double getPushRate() {
		return pushRate;
	}

	public void setPushRate(double pushRate) {
		this.pushRate = pushRate;
	}

	public double getBlackJackRate() {
		return blackJackRate;
	}

	public void setBlackJackRate(double blackJackRate) {
		this.blackJackRate = blackJackRate;
	}

	public double getEarnedMoney() {
		return earnedMoney;
	}

	public void setEarnedMoney(double earnedMoney) {
		this.earnedMoney = earnedMoney;
	}

	public List<TrumpCard> getHands() {
		return hands;
	}

	public void setHands(List<TrumpCard> hands) {
		this.hands = hands;
	}
	


}
