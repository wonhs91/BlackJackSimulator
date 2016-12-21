package com.step63n1.model.blackJack;

import java.util.List;

import com.step63n1.model.BlackJackTableSitter;

public class BlackJackDealer extends BlackJackTableSitter{

	private double bustRate;
	private double blackJackRate;
	private double seventeenRate;
	private double eighteenRate;
	private double nineteenRate;
	private double twentyRate;
	

	
	public BlackJackDealer(double originalAsset) {
		super(originalAsset, true);
	}
	
	public BlackJackDealer(){
		super(Double.MAX_VALUE/2, true);
	}
	
	public TrumpCard getFirstCard() {
		return hands.get(0);
	}

	public double getBustRate() {
		return bustRate;
	}

	public void setBustRate(double bustRate) {
		this.bustRate = bustRate;
	}

	public double getBlackJackRate() {
		return blackJackRate;
	}

	public void setBlackJackRate(double blackJackRate) {
		this.blackJackRate = blackJackRate;
	}

	public double getSeventeenRate() {
		return seventeenRate;
	}

	public void setSeventeenRate(double seventeenRate) {
		this.seventeenRate = seventeenRate;
	}

	public double getEighteenRate() {
		return eighteenRate;
	}

	public void setEighteenRate(double eighteenRate) {
		this.eighteenRate = eighteenRate;
	}

	public double getNineteenRate() {
		return nineteenRate;
	}

	public void setNineteenRate(double nineteenRate) {
		this.nineteenRate = nineteenRate;
	}

	public double getTwentyRate() {
		return twentyRate;
	}

	public void setTwentyRate(double twentyRate) {
		this.twentyRate = twentyRate;
	}
	
}
