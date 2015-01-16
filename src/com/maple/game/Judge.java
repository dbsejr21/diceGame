package com.maple.game;

import java.util.ArrayList;
import java.util.List;

import com.maple.player.Player;

public class Judge {

	private int rollNumber;
	private List<Player> listPlayer;
	private Recorder recorder;

	public Judge(List<Player> listPlayer, int rollNumber) {

		recorder = new Recorder(listPlayer);
		this.listPlayer = listPlayer;
		this.rollNumber = rollNumber;
	}

	public Judge() {
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setListPlayer(List<Player> listPlayer) {
		this.listPlayer = listPlayer;
	}

	public void manageGame() {

		for (int i = 0; i < rollNumber; i++) {
			rollDice();
			recorder.printStatusOnce();
		}
		recorder.printWinner(chooseWinner());
//		System.out.println("zzzzzzzzzz");
	}

	private void rollDice() {
		for (Player player : listPlayer) {
			player.rollDice();
		}
	}

	private Player chooseWinner() {
		Player winner = new Player();
		winner.setSumScore(0);

		for (Player player : listPlayer) {
			if (player.getSumScore() > winner.getSumScore()) {
				winner = player;
			} else if (player.getSumScore() == winner.getSumScore()){
				winner.setName("비김");
//				winner = null;
			}
		}
		return winner;
	}
}
