package com.step63n1.model;

public class CardPlayer {

	private double originalAsset;
	private boolean isDealer;
	
	protected CardPlayer(double originalAsset, boolean isDealer){
		this.originalAsset = originalAsset;
		this.isDealer = isDealer;
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
	
	
}
