package com.step63n1.model;

public class TableSettings {
	
	private int numPlayers;

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
