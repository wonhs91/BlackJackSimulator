package com.step63n1.model;

import com.step63n1.model.blackJack.TrumpCard;

public interface BlackJackPlayerChoices {

	public void stand();
	public void hit(TrumpCard card, int whichHand);
	public void doubleDown();
}
