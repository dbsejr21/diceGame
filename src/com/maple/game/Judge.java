package com.maple.game;

import java.util.ArrayList;
import java.util.List;

import com.maple.player.Player;

public class Judge {

	private int gameRound;
	private List<Player> listPlayer;
	private Recorder recorder;

	public Judge() {
		listPlayer = new ArrayList<Player>();
		recorder = new Recorder(listPlayer);
	}

	public void setGameRound(int gameRound) {
		this.gameRound = gameRound;
	}

	public void registerPlayer(Player player) {
		listPlayer.add(player);
	}

	public void manageGame() {

		for (int i = 0; i < gameRound; i++) {
			beforePlayOneRound();
			playOneRound();
			recorder.printOneRound();
		}
		recorder.printWinner(chooseWinner());
	}

	private void beforePlayOneRound() {
		for (Player player : listPlayer) {
			player.beforeRollDice();
		}
	}

	private void playOneRound() {
		for (Player player : listPlayer) {
			player.rollDice();
		}
	}

	private Player chooseWinner() {
		Player winner = new Player();

		for (Player player : listPlayer) {
			if (player.getSumScore() > winner.getSumScore()) {
				winner = player;
			} else if (player.getSumScore() == winner.getSumScore()) {
				return null;
			}
		}
		return winner;
	}
}
