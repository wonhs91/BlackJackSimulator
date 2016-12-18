package com.step63n1.model.blackJack;

import com.step63n1.model.BlackJackTableSitter;

public class BlackJackDealer extends BlackJackTableSitter{

	public BlackJackDealer(double originalAsset) {
		super(originalAsset, true);
	}
	
	public BlackJackDealer(){
		super(Double.MAX_VALUE, true);
	}
}
