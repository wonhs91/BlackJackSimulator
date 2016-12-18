package com.step63n1.service.dao;

import com.step63n1.model.blackJack.TrumpCard;

public interface TrumpDecksDao {
	void insertCard();
	void removeCard();
	public TrumpCard drawCard();
	
	
}
