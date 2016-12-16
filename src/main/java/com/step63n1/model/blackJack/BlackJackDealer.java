package com.step63n1.model.blackJack;

import com.step63n1.model.CardPlayer;

public class BlackJackDealer extends CardPlayer{

	BlackJackDealer(double originalAsset) {
		super(originalAsset, true);
	}
	
	BlackJackDealer(){
		super(Double.MAX_VALUE, true);
	}
}
