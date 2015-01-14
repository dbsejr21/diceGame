package com.maple.dice;

import java.util.Random;

public class Dice {
	
	private static Random random;
	private int diceNum;
	
	public Dice() {
		random = new Random();
	}
	
	public int rollDice() {
		diceNum = random.nextInt(6) + 1;
		return diceNum;
	}
}
