package com.step63n1.service.blackJack;

import java.util.List;

import com.step63n1.model.BlackJackTableSitter;
import com.step63n1.model.blackJack.BlackJackHouseRules;
import com.step63n1.model.blackJack.TrumpDecks;

public interface BlackJackPlay{
	
	public void play(BlackJackHouseRules blackJackHouseRules, TrumpDecks trumpDecks, List<BlackJackTableSitter> blackJackTableSittings);

}
