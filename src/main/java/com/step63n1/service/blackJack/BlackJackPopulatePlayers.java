package com.step63n1.service.blackJack;

import java.util.List;

import com.step63n1.model.BlackJackTableSitter;
import com.step63n1.model.blackJack.BlackJackTableSettings;

public interface BlackJackPopulatePlayers {
	
	public List<BlackJackTableSitter> populatePlayers(BlackJackTableSettings blackJackTableSettings);

}
