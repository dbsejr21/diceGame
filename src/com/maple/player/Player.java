package com.maple.player;

import com.maple.dice.Dice;

public class Player {

	private String name;
	protected int sumScore;

	private Dice dice;

	public Player(String name, Dice dice) {
		this.name = name;
		this.dice = dice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSumScore() {
		return sumScore;
	}

	// TODO Test를 위해 임시로 생성한 Get 메소드임. PlayerTest, FraudPlayerTest가 정상적으로 완료되면
	// 삭제예정
	public Dice getDice() {
		return dice;
	}

	// TODO Test를 위해 임시로 생성한 Set 메소드임. PlayerTest, FraudPlayerTest가 정상적으로 완료되면
	// 삭제예정
	public void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}

	public void rollDice() {
		sumScore += dice.rollDice();
	}

}
