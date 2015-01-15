package com.maple.player;

import com.maple.dice.FraudDice;

public class FraudPlayer extends Player {
	
	private FraudDice fraudDice;
	private Player enemy;
		
	public FraudPlayer(String name, FraudDice fraudDice, Player enemy) {
		super(name, fraudDice);
		this.fraudDice = fraudDice;
		this.enemy = enemy;
	}
	
	public void beforeRollDice() {
		
		System.out.println(this.getSumScore() + "   " + enemy.getSumScore());
		
		if ( this.getSumScore() < enemy.getSumScore() ) {
			System.out.println("Strong");
			fraudDice.setMode(FraudDice.Mode.STRONG);
		} else if ( this.getSumScore() < enemy.getSumScore() ) {
			System.out.println("WEAK");
			fraudDice.setMode(FraudDice.Mode.WEAK);
		} else {
			System.out.println("NORMAL");
			fraudDice.setMode(FraudDice.Mode.NORMAL);
		}
		
	}

	@Override
	public void rollDice() {
		beforeRollDice();
		super.rollDice();
	}
	
	

}
