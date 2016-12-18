package com.step63n1.model.blackJack;


public class BlackJackTableSettings {

	private double minBet;
	private int numPlayers;

	public double getMinBet() {
		return minBet;
	}

	public void setMinBet(double minBet) {
		this.minBet = minBet;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		if (numPlayers <= 0){
			numPlayers = 1;
		}
		this.numPlayers = numPlayers;
	}
	
	
	
}
