package com.maple.dice;

import java.util.Random;

public class Dice {
	
	private Random random;
	private int diceNum;

	public int getDiceNum() {
		diceNum = random.nextInt(6) + 1;
		return diceNum;
	}

	
}
