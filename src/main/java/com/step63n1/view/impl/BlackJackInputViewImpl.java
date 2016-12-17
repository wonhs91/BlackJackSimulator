package com.step63n1.view.impl;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.step63n1.view.BlackJackInputView;

@Component
public class BlackJackInputViewImpl implements BlackJackInputView{
	
	private int numDecks;
	private boolean doesDealerStandSoft17;
	private double blackJackWager;
	
	private int numPlayers;
	private double minBet;
	
	
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
	
	public void askSettingsSpecifications(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("# of players: ");
		numPlayers = scanner.nextInt();
		System.out.println("minimum Bet: ");
		minBet = scanner.nextDouble();
		
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public double getMinBet() {
		return minBet;
	}
	
	

}
