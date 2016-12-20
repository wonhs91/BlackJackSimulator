package com.step63n1.model.blackJack;


public class BlackJackTableSettings {

	private double minBet;
	private int maxNumPlayers;

	public double getMinBet() {
		return minBet;
	}

	public void setMinBet(double minBet) {
		this.minBet = minBet;
	}

	public int getMaxNumPlayers() {
		return maxNumPlayers;
	}

	public void setMaxNumPlayers(int numPlayers) {
		if (numPlayers <= 0){
			numPlayers = 1;
		}
		this.maxNumPlayers = numPlayers;
	}
	
	
	
}
