package com.step63n1.view.impl;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.step63n1.view.BlackJackInputView;

@Component
public class BlackJackInputViewImpl implements BlackJackInputView{
	
	private int numDecks;
	private boolean doesDealerStandSoft17;
	private double blackJackWager;
	
	public int getNumDecks(){
		return numDecks;
	}

	public boolean getDoesDealerStandSoft17(){
		return doesDealerStandSoft17;
	}
		
	public double getBlackJackWager(){
		return blackJackWager;
	}
	
	public void askRuleSpecifications() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("# of decks: ");
		numDecks = scanner.nextInt();
		System.out.println("does Dealer Stand Soft 17?: ");
		doesDealerStandSoft17 = scanner.nextBoolean();
		System.out.println("What is the blackjack wager:");
		blackJackWager = scanner.nextDouble();
	}
	
	

}
