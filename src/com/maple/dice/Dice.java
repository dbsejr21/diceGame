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

	// TODO Test를 위해 임시로 생성한 Set 메소드임. PlayerTest, FraudPlayerTest가 정상적으로 완료되면 삭제예정
	public void setDiceNum(int diceNum) {
		this.diceNum = diceNum;
	}

	// TODO Test를 위해 임시로 생성한 Get 메소드임. PlayerTest, FraudPlayerTest가 정상적으로 완료되면 삭제예정
	public int getDiceNum() {
		return diceNum;
	}
}
