package com.step63n1.service.helper;

import java.util.Collections;
import java.util.List;

import com.step63n1.model.Card;
import com.step63n1.model.Decks;

public class CardShuffleHelper {

	public static List<Card> shuffleCards(List<Card> cards) {
		Collections.shuffle(cards);
		return cards;
	}

	public static Decks shuffleDecks(Decks decks) {
		List<Card> cards = decks.getDecks();
		Collections.shuffle(cards);
		decks.setDecks(decks.getStartingNumDeck(), cards);
		return decks;
	}

}
